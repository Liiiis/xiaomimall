package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.catge;
import cn.edu.guet.xiaomimall.bean.datasale;
import cn.edu.guet.xiaomimall.bean.orderlist;
import cn.edu.guet.xiaomimall.bean.shopingcar;
import cn.edu.guet.xiaomimall.service.orderlistservice;
import cn.edu.guet.xiaomimall.service.orderproservice;
import cn.edu.guet.xiaomimall.service.productservice;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/18/19:06
 * @Description:
 */
@RestController
public class orderlistcontroller {

    @Autowired
    private orderlistservice orderlistservice;

    @Autowired
    private productservice productservice;

    @Autowired
    private orderproservice orderproservice;

    @RequestMapping("/addorderlist")
    public String addorderlist(@RequestBody Map<Object,Object> datas){
        String totalPrice = String.valueOf(datas.get("totalPrice"));
        orderlist orderlist = new orderlist();
        String ordernumber = String.valueOf(System.currentTimeMillis());
        Object getShoppingCart = new ArrayList<>();
         getShoppingCart = datas.get("getShoppingCart");
        String b = String.valueOf(getShoppingCart);


        List<shopingcar> shoping = new ArrayList<>();
        shoping = (List<shopingcar>) datas.get("Shoppingcar");
        System.out.println(shoping);
        ObjectMapper mapper = new ObjectMapper();
        List<shopingcar> list = mapper.convertValue(shoping, new TypeReference<List<shopingcar>>() { });

        Map<String, Integer> nameAndAgeList = list.stream().collect(Collectors.toMap(shopingcar::getName, shopingcar::getNum));
        for (Map.Entry<String, Integer> map:nameAndAgeList.entrySet()) {
            productservice.updata(map.getKey(),map.getValue()); //减去商品库存
        }

        Map<Integer,String> orderpro = list.stream().collect(Collectors.toMap(shopingcar::getId, shopingcar::getCategory));
        for (Map.Entry<Integer,String> map:orderpro.entrySet()) {
            orderproservice.addorderpro(ordernumber,map.getKey(),map.getValue());  //添加关系表
        }

            orderlist.setOrdernumber(ordernumber);
            orderlist.setSumPrice(totalPrice);
            orderlist.setShoppingcar(b);
        int a = orderlistservice.addorder(orderlist);  //订单
        if (a>0){
            return "已成功下单";
        }else{
            return "下单失败";
        }
    }

    @RequestMapping("/selectsumPrice")
    public List<datasale> selectsumPrice(){
        return orderlistservice.selectsumPrice();
    }

    @RequestMapping("/selectallorlist")
    public List<orderlist> selectallorlist(){
        return orderlistservice.seleceorderlist();
    }

    @RequestMapping("/selectbyidorder")
    public orderlist selectbyidorder(int id){
        return orderlistservice.selectbyidorder(id);
    }

    @RequestMapping("/updataorder")
    public String updataorder(@RequestBody orderlist orderlist){
        int a = orderlistservice.updataorder(orderlist);
        if (a>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("/selectordervague")
    public List<orderlist> selectordervague(@RequestParam String msg,@RequestParam int currentPage,@RequestParam int pageSize){
        return orderlistservice.selectvague(msg,(currentPage-1)*pageSize,pageSize);
    }

    @RequestMapping("/delorderlist")
    public String delorderlist(@RequestBody String ordernumber){
        int del = orderlistservice.delorder(ordernumber);
        if (del>0){
            int a = orderproservice.delorpro(ordernumber);
                return "退款成功";
        }else {
            return "退款失败";
        }
    }

    @RequestMapping("/getpageorderlist") //分页查询
    public List<orderlist> getpageorderlist(@RequestParam int currentPage, @RequestParam int pageSize){
        return orderlistservice.getpageorderlist((currentPage-1)*pageSize,pageSize);
    }

    @RequestMapping("/getalltotal")
    public int alltotal(){
        return orderlistservice.totalorlist();
    }

    @RequestMapping("/selectvaguetotal")
    public int selectvaguetotal(@RequestParam String msg){
        return orderlistservice.selectvaguetotal(msg);
    }

}

package cn.edu.guet.xiaomimall.controller;

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
            productservice.updata(map.getKey(),map.getValue());
        }

        Map<Integer,String> orderpro = list.stream().collect(Collectors.toMap(shopingcar::getId, shopingcar::getCategory));
        for (Map.Entry<Integer,String> map:orderpro.entrySet()) {
            orderproservice.addorderpro(ordernumber,map.getKey(),map.getValue());
        }

            orderlist.setOrdernumber(ordernumber);
            orderlist.setSumPrice(totalPrice);
            orderlist.setShoppingcar(b);
        int a = orderlistservice.addorder(orderlist);
        if (a>0){
            return "已成功下单";
        }else{
            return "下单失败";
        }
    }
}

package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.shopingcar;
import cn.edu.guet.xiaomimall.service.shopcarservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/13/22:51
 * @Description:
 */
@RestController
public class shopcarcontroller {

    @Autowired
    private shopcarservice shopcarservice;

    @RequestMapping("/addshoping")
    public String addshop(@RequestBody shopingcar shopingcar){
        int add = shopcarservice.addshopcar(shopingcar);
        if (add>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @RequestMapping("/getshoppingcar")
    public List<shopingcar> getshoppingcar(){
        return shopcarservice.getshoppingcar();
    }

    @RequestMapping("/delectshoppingcar")
    public String delectshoppingcar(){
        int del = shopcarservice.delete();
        if (del>0){
            return "已结算";
        }else {
            return "结算失败";
        }
    }

}

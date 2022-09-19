package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.catge;
import cn.edu.guet.xiaomimall.service.orderproservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/19/17:00
 * @Description:
 */
@RestController
public class orderprocontroller {

    @Autowired
    private orderproservice orderproservice;

    @RequestMapping("/selectgeshu")
    public List selectgeshu(){
        return orderproservice.select();
    }

    @RequestMapping("/selececateory")
    public List selececateory(){
        return orderproservice.selececateory();
    }

    @RequestMapping("/selectbing")
    public List<catge> selectbing(){
        return orderproservice.seletebing();
    }

}

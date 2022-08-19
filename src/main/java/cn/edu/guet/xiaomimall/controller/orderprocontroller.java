package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.service.orderproservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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

}

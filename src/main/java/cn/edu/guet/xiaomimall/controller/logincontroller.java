package cn.edu.guet.xiaomimall.controller;
import cn.edu.guet.xiaomimall.bean.admin;
import cn.edu.guet.xiaomimall.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/22/18:25
 * @Description:
 */
@RestController
public class logincontroller {
    
    @Autowired
    private loginservice loginservice;

    @PostMapping("/login")
    public admin test(@RequestBody admin admin){
        admin a = loginservice.login(admin);
        System.out.println(a);
        if (a!=null){
            return a;
        }else {
            return null;
        }
    }
}

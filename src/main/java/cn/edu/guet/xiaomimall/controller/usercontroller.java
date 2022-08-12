package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.admin;
import cn.edu.guet.xiaomimall.bean.product;
import cn.edu.guet.xiaomimall.bean.user;
import cn.edu.guet.xiaomimall.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/01/16:15
 * @Description:
 */
@RestController
public class usercontroller {

    @Autowired
    private userservice userservice;

    @PostMapping("/adduser")
    public String adduser(@RequestBody user user){
        int adduser= userservice.adduser(user);
        System.out.println(user);
        System.out.println(adduser);
        if (adduser>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
        }

    @GetMapping("/selectuserall")
    public List<user> selectuserall(){
      List<user> selecetuserall = userservice.selectuserall();
        return selecetuserall;
    }

    @GetMapping("/selectuservague")
    public List<user> selectvague(String msg){
        List<user> selectvague = userservice.selectvague(msg);
        return selectvague;
    }

    @GetMapping("/selectuserbyid")
    public user selectbyid(int id){
        user selectvague = userservice.selectbyid(id);
        System.out.println(selectvague);
        return selectvague;
    }

    @PostMapping("/updatauser")
    public String updatauser(@RequestBody user user){
        int updatauser= userservice.updata(user);
        System.out.println(user);
        System.out.println(updatauser);
        if (updatauser>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @GetMapping("/deluser")
    public String deluser(int id){
        int deluser = userservice.deluser(id);
        if (deluser>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

}

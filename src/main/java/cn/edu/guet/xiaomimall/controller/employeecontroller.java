package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.employee;
import cn.edu.guet.xiaomimall.bean.product;
import cn.edu.guet.xiaomimall.service.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/26/22:29
 * @Description:
 */
@RestController
public class employeecontroller {
    @Autowired
    private employeeservice employeeservice;

    @RequestMapping("/addemployee")
    public String addemployee(@RequestBody employee employee){
        String number = String.valueOf(System.currentTimeMillis());
        employee.setNumber(number);
        employee.setState("在职");
        List<employee> p1= employeeservice.selectrepeat(employee.getName());
        if (p1.size()!=0){
            return "员工已存在，请勿重复添加";
        }else {
            int addemployee = employeeservice.addemployee(employee);
            if (addemployee>0){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }
    }

    @RequestMapping("/getemployeelist")
    public List<employee> getemployeelist(@RequestParam int currentPage, @RequestParam int pageSize){
        return employeeservice.selectemployee((currentPage-1)*pageSize,pageSize);
    }

    @RequestMapping("/totalemp")
    public int totalpro(){
        return employeeservice.totalorlist();
    }

    @RequestMapping("/editemployee")
    public employee editemployee(@RequestParam int table_id){
        return employeeservice.selectbyid(table_id);
    }

    @RequestMapping("/getvagueemplist")
    public List<employee> getvagueemplist(@RequestParam String msg,@RequestParam int currentPage,@RequestParam int pageSize){
        return employeeservice.selectvague(msg,(currentPage-1)*pageSize,pageSize);
    }

    @RequestMapping("/selectvagueemp")
    public int selectvagueemp(@RequestParam String msg){
        return employeeservice.selectvaguetotal(msg);
    }

    @RequestMapping("/updataemp")
    public String updataemp(@RequestBody employee employee){
        int emp = employeeservice.updataemp(employee);
        if (emp>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
}

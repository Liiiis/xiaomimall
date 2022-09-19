package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/26/22:26
 * @Description:
 */
public interface employeeservice {
    int addemployee(employee employee);
    List<employee> selectrepeat(String name);
    List<employee> selectemployee(int curPage, int pageSize);
    int totalorlist();//总数
    employee selectbyid(int id);//根据id
    List<employee> selectvague(String msg,int curPage,int pageSize);
    int selectvaguetotal(String msg);//模糊查询总数
    int updataemp(employee employee);
}

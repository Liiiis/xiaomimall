package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.employee;
import cn.edu.guet.xiaomimall.mapper.employeemapper;
import cn.edu.guet.xiaomimall.service.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/26/22:26
 * @Description:
 */
@Service
public class employeeserviceImpl implements employeeservice {

    @Autowired
    private employeemapper employeemapper;

    @Override
    public int addemployee(employee employee) {
        return employeemapper.addemployee(employee);
    }

    @Override
    public List<employee> selectrepeat(String name) {
        return employeemapper.selectrepeat(name);
    }

    @Override
    public List<employee> selectemployee(int curPage, int pageSize) {
        return employeemapper.selectemployee(curPage,pageSize);
    }

    @Override
    public int totalorlist() {
        return employeemapper.totalorlist();
    }

    @Override
    public employee selectbyid(int id) {
        return employeemapper.selectbyid(id);
    }

    @Override
    public List<employee> selectvague(String msg, int curPage, int pageSize) {
        return employeemapper.selectvague(msg,curPage,pageSize);
    }

    @Override
    public int selectvaguetotal(String msg) {
        return employeemapper.selectvaguetotal(msg);
    }

    @Override
    public int updataemp(employee employee) {
        return employeemapper.updataemp(employee);
    }
}

package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.datasale;
import cn.edu.guet.xiaomimall.bean.orderlist;
import cn.edu.guet.xiaomimall.mapper.orderlistmapper;
import cn.edu.guet.xiaomimall.service.orderlistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/18/19:05
 * @Description:
 */
@Service
public class orderlistserviceImpl implements orderlistservice {

    @Autowired
    private orderlistmapper orderlistmapper;

    @Override
    public int addorder(orderlist orderlist) {
        return orderlistmapper.addorder(orderlist);
    }

    @Override
    public List<datasale> selectsumPrice() {
        return orderlistmapper.selectsumPrice();
    }

    @Override
    public List<orderlist> seleceorderlist() {
        return orderlistmapper.seleceorderlist();
    }

    @Override
    public orderlist selectbyidorder(int id) {
        return orderlistmapper.selectbyidorder(id);
    }

    @Override
    public int updataorder(orderlist orderlist) {
        return orderlistmapper.updataorder(orderlist);
    }

    @Override
    public List<orderlist> selectvague(String msg,int curPage,int pageSize) {
        return orderlistmapper.selectvague(msg,curPage,pageSize);
    }

    @Override
    public int delorder(String ordernumber) {
        return orderlistmapper.delorder(ordernumber);
    }

    @Override
    public List<orderlist> getpageorderlist(int curPage, int pageSize) {
        return orderlistmapper.getpageorderlist(curPage,pageSize);
    }

    @Override
    public int totalorlist() {
        return orderlistmapper.totalorlist();
    }

    @Override
    public int selectvaguetotal(String msg) {
        return orderlistmapper.selectvaguetotal(msg);
    }
}

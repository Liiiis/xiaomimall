package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.datasale;
import cn.edu.guet.xiaomimall.bean.orderlist;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/18/19:04
 * @Description:
 */
public interface orderlistservice {
    int addorder(orderlist orderlist);
    List<datasale> selectsumPrice();
    List<orderlist> seleceorderlist();
    orderlist selectbyidorder(int id);
    int updataorder(orderlist orderlist);
    List<orderlist> selectvague(String msg,int curPage,int pageSize);
    int delorder(String ordernumber);
    List<orderlist> getpageorderlist(int curPage,int pageSize);
    int totalorlist();
    int selectvaguetotal(String msg);//模糊查询总数
}

package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.catge;
import cn.edu.guet.xiaomimall.bean.orderlist;
import cn.edu.guet.xiaomimall.mapper.orderpromapper;
import cn.edu.guet.xiaomimall.service.orderlistservice;
import cn.edu.guet.xiaomimall.service.orderproservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/19/16:55
 * @Description:
 */
@Service
public class orderproserviceImpl implements orderproservice {

    @Autowired
    private orderpromapper orderpromapper;

    @Override
    public int addorderpro(String orderid, int pid, String category) {
        return orderpromapper.addorderpro(orderid,pid,category);
    }

    @Override
    public List select() {
        return orderpromapper.select();
    }

    @Override
    public List<String> selececateory() {
        return orderpromapper.selececateory();
    }

    @Override
    public List<catge> seletebing() {
        return orderpromapper.seletebing();
    }

    @Override
    public int delorpro(String orderid) {
        return orderpromapper.delorpro(orderid);
    }
}

package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.orderlist;
import cn.edu.guet.xiaomimall.mapper.orderlistmapper;
import cn.edu.guet.xiaomimall.service.orderlistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

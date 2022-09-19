package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.shopingcar;
import cn.edu.guet.xiaomimall.mapper.shopingcarmapper;
import cn.edu.guet.xiaomimall.service.shopcarservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/13/22:50
 * @Description:
 */
@Service
public class shopcarserviceImpl implements shopcarservice {

    @Autowired
    private shopingcarmapper shopingcarmapper;

    @Override
    public int addshopcar(shopingcar shopingcar) {
        return shopingcarmapper.addshopcar(shopingcar);
    }

    @Override
    public List<shopingcar> getshoppingcar() {
        return shopingcarmapper.getshoppingcar();
    }

    @Override
    public int delete() {
        return shopingcarmapper.delete();
    }

    @Override
    public int deletebyid(int id) {
        return shopingcarmapper.deletebyid(id);
    }
}

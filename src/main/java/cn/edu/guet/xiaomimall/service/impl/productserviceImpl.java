package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.product;
import cn.edu.guet.xiaomimall.mapper.productmapper;
import cn.edu.guet.xiaomimall.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/26/19:34
 * @Description:
 */
@Service
public class productserviceImpl implements productservice {

    @Autowired
    private productmapper productmapper;

    @Override
    public List<product> selectall() {
        List<product> allp = productmapper.selectall();
        return allp;
    }

    @Override
    public product selectbyid(int id) {
        product selectbyid = productmapper.selectbyid(id);
        return selectbyid;
    }

    @Override
    public List<product> selectvague(String msg) {
        List<product> selectvague = productmapper.selectvague(msg);
        return selectvague;
    }

    @Override
    public int addproduct(product product) {
        int add = productmapper.addproduct(product);
        return add;
    }

    @Override
    public List<product> selectrandom(String phone) {
        List<product> selectrandom = productmapper.selectrandom(phone);
        return selectrandom;
    }

    @Override
    public int updata(String name, int num) {
        return productmapper.updata(name,num);
    }


}

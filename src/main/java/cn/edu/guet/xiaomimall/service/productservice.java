package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.product;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/26/19:34
 * @Description:
 */
public interface productservice {
    List<product> selectall();
    product selectbyid(int id);
    List<product> selectvague(String msg);
    int addproduct(product product);
}

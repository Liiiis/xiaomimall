package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.shopingcar;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/13/22:50
 * @Description:
 */
public interface shopcarservice {
    int addshopcar(shopingcar shopingcar);
    List<shopingcar> getshoppingcar();
    int delete();
}

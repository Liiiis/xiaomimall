package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.catge;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/19/16:55
 * @Description:
 */
public interface orderproservice {
    int addorderpro(String orderid, int pid, String category);
    List select();
    List<String> selececateory();
    List<catge> seletebing();
    int delorpro(String orderid);
}

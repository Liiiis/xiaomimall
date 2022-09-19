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
    List<product> selectall(int curPage,int pageSize);
    product selectbyid(int id);
    List<product> selectvague(String msg,int curPage,int pageSize);
    int addproduct(product product);
    List<product> selectrandom(String phone);//随机选取
    int updata(String name,int num);
    int updatapro(product product);
    int delpro(int id);
    List<product> selectrepeat(String name);
    List<product> selecteproca(String category);
    int totalorlist();//总数
    int selectvaguetotal(String msg);//模糊查询总数
}

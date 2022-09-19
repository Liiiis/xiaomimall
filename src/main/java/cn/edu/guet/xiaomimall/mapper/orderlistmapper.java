package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.datasale;
import cn.edu.guet.xiaomimall.bean.orderlist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/18/19:02
 * @Description:
 */
@Mapper
public interface orderlistmapper {
    int addorder(orderlist orderlist);
    List<datasale> selectsumPrice();
    List<orderlist> seleceorderlist();
    orderlist selectbyidorder(int id);
    int updataorder(orderlist orderlist);
    List<orderlist> selectvague(String msg,int curPage,int pageSize);
    int delorder(String ordernumber);
    List<orderlist> getpageorderlist(int curPage,int pageSize); //fenye
    int totalorlist();//总数
    int selectvaguetotal(String msg);//模糊查询总数
}

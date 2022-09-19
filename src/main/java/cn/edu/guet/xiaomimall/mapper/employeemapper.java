package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.employee;
import cn.edu.guet.xiaomimall.bean.orderlist;
import cn.edu.guet.xiaomimall.bean.product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/26/21:53
 * @Description:
 */
@Mapper
public interface employeemapper {
    int addemployee(employee employee);
    List<employee> selectrepeat(String name);
    List<employee> selectemployee(int curPage, int pageSize);
    int totalorlist();//总数
    employee selectbyid(int id);//根据id
    List<employee> selectvague(String msg,int curPage,int pageSize);
    int selectvaguetotal(String msg);//模糊查询总数
    int updataemp(employee employee);
}

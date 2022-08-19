package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/26/19:30
 * @Description:
 */
@Mapper
public interface productmapper {
  List<product> selectall();
  product selectbyid(int id);//根据id
  List<product> selectvague(String msg);
  int addproduct(product product);
  List<product> selectrandom(String phone);//随机选取
  int updata(String name,int num);
}

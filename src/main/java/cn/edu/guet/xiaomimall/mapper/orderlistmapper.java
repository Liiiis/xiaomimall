package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.orderlist;
import org.apache.ibatis.annotations.Mapper;

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
}

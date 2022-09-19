package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.shopingcar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/13/22:47
 * @Description:
 */
@Mapper
public interface shopingcarmapper {
    int addshopcar(shopingcar shopingcar);
    List<shopingcar> getshoppingcar();
    int delete();
    int deletebyid(int id);
}

package cn.edu.guet.xiaomimall.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/19/16:37
 * @Description:
 */
@Mapper
public interface orderpromapper {
        int addorderpro(String orderid, int pid, String category);
}

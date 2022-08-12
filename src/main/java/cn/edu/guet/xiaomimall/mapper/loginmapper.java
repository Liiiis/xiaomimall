package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/22/17:38
 * @Description:
 */
@Mapper
public interface loginmapper {
    admin login(admin admin);
}

package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.product;
import cn.edu.guet.xiaomimall.bean.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/31/20:03
 * @Description:
 */
@Mapper
public interface usermapper {
    int adduser(user user);
    List<user> selectuserall();
    user selectbyid(int id);
    List<user> selectvague(String msg);
    int updata(user user);
    int deluser(int id);
    /** 分页 */
    List<user> getAllUserByPage();
}

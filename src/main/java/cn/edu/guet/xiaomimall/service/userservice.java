package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.user;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/01/16:11
 * @Description:
 */
public interface userservice {
    int adduser(user user);
    List<user> selectuserall();
    user selectbyid(int id);
    List<user> selectvague(String msg);
    int updata(user user);
    int deluser(int id);
}

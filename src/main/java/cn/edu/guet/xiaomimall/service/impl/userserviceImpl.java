package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.user;
import cn.edu.guet.xiaomimall.mapper.usermapper;
import cn.edu.guet.xiaomimall.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/01/16:12
 * @Description:
 */
@Service
public class userserviceImpl implements userservice {

    @Autowired
    private usermapper usermapper;

    @Override
    public int adduser(user user) {
        int adduser=usermapper.adduser(user);
        return adduser;
    }

    @Override
    public List<user> selectuserall() {
        List<user> userList=usermapper.selectuserall();
        return userList;
    }

    @Override
    public user selectbyid(int id) {
        user selectbyid = usermapper.selectbyid(id);
        return selectbyid;
    }

    @Override
    public List<user> selectvague(String msg) {
        List<user> selectvague = usermapper.selectvague(msg);
        return selectvague;
    }

    @Override
    public int updata(user user) {
        int updata = usermapper.updata(user);
        return updata;
    }

    @Override
    public int deluser(int id) {
        int del = usermapper.deluser(id);
        return del;
    }
}

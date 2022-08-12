package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.admin;
import cn.edu.guet.xiaomimall.mapper.loginmapper;
import cn.edu.guet.xiaomimall.service.loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/22/18:17
 * @Description:
 */
@Service
public class LoginserviceImpl implements loginservice {

    @Autowired
    private loginmapper loginmapper;

    @Override
    public admin login(admin admin) {
    admin a = loginmapper.login(admin);
        return a;
    }
}

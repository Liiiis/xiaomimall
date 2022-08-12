package cn.edu.guet.xiaomimall.service.impl;

import cn.edu.guet.xiaomimall.bean.songlist;
import cn.edu.guet.xiaomimall.mapper.songlistmapper;
import cn.edu.guet.xiaomimall.service.songlistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/02/10:57
 * @Description:
 */
@Service
public class songlistserviceImpl implements songlistservice {

    @Autowired
    private songlistmapper songlistmapper;

    @Override
    public int addsonglist(songlist songlist) {
        int addsonglist = songlistmapper.addsonglist(songlist);
        return addsonglist;
    }

    @Override
    public List<songlist> selectall() {
        List<songlist> songlist=songlistmapper.selectall();
        return songlist;
    }
}

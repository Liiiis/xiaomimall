package cn.edu.guet.xiaomimall.service;

import cn.edu.guet.xiaomimall.bean.songlist;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/02/10:56
 * @Description:
 */
public interface songlistservice {
    int addsonglist(songlist songlist);
    List<songlist> selectall();
}

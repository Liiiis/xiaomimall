package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.songlist;
import cn.edu.guet.xiaomimall.bean.user;
import cn.edu.guet.xiaomimall.service.songlistservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/02/11:04
 * @Description:
 */
@RestController
public class songlistcontroller {

    @Autowired
    private songlistservice songlistservice;

    @PostMapping("/addsonglist")
    public String addsonglist(@RequestBody songlist songlist){
        int addsonglist= songlistservice.addsonglist(songlist);
        if (addsonglist>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @GetMapping("songlistall")
    public List<songlist> songlistall(){
        List<songlist> songlists = songlistservice.selectall();
        return songlists;
    }
}

package cn.edu.guet.xiaomimall.mapper;

import cn.edu.guet.xiaomimall.bean.songlist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/02/10:36
 * @Description:
 */
@Mapper
public interface songlistmapper {
    int addsonglist(songlist songlist);
    List<songlist> selectall();
}

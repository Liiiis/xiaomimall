//package cn.edu.guet.xiaomimall.config;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @Author: 钟丁豪
// * @Date: 2022/08/25/19:33
// * @Description:
// */
//
//import cn.edu.guet.xiaomimall.bean.PageResult;
//import com.github.pagehelper.PageInfo;
//public class PageUtils {
//    /**
//     * 将分页信息封装到统一的接口
//     * @param pageInfo
//     * @return
//     */
//    public static PageResult getPageResult(PageInfo<?> pageInfo) {
//        PageResult pageResult = new PageResult();
//        pageResult.setPageNum(pageInfo.getPageNum());
//        pageResult.setPageSize(pageInfo.getPageSize());
//        pageResult.setTotalSize(pageInfo.getTotal());
//        pageResult.setTotalPages(pageInfo.getPages());
//        pageResult.setContent(pageInfo.getList());
//        return pageResult;
//    }
//}

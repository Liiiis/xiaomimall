package cn.edu.guet.xiaomimall.controller;

import cn.edu.guet.xiaomimall.bean.product;
import cn.edu.guet.xiaomimall.bean.user;
import cn.edu.guet.xiaomimall.http.HttpResult;
import cn.edu.guet.xiaomimall.service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/26/19:37
 * @Description:
 */
@RestController
public class productcontroller {

    @Autowired
    private productservice productservice;

    @GetMapping("/selectallp")  //查询全部
    public List<product> selectallp(){
        List<product> selectap = productservice.selectall();
        return selectap;
    }

    @GetMapping("/selectbyid")
    public HttpResult selectbyid(int id){
        product selectbyid = productservice.selectbyid(id);
        return HttpResult.ok(selectbyid);
    }

    @GetMapping("/selectvague")
    public List<product> selectvague(String msg){
        List<product> selectvague = productservice.selectvague(msg);
        return selectvague;
    }

    @PostMapping("/uploadimg")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        System.out.println("file:" + file.getOriginalFilename());
        // 判断文件是否为空
        if (file.isEmpty()) {
            return "上传文件不能为空";
        }
        // 获取传过来的文件名字
        String OriginalFilename = file.getOriginalFilename();
        // 为了防止重名覆盖，获取系统时间戳+原始文件的后缀名
        String fileName = System.currentTimeMillis() + "." + OriginalFilename.substring(OriginalFilename.lastIndexOf(".") + 1);
        // 设置保存地址（这里是转义字符）
        String filePath = "C:\\Users\\qingshan\\SpringMvcDemo\\xiaomimall\\src\\main\\resources\\static\\upload\\";
        File dest = new File(filePath + fileName);
        // 判断文件是否存在
        if (!dest.getParentFile().exists()) {
            // 不存在就创建一个
            dest.getParentFile().mkdirs();
        }
        try {
            // 上传
            file.transferTo(dest);
            System.out.println(dest.toString());
            return "http://localhost:8089/upload/" + fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return "上传失败";
        }
    }

    @PostMapping("/addproduct")
    public String addproduct(@RequestBody product product){
        int addproduct= productservice.addproduct(product);
        System.out.println(product);
        if (addproduct>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @GetMapping("/selectphoneten")
    public List<product> selectrandom(@RequestParam String phone){
        List<product> selectrandom = productservice.selectrandom(phone);
        return selectrandom;
    }

}

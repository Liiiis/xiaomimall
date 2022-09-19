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

    @RequestMapping("/selectallp")  //查询全部
    public List<product> selectallp(@RequestParam int currentPage,@RequestParam int pageSize){
        List<product> selectap = productservice.selectall((currentPage-1)*pageSize,pageSize);
        return selectap;
    }

    @GetMapping("/selectbyid")
    public HttpResult selectbyid(int id){
        product selectbyid = productservice.selectbyid(id);
        return HttpResult.ok(selectbyid);
    }

    @RequestMapping("/selectvague")
    public List<product> selectvague(@RequestParam String msg,@RequestParam int currentPage,@RequestParam int pageSize){
        List<product> selectvague = productservice.selectvague(msg,(currentPage-1)*pageSize,pageSize);
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
        String number = String.valueOf(System.currentTimeMillis());
        String name = product.getName();
        product.setNumber(number);
        List<product> p1= productservice.selectrepeat(name);
        System.out.println(name);
        if (p1.size()!=0){
            return "商品已存在，请勿重复添加";
        }else {
            int addproduct= productservice.addproduct(product);
            if (addproduct>0){
                return "添加成功";
            }else {
                return "添加失败";
            }
        }

    }

    @GetMapping("/selectphoneten")
    public List<product> selectrandom(@RequestParam String phone){
        List<product> selectrandom = productservice.selectrandom(phone);
        return selectrandom;
    }

    @PostMapping("/updataproduct")
    public String updataproduct(@RequestBody product product){
        int addproduct= productservice.updatapro(product);
        if (addproduct>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("/delpro")
    public String delpro(@RequestBody int id){
        System.out.println("山粗"+id);
        int delpro = productservice.delpro(id);
        if (delpro>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @GetMapping("/selecteproca")
    public List<product> selecteproca(@RequestParam String category){
        List<product> selectrandom = productservice.selecteproca(category);
        return selectrandom;
    }

    @RequestMapping("/totalpro")
    public int totalpro(){
        return productservice.totalorlist();
    }

    @RequestMapping("/totalprovague")
    public int totalprovague(@RequestParam String msg){
        return productservice.selectvaguetotal(msg);
    }
}

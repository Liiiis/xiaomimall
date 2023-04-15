package cn.edu.guet.xiaomimall.controller;


import cn.edu.guet.xiaomimall.bean.user;
import cn.edu.guet.xiaomimall.http.WangEditor;
import cn.edu.guet.xiaomimall.service.userservice;


import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.PrintWriter;

import java.util.Iterator;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/01/16:15
 * @Description:
 */
@RestController
public class usercontroller {

    @Autowired
    private userservice userservice;

    @RequestMapping("/fuupload")
    public void upload(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        int index = uri.lastIndexOf("/");
        uri = uri.substring(index + 1);
        Gson gson = new Gson();
        String realPath = request.getServletContext().getRealPath("/upload");
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);// 检查输入请求是否为multipart表单数据。
        if (isMultipart == true) {
            FileItemFactory factory = new DiskFileItemFactory();// 为该请求创建一个DiskFileItemFactory对象，通过它来解析请求。执行解析后，所有的表单项目都保存在一个List中。
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Iterator<FileItem> itr = items.iterator();
            // String filePath=System.getProperty("user.dir")+ File.separator;
            while (itr.hasNext()) {
                FileItem item = (FileItem) itr.next();
                // 检查当前项目是普通表单项目还是上传文件。
                if (item.isFormField()) {// 如果是普通表单项目，显示表单内容。
                    String fieldName = item.getFieldName();
                    String value = item.getString();
                    if (fieldName.equals("id")) {
                    } else if (fieldName.equals("title")) {
                    }
                } else {// 如果是上传文件，显示文件名。
                    File fullFile = new File(item.getName());
                    File savedFile = new File(realPath + "/", fullFile.getName());
                    try {
                        item.write(savedFile);

                        response.setContentType("application/json;utf-8");
                        PrintWriter out = response.getWriter();
                        String url = "upload/" + fullFile.getName();
                        String[] strs = {url};
                        //里面存储了图片的路径
                        WangEditor editor = new WangEditor(strs);
                        System.out.println(gson.toJson(editor));
                        out.print(gson.toJson(editor));
                        out.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.print("the enctype must be multipart/form-data");
        }
    }

    @PostMapping("/adduser")
    public String adduser(@RequestBody user user){
        int adduser= userservice.adduser(user);
        System.out.println(user);
        System.out.println(adduser);
        if (adduser>0){
            return "添加成功";
        }else {
            return "添加失败";
        }
        }

    @GetMapping("/selectuserall")
    public List<user> selectuserall(){
      List<user> selecetuserall = userservice.selectuserall();
        return selecetuserall;
    }

    @GetMapping("/selectuservague")
    public List<user> selectvague(String msg){
        List<user> selectvague = userservice.selectvague(msg);
        return selectvague;
    }

    @GetMapping("/selectuserbyid")
    public user selectbyid(int id){
        user selectvague = userservice.selectbyid(id);
        System.out.println(selectvague);
        return selectvague;
    }

    @PostMapping("/updatauser")
    public String updatauser(@RequestBody user user){
        int updatauser= userservice.updata(user);
        if (updatauser>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @GetMapping("/deluser")
    public String deluser(int id){
        int deluser = userservice.deluser(id);
        if (deluser>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

}

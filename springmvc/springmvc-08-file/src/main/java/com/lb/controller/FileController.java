package com.lb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @author: lb
 * @Date: 2021/05/13/15:55
 */
@RestController
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {

        //获取文件名
        String uploadFileName = file.getOriginalFilename();

        if ("".equals(uploadFileName)) {
            return "redirect:/index.jsp";
        }
        System.out.println("上传的文件名:" + uploadFileName);

        //上传路径保存的配置
        String path = request.getServletContext().getRealPath("/upload");
        //如果路径不存在,创建一个
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        System.out.println("上传文件保存的路径地址为:" + realPath);

        //文件输入流
        InputStream is = file.getInputStream();
        //文件输出流
        OutputStream os = new FileOutputStream(new File(realPath, uploadFileName));

        //读取写出
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            os.flush();
        }
        os.close();
        is.close();

        return "redirect:/index.jsp";
    }

    @RequestMapping("/lownload")
    public String downloads(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //要下载的图片地址
        String path = request.getServletContext().getRealPath("/upload");
        String fileName = "基础语法.jsp";

        //1.设置response响应头
        //设置页面不缓存,清空buffer
        response.reset();
        //字符编码
        response.setCharacterEncoding("UTF-8");
        //二进制传输数据
        response.setContentType("multipart/form-data");
        //设置响应头
        response.setHeader("Content-Disposition", "attachment;fileName" + URLEncoder.encode(fileName, "UTF-8"));
        File file = new File(path, fileName);

        //2.读取文件--输入流
        InputStream inputStream = new FileInputStream(file);
        //3.写出文件--输出流
        OutputStream out = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int index = 0;
        //4.执行 写出操作
        while ((index = inputStream.read(buffer)) != -1) {
            out.write(buffer, 0, index);
            out.flush();
        }

        out.close();
        inputStream.close();

        return "ok";
    }
}

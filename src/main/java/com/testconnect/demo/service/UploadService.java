package com.testconnect.demo.service;

import com.testconnect.demo.entity.GoodInfo;
import com.testconnect.demo.mapper.GoodInfoMapper;
import com.testconnect.demo.utils.page.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
@Service
public class UploadService {
    @Autowired
    GoodInfoMapper goodInfoMapper;
    @Value("${file.uploadFolder}")
    private String realBasePath ;
//    @ConfigurationProperties(prefix = "") 这个可以一次性将复杂的对象注入到javaBean中
    @Value("${file.accessPath}")
    private String accessPath ;
    public String uploadImg(GoodInfo goodInfo, MultipartFile multipartFile,MultipartFile[] introfile,MultipartFile[] topfile) throws IOException {
        String uuid = UUID.randomUUID().toString() ;
        String originName = multipartFile.getOriginalFilename() ;
        String extendName = originName.substring(originName.indexOf('.')+1) ;
        String newName = uuid+"."+extendName ;
        System.out.println(newName);
        //域名访问的相对路径（通过浏览器访问的链接-虚拟路径）
        String saveToPath = accessPath+"/";
        //文件的实际存储路径
        String realPath = realBasePath+"/";
        //文件的物理路径
        String filePath = realPath+newName ;
//        String basePath = ResourceUtils.getURL("classpath:").getPath()+"static/uploadImg" ;
//        System.out.println(basePath);
        File file = new File(filePath) ;
        multipartFile.transferTo(file);
        String introurl = "";
        String topurl = "";
        //上传商品介绍文件
        for(int i=0 ;i< introfile.length;i++){
           String introNewName =  UploadUtils.getNewName(introfile[i]) ;
           String introRealFilePath = realPath+"/introImg/"+introNewName ;
           introfile[i].transferTo(new File(introRealFilePath));
           String temp = saveToPath+introNewName+"#";
           introurl=introurl+temp ;
        }
        System.out.println(introfile.length);
        //上传顶部文件
        for(int i=0 ;i< topfile.length;i++){
            String topNewName =  UploadUtils.getNewName(topfile[i]) ;
            String topRealFilePath = realPath+"/topImg/"+topNewName ;
            introfile[i].transferTo(new File(topRealFilePath));
            String temp = saveToPath+topNewName+"#" ;
            topurl+=temp ;
        }
        System.out.println("******"+topurl+"******");
        goodInfo.setIntroimgurl(introurl);
        goodInfo.setTopimgurl(topurl);
        goodInfo.setGurl(saveToPath+newName);
        goodInfoMapper.insertGoodInfo(goodInfo) ;
        return saveToPath+newName;
    }
}

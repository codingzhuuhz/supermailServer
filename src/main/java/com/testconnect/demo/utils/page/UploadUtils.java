package com.testconnect.demo.utils.page;

import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public class UploadUtils {
    public static String getNewName(MultipartFile multipartFile){
        String uuid = UUID.randomUUID().toString() ;
        String originName = multipartFile.getOriginalFilename() ;
        String extendName = originName.substring(originName.indexOf('.')+1) ;
        String newName = uuid+"."+extendName ;
        return newName ;
    }
}

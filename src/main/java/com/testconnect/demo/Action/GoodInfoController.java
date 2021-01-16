package com.testconnect.demo.Action;

import com.alibaba.fastjson.JSONObject;
import com.testconnect.demo.entity.*;
import com.testconnect.demo.mapper.GoodInfoMapper;
import com.testconnect.demo.service.GoodService;
import com.testconnect.demo.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class GoodInfoController {
    @Autowired
    UploadService uploadService ;
    @Autowired
    GoodService goodService ;
    @Autowired
    GoodInfoMapper goodinfoMapper ;
    Logger logger = LoggerFactory.getLogger(GoodInfoController.class) ;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @ResponseBody
    @PostMapping("/cors/getGoodInfo")
        public String getGoodInfo(String type,int page){
        PageBean pageBean = goodService.getGoodInfoByPageAndType(type,page) ;
        return JSONObject.toJSONString(pageBean) ;
   }
   @ResponseBody
   @RequestMapping("/cors/getGoodInfoById/{id}")
   public String getGoodDetailInfoById(@PathVariable("id") int id){
       System.out.println(id);
       logger.info("商品编号"+id) ;
       GoodInfo goodInfo = goodService.getGoodDetailInfoById(id) ;
        List<Comment> comment = goodService.getCommentById(id) ;
       ShopInfo shopInfo = goodService.getShopInfoBygid(id) ;
       logger.info(shopInfo.toString()) ;
       GoodDetailBean goodDetailBean = new GoodDetailBean() ;
       goodDetailBean.setComment(comment);
       goodDetailBean.setGoodInfo(goodInfo);
       goodDetailBean.setShopInfo(shopInfo);
       return JSONObject.toJSONString(goodDetailBean) ;
   }
    @ResponseBody
    @PostMapping("/cors/getAddGoodInfo")
    public String getAddGoodInfo(GoodInfo goodInfo, @RequestParam("file") MultipartFile multifile,
                                 @RequestParam("introfile") MultipartFile[] introfile,@RequestParam("topfile") MultipartFile[] topfile
                                 ) throws IOException {
        logger.info("-------");
        return uploadService.uploadImg(goodInfo,multifile,introfile,topfile) ;
   }
}

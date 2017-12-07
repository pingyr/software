package com.pingyrsoft.util;

import com.aliyun.oss.OSSClient;
import com.pingyrsoft.entity.AliyunOSSAccessToken;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AliyunOSSUtil {


    public static String upload(MultipartFile multipartFile, AliyunOSSAccessToken aliyunOSSAccessToken) throws IOException {
        OSSClient ossClient = new OSSClient(aliyunOSSAccessToken.getEndpoint(),
                aliyunOSSAccessToken.getAccessKeyId(),
                aliyunOSSAccessToken.getAccessKeySecret());

        String fileName = multipartFile.getOriginalFilename();

        File f = null;
        f = File.createTempFile("temp",null);
        multipartFile.transferTo(f);

        InputStream inputStream = new FileInputStream(f);
        ossClient.putObject("pingyr",fileName,inputStream);
        ossClient.shutdown();
        f.deleteOnExit();
        return fileName;
    }

    public static void delete(String fileName,AliyunOSSAccessToken aliyunOSSAccessToken) throws IOException{
        OSSClient ossClient = new OSSClient(aliyunOSSAccessToken.getEndpoint(),
                aliyunOSSAccessToken.getAccessKeyId(),
                aliyunOSSAccessToken.getAccessKeySecret());
        ossClient.deleteObject("pingyr",fileName);
        ossClient.shutdown();
    }

    public static boolean isExist(String fileName,AliyunOSSAccessToken aliyunOSSAccessToken) throws IOException{
        OSSClient ossClient = new OSSClient(aliyunOSSAccessToken.getEndpoint(),
                aliyunOSSAccessToken.getAccessKeyId(),
                aliyunOSSAccessToken.getAccessKeySecret());
        boolean result = ossClient.doesObjectExist("pingyr",fileName);
        ossClient.shutdown();
        return result;

    }
}

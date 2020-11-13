package com.user.test.util;

import com.user.test.entity.IdCardVo;
import org.springframework.beans.factory.annotation.Value;


import java.io.*;

public class FileUtils {

    @Value(value = "${service.pic.load.address}")
    private  String  serviceLoadAddress = "C:\\tomcat\\apache-tomcat-8.0.53\\webapps\\zcsxPic\\";
    @Value(value = "${service.pic.request.address}")
    private  String  serviceRequestAddress = "/zcsxPic/";//访问地址

    /**
     * 读取文件内容，作为字符串返回
     */
    public static String readFileAsString(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        }

        if (file.length() > 1024 * 1024 * 1024) {
            throw new IOException("File is too large");
        }

        StringBuilder sb = new StringBuilder((int) (file.length()));
        // 创建字节输入流
        FileInputStream fis = new FileInputStream(filePath);
        // 创建一个长度为10240的Buffer
        byte[] bbuf = new byte[10240];
        // 用于保存实际读取的字节数
        int hasRead = 0;
        while ( (hasRead = fis.read(bbuf)) > 0 ) {
            sb.append(new String(bbuf, 0, hasRead));
        }
        fis.close();
        return sb.toString();
    }

    /**
     * 根据文件路径读取byte[] 数组
     */
    public static byte[] readFileByBytes(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
            BufferedInputStream in = null;

            try {
                in = new BufferedInputStream(new FileInputStream(file));
                short bufSize = 1024;
                byte[] buffer = new byte[bufSize];
                int len1;
                while (-1 != (len1 = in.read(buffer, 0, bufSize))) {
                    bos.write(buffer, 0, len1);
                }

                byte[] var7 = bos.toByteArray();
                return var7;
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException var14) {
                    var14.printStackTrace();
                }

                bos.close();
            }
        }
    }

    /**
     * base64图片返回绝对路径
     * @param imgFile
     * @return
     */
    public IdCardVo idCardUpload(String imgFile){
        IdCardVo idCardVo = new IdCardVo();
        String fileName = System.currentTimeMillis()+".jpg";
        try {
            boolean b = Base64Util.generateImage(imgFile, serviceLoadAddress + fileName);
            if(b){
                idCardVo.setServiceLoadAddress(serviceLoadAddress+fileName);
                idCardVo.setServiceRequestAddress(serviceRequestAddress+fileName);    
                return idCardVo;
            }
            if(b==false){
                idCardVo.setMsg("图片格式错误");
                return idCardVo;
            }

        } catch (Exception e) {
            idCardVo.setMsg("图片格式错误");
            return idCardVo;
        }
        return null;
    }
}

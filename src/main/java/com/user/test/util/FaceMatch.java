package com.user.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 人脸对比
 */
public class FaceMatch {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String faceMatch(String oldPath,String path) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {
            byte[] bytes1 = FileUtils.readFileByBytes(oldPath);
            String image1 = Base64Util.encode(bytes1);
            byte[] bytes2 = FileUtils.readFileByBytes(path);
            String image2 = Base64Util.encode(bytes2);

            FaceV3Bean faceMatch1 = new FaceV3Bean(image1,"BASE64");
            FaceV3Bean faceMatch2 = new FaceV3Bean(image2,"BASE64","LIVE","NORMAL","NORMAL");

     /*       Map<String, Object> map1 = new HashMap<>();
            map1.put("image",image1);
            map1.put("image_type","BASE64");


          Map<String, Object> map2 = new HashMap<>();
            map1.put("image",image2);
            map1.put("image_type","BASE64");*/
            List<Object> lists = new ArrayList<>();
            lists.add(faceMatch1);
            lists.add(faceMatch2);



            int data[] = {1, 2, 4, 545, 11, 32, 13131, 4444};



            String param = GsonUtils.toJson(lists);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, param);
          //  System.out.println(result);
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void face() {
        String[] data  = {"1","ha","23","wew"};
        List<Object> lists = new ArrayList<>();
        lists.add(data);

        String[] w = (String[]) lists.get(0);
        for(int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }


    }


    public static void main(String[] args) {
       face();
    }
}

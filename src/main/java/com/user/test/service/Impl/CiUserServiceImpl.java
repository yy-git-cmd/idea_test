package com.user.test.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.user.test.dao.CiUserMapper;
import com.user.test.entity.*;
import com.user.test.pojo.CiUser;
import com.user.test.response.ResultStatus;
import com.user.test.service.ICiUserService;
import com.user.test.util.FaceMatch;
import com.user.test.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class CiUserServiceImpl implements ICiUserService {

    @Autowired
    CiUserMapper ciUserMapper;

    @Override
    public ResultStatus pictureUpload(ImgFile imgFile) {

        String imgFile1 = imgFile.getImgFile();
        String sign = imgFile.getSign();
        IdCardVo idCardVo = new FileUtils().idCardUpload(imgFile1);
        if (idCardVo.getMsg() != null) {
            return ResultStatus.error(idCardVo.getMsg(), new Exception());
        }else {
            String pach = idCardVo.getServiceLoadAddress();
            if (sign.equals("1") ) {
                Data data = new Data();
                //豆豆
                String oldPach = "C:\\tomcat\\apache-tomcat-8.0.53\\webapps\\zcsxPic\\1603678328589.jpg";
                String s = FaceMatch.faceMatch(oldPach, pach);
                MatchVo matchVo = JSONObject.parseObject(s, MatchVo.class);
                String errorCode = matchVo.getErrorCode();
                if (errorCode.equals("0")) {
                    String result = matchVo.getResult();
                    Result result1 = JSONObject.parseObject(result, Result.class);
                    int score = result1.getScore();
                    if (score > 70) {
                        data.setSign("0");
                        data.setMsg("识别成功");
                        delFile(pach);
                        return ResultStatus.success(data);
                    } else {
                        data.setSign("2");
                        data.setMsg("识别失败");
                        delFile(pach);
                        return ResultStatus.success(data);
                    }
                } else {
                    data.setSign("1");
                    data.setMsg("识别错误，请从新拍摄...");
                    delFile(pach);
                    return ResultStatus.success(data);
                }
            }
            if (sign .equals("0") ) {
                Data data = new Data();
                //贝贝
                String oldPach = "C:\\tomcat\\apache-tomcat-8.0.53\\webapps\\zcsxPic\\1603689564850.jpg";
                String s = FaceMatch.faceMatch(oldPach, pach);
                MatchVo matchVo = JSONObject.parseObject(s, MatchVo.class);
                String errorCode = matchVo.getErrorCode();
                if (errorCode.equals("0")) {
                    String result = matchVo.getResult();
                    Result result1 = JSONObject.parseObject(result, Result.class);
                    int score = result1.getScore();
                    if (score > 70) {
                        data.setSign("0");
                        data.setMsg("识别成功");
                        String s1 = delFile(pach);
                        System.out.println(s1);
                        return ResultStatus.success(data);
                    } else {
                        data.setSign("2");
                        data.setMsg("识别失败");
                        String s1 = delFile(pach);
                        System.out.println(s1);
                        return ResultStatus.success(data);
                    }
                } else {
                    data.setSign("1");
                    data.setMsg("识别错误，请从新拍摄...");
                    String s1 = delFile(pach);
                    System.out.println(s1);
                    return ResultStatus.success(data);
                }
            }
            return ResultStatus.error("传入正确的标识",new Exception());
        }
    }


    public String delFile(String path) {
        //上篇中前端穿过来的是/imctemp-rainy/*.jpg格式的，只需要取出最后的文件名，写死路径，就可以准确找到文件了
        //前端页面处理路径，
        //var imgpath=path.split("/");
        //imgpath = imgpath[imgpath.length-1];
        String resultInfo = null;
        //System.out.println(path);///imctemp-rainy/2.jpg
        int lastIndexOf = path.lastIndexOf("/");
        String img_path = path.substring(lastIndexOf + 1, path.length());
        //System.out.println(img_path);
        //System.out.println(img_path);//输出测试一下文件路径是否正确
        File file = new File(img_path);
        if (file.exists()) {//文件是否存在
            if (file.delete()) {//存在就删了，返回1
                resultInfo =  "1";
            } else {
                resultInfo =  "0";
            }
        } else {
            resultInfo = "文件不存在！";
        }
        return resultInfo;
    }
}

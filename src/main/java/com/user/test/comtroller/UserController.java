package com.user.test.comtroller;

import com.user.test.entity.Data;
import com.user.test.entity.IdCardVo;
import com.user.test.entity.ImgFile;
import com.user.test.response.ResultStatus;
import com.user.test.service.ICiUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags="人脸识别")
public class UserController {

    @Autowired
    ICiUserService ciUserService;


    @RequestMapping(value = "/faceMatch", method= RequestMethod.POST)
    @ApiOperation(value = "脸部识别",notes = "传入图片base64,sign标识贝贝‘0’，豆豆‘1’")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对"),
            @ApiResponse(code = 200, response = Data.class, message = "返回数据在data 字段对应 " +
                    " ")
    })
    public ResultStatus pictureUpload(@RequestBody ImgFile imgFile){
        return ciUserService.pictureUpload(imgFile);
    }



}

package com.user.test.comtroller;

import com.user.test.pojo.PushBean;
import com.user.test.response.ResultStatus;
import com.user.test.service.JiGuangPushService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpush")
@Api(tags="极光推送")
public class JPushController {
    @Autowired
    private JiGuangPushService  jiGuangPushService;
    /**
     * 群推，广播
     * @param title 推送标题
     * @param content 推送内容
     * @return
     */
    @PostMapping("/pushAll")
    @ApiOperation(value = "群推，广播",notes = "title 推送标题 ,content 推送内容")
    public ResultStatus pushAll(@RequestParam String title, @RequestParam String content) {
        PushBean pushBean = new PushBean();
        pushBean.setTitle(title);
        pushBean.setAlert(content);
        boolean flag = jiGuangPushService.pushAndroid(pushBean);
        return ResultStatus.success(flag);
    }

    /**
     * 单独对regId进行推送
     * @param title 推送标题
     * @param regId 设备对应的唯一极光ID
     * @param content 推送内容
     * @return
     */
    @PostMapping("/push")
    @ApiOperation(value = "单独对regId进行推送",notes = "title 推送标题,regId 设备对应的唯一极光ID,content 推送内容")
    public ResultStatus push(@RequestParam String title,@RequestParam String regId,@RequestParam String content){
        PushBean pushBean = new PushBean();
        pushBean.setTitle(title);
        pushBean.setAlert(content);
        boolean flag = jiGuangPushService.pushAndroid(pushBean, regId);
        return ResultStatus.success(flag);
    }
}

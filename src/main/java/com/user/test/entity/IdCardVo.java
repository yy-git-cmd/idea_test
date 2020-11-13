package com.user.test.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class IdCardVo implements Serializable {
    /**
     * 绝对路径
     */
    @ApiModelProperty(value = "绝对路径")
    private String serviceLoadAddress;

    /**
     * 访问路径
     */
    @ApiModelProperty(value = "访问路径")
    private String serviceRequestAddress;
    /**
     * 错误消息
     */
    @ApiModelProperty(value = "错误消息")
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getServiceLoadAddress() {
        return serviceLoadAddress;
    }

    public void setServiceLoadAddress(String serviceLoadAddress) {
        this.serviceLoadAddress = serviceLoadAddress;
    }

    public String getServiceRequestAddress() {
        return serviceRequestAddress;
    }

    public void setServiceRequestAddress(String serviceRequestAddress) {
        this.serviceRequestAddress = serviceRequestAddress;
    }

    @Override
    public String toString() {
        return "IdCardVo{" +
                "serviceLoadAddress='" + serviceLoadAddress + '\'' +
                ", serviceRequestAddress='" + serviceRequestAddress + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}

package com.user.test.entity;

import java.io.Serializable;

public class ImgFile implements Serializable {
    private String imgFile;
    private String sign;

    public String getImgFile() {
        return imgFile;
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "ImgFile{" +
                "imgFile='" + imgFile + '\'' +
                '}';
    }
}

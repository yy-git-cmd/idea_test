package com.user.test.entity;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Point {

    /**
     * 经度（7位小数）（-180~180，东经正数，西经负数）
     */
    private double lng;
    /**
     * 维度（7位小数）（-90~90，北纬正数，南纬负数）
     */
    private double lat;

    public Point(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}

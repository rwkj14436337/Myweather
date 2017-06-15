package com.example.acer.myweather.Model;

/**
 * Created by acer on 2017/6/15.
 */

public class City {
    //城市名
    private String cityName;
    //城市id
    private String cityId;
    //所属省份id
    private String provinceId;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

}

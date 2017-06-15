package com.example.acer.myweather.Model;

/**
 * Created by acer on 2017/6/15.
 */

public class County {
    //区名
    private String countyName;
    //区Id
    private String countyId;
    //所属城市Id
    private String cityId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String county_d) {
        this.countyId = countyId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }


}

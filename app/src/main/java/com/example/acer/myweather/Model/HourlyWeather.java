package com.example.acer.myweather.Model;

/**
 * Created by acer on 2017/6/15.
 */

public class HourlyWeather {
    //预测时间
    private String time;
    //温度
    private String temp;
    //降水概率
    private String pop;
    //风力
    private String wind;

    public HourlyWeather(String time, String temp, String pop, String wind) {
        this.time = time;
        this.temp = temp;
        this.pop = pop;
        this.wind = wind;
    }

    public String getTime() {
        return time;
    }

    public String getTemp() {
        return temp;
    }

    public String getPop() {
        return pop;
    }

    public String getWind() {
        return wind;
    }

}

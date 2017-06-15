package com.example.acer.myweather.Util;

/**
 * Created by acer on 2017/6/15.
 */

public interface HttpCallbackListener  {
    void onFinish(String response);

    void onError(Exception e);

}

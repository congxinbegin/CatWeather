package com.catweather.android.gson;

/**
 * 创建时间: 2017/1/7 21:56
 * 编写人:彭鹏
 * 功能描述:
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

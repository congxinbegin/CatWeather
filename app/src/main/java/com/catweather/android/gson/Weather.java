package com.catweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 创建时间: 2017/1/7 22:44
 * 编写人:彭鹏
 * 功能描述:
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

package com.catweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间: 2017/1/7 21:51
 * 编写人:彭鹏
 * 功能描述:
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

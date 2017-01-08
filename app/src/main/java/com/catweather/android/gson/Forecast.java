package com.catweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间: 2017/1/7 22:36
 * 编写人:彭鹏
 * 功能描述:
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}

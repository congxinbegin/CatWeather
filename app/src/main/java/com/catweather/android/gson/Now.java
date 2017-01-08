package com.catweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间: 2017/1/7 21:58
 * 编写人:彭鹏
 * 功能描述:
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

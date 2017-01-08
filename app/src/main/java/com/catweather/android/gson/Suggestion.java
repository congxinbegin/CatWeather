package com.catweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 创建时间: 2017/1/7 22:10
 * 编写人:彭鹏
 * 功能描述:
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}

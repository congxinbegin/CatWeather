package com.catweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 创建时间: 2017/1/4 22:58
 * 编写人:彭鹏
 * 功能描述:
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市的名字
    private int cityCode;//城市的代号
    private int provinceId;//所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

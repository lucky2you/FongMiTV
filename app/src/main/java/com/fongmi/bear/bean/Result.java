package com.fongmi.bear.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Result {

    @SerializedName("list")
    private List<Vod> list;

    public static Result objectFrom(String str) {
        Result result = new Gson().fromJson(str, Result.class);
        return result == null ? new Result() : result;
    }

    public List<Vod> getList() {
        return list == null ? Collections.emptyList() : list;
    }
}
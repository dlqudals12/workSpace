package com.hyundai.thehandsome.Vo;

import lombok.Data;

@Data
public class UpdateCartCountReq {

    private String mid;
    private String psId;
    private int count;

    public void convert(int countNow) {
        this.count = count + countNow;
    }
}

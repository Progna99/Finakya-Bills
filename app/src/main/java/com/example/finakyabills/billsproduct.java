package com.example.finakyabills;

import android.widget.Button;

public class billsproduct {
    String mobile;
    String amt1;
    private int img;

    public billsproduct(String mobile, String amt1, int img) {
        this.mobile = mobile;
        this.amt1 = amt1;
        this.img = img;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAmt1() {
        return amt1;
    }

    public void setAmt1(String amt1) {
        this.amt1 = amt1;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}


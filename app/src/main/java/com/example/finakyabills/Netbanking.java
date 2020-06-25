package com.example.finakyabills;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Netbanking extends RealmObject {


    private long id4;
    private int bankimage;
    private String digit;

    public Netbanking() {
    }

    public Netbanking(int bankimage, String digit) {
        this.bankimage = bankimage;
        this.digit = digit;
    }

    public long getId4() {
        return id4;
    }

    public void setId4(long id4) {
        this.id4 = id4;
    }

    public int getBankimage() {
        return bankimage;
    }

    public void setBankimage(int bankimage) {
        this.bankimage = bankimage;
    }

    public String getDigit() {
        return digit;
    }

    public void setDigit(String digit) {
        this.digit = digit;
    }


}

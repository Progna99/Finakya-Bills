package com.example.finakyabills;

public class Netbanking {


    private int bankimage;
    private String digit;

    public Netbanking() {
    }

    public Netbanking(int bankimage, String digit) {
        this.bankimage = bankimage;
        this.digit = digit;
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

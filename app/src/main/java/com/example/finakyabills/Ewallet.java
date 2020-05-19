package com.example.finakyabills;

public class Ewallet {

    private int image;
    public String digits;

    public Ewallet() {
    }

    public Ewallet(int image, String digits) {
        this.image = image;
        this.digits = digits;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }


}

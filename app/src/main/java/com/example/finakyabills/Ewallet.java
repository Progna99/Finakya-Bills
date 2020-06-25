package com.example.finakyabills;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Ewallet extends RealmObject {


    private long id3;

    private int image;
    public String digits;

    public Ewallet() {
    }

    public Ewallet(int image, String digits) {
        this.image = image;
        this.digits = digits;
    }

    public long getId3() {
        return id3;
    }

    public void setId3(long id3) {
        this.id3 = id3;
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

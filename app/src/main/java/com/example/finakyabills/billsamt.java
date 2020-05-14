package com.example.finakyabills;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class billsamt extends RealmObject {
    @PrimaryKey
    private long id;
    private String type,type1;
    private String amt,amt1;
    private int image,img;


    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}

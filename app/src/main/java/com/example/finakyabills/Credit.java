package com.example.finakyabills;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Credit extends RealmObject {
    @PrimaryKey
    private long id;
    private int image;

    public Credit() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Credit(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

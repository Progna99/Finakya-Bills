package com.example.finakyabills;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Debit extends RealmObject {


    private long id2;

    private int image2;
    public Debit(){

    }



    public long getId2() {
        return id2;
    }

    public void setId2(long id2) {
        this.id2 = id2;
    }





    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

}

package com.example.finakyabills;

import io.realm.RealmObject;

public class Upi extends RealmObject {
    private long id5;
    private String name;
    private String phone;
    private String id;
    private String account;
    private String bank;
    private String upi;
    private int image5;
    private int image6;

    public Upi() {
    }

    public Upi(String name, String phone, String id, String account, String bank, String upi, int image5, int image6) {

        this.name = name;
        this.phone = phone;
        this.id = id;
        this.account = account;
        this.bank = bank;
        this.upi=upi;
        this.image5 = image5;
        this.image6 = image6;
    }

    public long getId5() {
        return id5;
    }

    public void setId5(long id5) {
        this.id5 = id5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }


    public int getImage5() {
        return image5;
    }

    public void setImage5(int image5) {
        this.image5 = image5;
    }

    public int getImage6() {
        return image6;
    }

    public void setImage6(int image6) {
        this.image6 = image6;
    }
}


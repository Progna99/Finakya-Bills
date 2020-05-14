package com.example.finakyabills;

import android.app.Application;
import io.realm.Realm;

public class realm extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}

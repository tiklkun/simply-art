package com.example.simplyart;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class InstagramOffline extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}

package com.jibres.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jibres.android.account.AddUserTemp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new AddUserTemp(getApplication());
    }
}

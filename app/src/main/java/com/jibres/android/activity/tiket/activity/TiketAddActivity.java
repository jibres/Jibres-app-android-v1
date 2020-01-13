package com.jibres.android.activity.tiket.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.jibres.android.R;

public class TiketAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiket_add);

        View toolbarView = findViewById(R.id.toolbar);
        Toolbar toolbar = toolbarView.findViewById(R.id.toolbar);
        TextView mTitle = toolbar.findViewById(R.id.title);
        setSupportActionBar(toolbar);
        mTitle.setText("ارسال تیکت");
        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

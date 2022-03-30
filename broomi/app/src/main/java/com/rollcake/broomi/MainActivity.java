package com.rollcake.broomi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);


    }
    public void clicktitle(View view) {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }

}
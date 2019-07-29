package com.gmail.susirevsi123.responsimobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void data (View view){
        Intent intent = new Intent(Home.this, MainActivity.class);
        startActivity(intent);
    }

    public void gambar (View view){
        Intent intent = new Intent(Home.this, CameraActivity.class);
        startActivity(intent);
    }
}

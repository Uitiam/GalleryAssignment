package com.example.maitiu.photogallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void gotToDisplay(View view){
        Intent intent = new Intent(this, Display.class);

        startActivity(intent);
    }

    public void backToMain(View view){
        finish();
    }
}

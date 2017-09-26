package com.example.maitiu.photogallery;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.util.ULocale;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gallery);
    }

    public void goToCategory(View view){
        Intent intent = new Intent(this, Category.class);

        startActivity(intent);
    }

    public void activateCamera(View view){
        Intent intent = new Intent(this, Display.class);

        startActivity(intent);
    }

    /*private boolean checkCameraHardware(Context context){
        if(context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            return true;
        } else {
            return false;
        }
    }*/
}

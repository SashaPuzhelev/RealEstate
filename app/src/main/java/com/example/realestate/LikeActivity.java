package com.example.realestate;

import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;

public class LikeActivity extends CatalogMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);
    }
    @Override
    protected void onLogoClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.realestate;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FiltersActivity extends CancelMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);
    }
    @Override
    public void onLogoClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
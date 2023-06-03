package com.example.realestate;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActionBar();
    }
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setLogo(R.drawable.logo);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setTitle(R.string.company_name);
            View logoView = findViewById(android.R.id.home);
            if (logoView != null)
            {
                logoView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onLogoClicked();
                    }
                });
            }
        }
    }
    protected abstract void onLogoClicked();
}

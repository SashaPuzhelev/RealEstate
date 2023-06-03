package com.example.realestate;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import com.example.realestate.ui.login.LoginActivity;

public class CatalogActivity extends CatalogMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
    }
}
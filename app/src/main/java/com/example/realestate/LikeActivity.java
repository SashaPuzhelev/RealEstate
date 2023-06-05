package com.example.realestate;

import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import com.example.realestate.databinding.ActivityLikeBinding;

public class LikeActivity extends CatalogMenuActivity {

    private ActivityLikeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);
        binding = ActivityLikeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    @Override
    protected void onLogoClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.realestate;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import com.example.realestate.databinding.ActivityMainBinding;

public class MainActivity extends MainMenuActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final Button buyButton = binding.buyButton;
        final Button commercialButton = binding.commercialButton;
        final Button houseButton = binding.houseButton;
        final Button rentButton = binding.rentButton;
        final Button newHouseButton = binding.newHouseButton;
        final Button rentForDaysButton = binding.rentForDaysButton;
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CatalogActivity.class);
                startActivity(intent);
            }
        }
        );
    }
    public void onClickRegion(View view)
    {

    }

    public void onClickPlaceAnAd(View view)
    {

    }



}
package com.example.realestate;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.example.realestate.ui.login.LoginActivity;

public class MainMenuActivity extends BaseActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int idItem = item.getItemId();
        if (idItem == R.id.enter)
        {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        if (idItem == R.id.like)
        {
            Intent intent = new Intent(this, LikeActivity.class);
            startActivity(intent);
        }
        if (idItem == R.id.home)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return true;
    }

}

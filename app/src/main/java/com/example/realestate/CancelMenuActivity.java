package com.example.realestate;

import android.view.Menu;
import android.view.MenuItem;

public abstract class CancelMenuActivity extends BaseActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cancel_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int idItem = item.getItemId();
        if (idItem == R.id.cancel)
        {
            this.onBackPressed();
        }
        return true;
    }
}

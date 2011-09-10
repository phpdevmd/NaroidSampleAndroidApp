package com.phpdevmd.naroid;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class BaseActivity extends Activity {
    /** Called when the user touches the Menu button.
     * Options menu is based on R/menu/main.xml.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    /** Called when a menu option is pressed. */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent intent = new Intent();
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.home:
    		intent.setClass(getApplicationContext(), LauncherActivity.class);
    		startActivity(intent);
            return true;
        case R.id.about:
    		intent.setClass(getApplicationContext(), AboutActivity.class);
    		startActivity(intent);
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}
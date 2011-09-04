package com.phpdevmd.naroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NaroidBasicActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] basic_list = getResources().getStringArray(R.array.basic_list_array);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, basic_list));

    	ListView lv = getListView();
    	lv.setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);

    	// Get the item that was clicked
        Object o = l.getItemAtPosition(position);
    	String text = o.toString();

    	if (id == 0) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), HelloWorldActivity.class);
    		startActivity(intent);
    	} else if (id == 1) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), MenuActivity.class);
    		startActivity(intent);
    	} else if (id == 2) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), ScrollbarActivity.class);
    		startActivity(intent);
    	} else if (id == 3) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), ListViewActivity.class);
    		startActivity(intent);
    	} else {
    		Toast.makeText(getApplicationContext(), "Sorry, you clicked unknown item: " + text,
    				Toast.LENGTH_SHORT).show();
    	}
    }

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
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.quit:
        	NaroidBasicActivity.this.finish();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}
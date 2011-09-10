package com.phpdevmd.naroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LauncherActivity extends BaseListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] launcher_list = getResources().getStringArray(R.array.launcher_list);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, launcher_list));

    	ListView lv = getListView();
    	lv.setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);

    	// Get the item that was clicked
        Object o = l.getItemAtPosition(position);
    	String text = o.toString();

    	if (id == 0/*text.equals("Basic")*/) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), BasicSamplesActivity.class);
    		startActivity(intent);
    	} else if (id == 1) {
    		Intent intent = new Intent();
    		intent.setClass(getApplicationContext(), AdvancedSamplesActivity.class);
    		startActivity(intent);
    	} else {
    		Toast.makeText(getApplicationContext(), text + " samples are not ready yet...",
    				Toast.LENGTH_SHORT).show();
    	}
    }
}
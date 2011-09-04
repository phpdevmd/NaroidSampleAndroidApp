package com.phpdevmd.naroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends BaseListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] home_list = getResources().getStringArray(R.array.home_list);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, home_list));

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
    	} else {
    		Toast.makeText(getApplicationContext(), text + " samples are not ready yet...",
    				Toast.LENGTH_SHORT).show();
    	}
    }
}
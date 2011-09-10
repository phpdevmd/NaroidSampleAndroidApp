package com.phpdevmd.naroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdvancedSamplesActivity extends BaseListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] advanced_samples = getResources().getStringArray(R.array.advanced_samples);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, advanced_samples));

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
    		intent.setClass(getApplicationContext(), LocalizationActivity.class);
    		startActivity(intent);
    	} else {
    		String toast_text = getResources().getString(R.string.unknown_item_clicked, text);
    		Toast.makeText(getApplicationContext(), toast_text, Toast.LENGTH_SHORT).show();
    	}
    }
}
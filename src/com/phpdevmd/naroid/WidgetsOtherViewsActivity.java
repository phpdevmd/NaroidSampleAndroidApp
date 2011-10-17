package com.phpdevmd.naroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WidgetsOtherViewsActivity extends BaseListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] widgets_other_views = getResources().getStringArray(R.array.widgets_other_views);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, widgets_other_views));

    	ListView lv = getListView();
    	lv.setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);

		Intent intent = new Intent();

    	if (id == 0) {
    		intent.setClass(getApplicationContext(), DatePickerActivity.class);
    	} else if (id == 1) {
    		intent.setClass(getApplicationContext(), TimePickerActivity.class);
    	} else if (id == 2) {
    		intent.setClass(getApplicationContext(), FormStuffActivity.class);
    	} else if (id == 3) {
    		intent.setClass(getApplicationContext(), SpinnerActivity.class);
    	} else if (id == 4) {
    		intent.setClass(getApplicationContext(), AutoCompleteActivity.class);
    	} else if (id == 5) {
    		intent.setClass(getApplicationContext(), GalleryActivity.class);
    	} else if (id == 6) {
    		intent.setClass(getApplicationContext(), DatePickerActivity.class);
    	} else if (id == 7) {
    		intent.setClass(getApplicationContext(), DatePickerActivity.class);
    	}

		startActivity(intent);
    }
}
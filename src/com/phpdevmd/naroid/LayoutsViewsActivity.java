package com.phpdevmd.naroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LayoutsViewsActivity extends BaseListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

    	String[] layouts_views = getResources().getStringArray(R.array.layouts_views);
    	setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layouts_views));

    	ListView lv = getListView();
    	lv.setTextFilterEnabled(true);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);

		Intent intent = new Intent();

    	if (id == 0) {
    		intent.setClass(getApplicationContext(), LinearLayoutActivity.class);
    	} else if (id == 1) {
    		intent.setClass(getApplicationContext(), RelativeLayoutActivity.class);
    	} else if (id == 2) {
    		intent.setClass(getApplicationContext(), TableLayoutActivity.class);
    	} else if (id == 3) {
    		intent.setClass(getApplicationContext(), GridViewActivity.class);
    	} else if (id == 4) {
    		intent.setClass(getApplicationContext(), TabLayoutActivity.class);
    	} else if (id == 5) {
    		intent.setClass(getApplicationContext(), ListViewActivity.class);
    	}

		startActivity(intent);
    }
}
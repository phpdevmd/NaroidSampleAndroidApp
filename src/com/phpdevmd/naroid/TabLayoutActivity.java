package com.phpdevmd.naroid;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabLayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Reusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, TabLayoutCutActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("cut").setIndicator(res.getString(R.string.Cut),
        				res.getDrawable(R.drawable.ic_tab_cut)).setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, TabLayoutCopyActivity.class);
        spec = tabHost.newTabSpec("copy").setIndicator(res.getString(R.string.Copy),
        				res.getDrawable(R.drawable.ic_tab_copy)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, TabLayoutPasteActivity.class);
        spec = tabHost.newTabSpec("paste").setIndicator(res.getString(R.string.Paste),
        				res.getDrawable(R.drawable.ic_tab_paste)).setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
}
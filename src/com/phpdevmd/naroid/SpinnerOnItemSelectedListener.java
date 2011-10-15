package com.phpdevmd.naroid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class SpinnerOnItemSelectedListener extends BaseActivity implements OnItemSelectedListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
    	String displayText = parent.getContext().getResources().getString(R.string.The_planet_is, parent.getItemAtPosition(pos).toString());
    	Toast.makeText(parent.getContext(), displayText, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView parent) {
    	// Do nothing.
    }
}
package com.example.szidonialaszlo.statusproject;

import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectColor(View v){
        MultiSelectionFragment demo = new MultiSelectionFragment();
        demo.show(getSupportFragmentManager(),"multi_demo");
    }
}

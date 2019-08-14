package com.henry.hidenavigator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
public class RNHideNavigatorManager extends Activity implements OnClickListener {
    View main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = getLayoutInflater().inflate(R.layout.activity_main, null);
        main.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        main.setOnClickListener(this);
        setContentView(main);
    }

    @Override
    public void onClick(View v) {
        int i = main.getSystemUiVisibility();
        if (i == View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) {//2
            main.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
        } else if (i == View.SYSTEM_UI_FLAG_VISIBLE) {//0
            main.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
        } else if (i == View.SYSTEM_UI_FLAG_LOW_PROFILE) {//1
            main.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }
}

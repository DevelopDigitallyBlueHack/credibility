package com.cooperthecoder.validator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by phill on 11/5/2017.
 */

public class Profile extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent go = new Intent(getApplicationContext(), Main.class);
        startActivity(go);
        finish();
    }
}
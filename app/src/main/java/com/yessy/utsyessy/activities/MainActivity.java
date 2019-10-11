package com.yessy.utsyessy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.yessy.utsyessy.R;
import com.yessy.utsyessy.fragments.SejarahFragments;

public class MainActivity extends AppCompatActivity {
    private SejarahFragments sejarahFragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sejarahFragments = new SejarahFragments();
    }

    public void HandleKebudayaanFragments(View view) {
        Intent intent = new Intent(this, KebudayaanActivity.class);
        startActivity(intent);
    }

    public void handleAbout(View view) {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
          }

    public void handleSejarahFragment(View view) {
        Intent intent = new Intent(this, SejarahActivity.class);
        startActivity(intent);
//        getSupportFragmentManager().beginTransaction().replace(this, SejarahActivity.class).commit();
    }
}

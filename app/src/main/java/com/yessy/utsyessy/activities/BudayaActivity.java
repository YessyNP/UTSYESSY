package com.yessy.utsyessy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yessy.utsyessy.R;

public class BudayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);
    }

    public void handleBack2(View view) {
        finish();
    }
}

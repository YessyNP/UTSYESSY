package com.yessy.utsyessy.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yessy.utsyessy.R;

public class KebudayaanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan);
    }

    public void handleSukuActivity(View view) {
        Intent intent = new Intent(this,SukuActivity.class);
        startActivity(intent);
    }

    public void handleBudayaActivity(View view) {
        Intent intent = new Intent(this,BudayaActivity.class);
        startActivity(intent);
    }
}

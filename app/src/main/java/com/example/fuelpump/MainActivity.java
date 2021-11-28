package com.example.fuelpump;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void driver(View view) {
        Intent a1 = new Intent(this,Driver.class);
        startActivity(a1);
        finish();
    }

    public void admin(View view) {
        Intent a2 = new Intent(this,Login.class);
        startActivity(a2);
        finish();
    }
}
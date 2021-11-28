package com.example.fuelpump;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Admin extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        databaseHelper = new DatabaseHelper(this);
    }

    public void readRecords(View view) {
        TextView txtData = (TextView)findViewById(R.id.txtData);
        Cursor cursor = databaseHelper.selectData();
        String data = "";
        if(cursor.getCount() > 0 && cursor != null){
            cursor.moveToFirst();
            do {
                String v1 = cursor.getString(1);
                String v2 = cursor.getString(2);
                String v3 = cursor.getString(3);
                String v4 = cursor.getString(4);
                String v5 = cursor.getString(5);
                String v6 = cursor.getString(6);
                String v7 = cursor.getString(7);
                data += v1 +"    "+ v2 +"    "+ v3 +"    "+ v4 +"    "+ v5 +"    "+ v6 +"    "+ v7 +"\n";
            }while (cursor.moveToNext());
        }
        txtData.setText(data);
    }
}
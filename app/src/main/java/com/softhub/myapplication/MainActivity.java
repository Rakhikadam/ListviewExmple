package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        String[] array = new String[]{"ercfer","erecrece","ercvervre","etvevetvvr","jzhcdfefj"};
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.list_view_row,R.id.text2,array);
        listView.setAdapter(adapter);

    }
}
package com.example.zeeshan.menuworking;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item_about:{
                Toast.makeText(MainActivity.this, "About icon selected", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.item_help: {
                Toast.makeText(MainActivity.this, "About icon selected", Toast.LENGTH_SHORT).show();
                return true;
            }

            default: return super.onOptionsItemSelected(item);
        }
    }
}
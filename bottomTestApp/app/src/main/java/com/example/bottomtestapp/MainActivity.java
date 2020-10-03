package com.example.bottomtestapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_bar_menu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuSettings:
                Toast.makeText(this, "settings were pressed", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.menuAbout:
                Toast.makeText(this, "about was pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.signup:
                Toast.makeText(this, "signup was pressed", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.account:
                Toast.makeText(this, "Account was pressed", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
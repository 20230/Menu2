package com.example.menu1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,1,"登录");
        menu.add(1,1,1,"我的");
        menu.add(2,2,1,"设置");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 0:
                Toast.makeText(MainActivity.this,"登录",Toast.LENGTH_LONG).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this,"我的",Toast.LENGTH_LONG).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"设置",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
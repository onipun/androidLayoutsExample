package com.example.shaufyq.schoollab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class framelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_layouts, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem menuItem){
        int idMenu = menuItem.getItemId();
        Intent intent = null;
        if (idMenu == R.id.linear){
            intent = new Intent(this, linearlayout.class);
        }else if (idMenu == R.id.constrain){
            intent = new Intent(this, constrainlayout.class);
        }else if (idMenu == R.id.relative){
            intent = new Intent(this,RelativeLayout.class);
        }else if (idMenu == R.id.frame){
            return true;
        }else if (idMenu == R.id.table){
            intent = new Intent(this, tableLayout.class);
        }

        startActivity(intent);
        return  super.onOptionsItemSelected(menuItem);
    }
}

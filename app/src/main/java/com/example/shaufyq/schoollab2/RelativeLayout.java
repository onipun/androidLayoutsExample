package com.example.shaufyq.schoollab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        imageView = findViewById(R.id.imgVwRe1);
        textView = findViewById(R.id.txtVwRe1);
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
            return true;
        }else if (idMenu == R.id.frame){
            intent = new Intent(this, framelayout.class);
        }else if (idMenu == R.id.table){
            intent = new Intent(this, tableLayout.class);
        }

        startActivity(intent);
       return  super.onOptionsItemSelected(menuItem);
    }

    public void changeRelative(View view){
        android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
        params.addRule(android.widget.RelativeLayout.BELOW, R.id.txtVwRe1);
        imageView.setLayoutParams(params);

        android.widget.RelativeLayout.LayoutParams paramTxtVw = (android.widget.RelativeLayout.LayoutParams) textView.getLayoutParams();
        paramTxtVw.addRule(android.widget.RelativeLayout.BELOW, R.id.txtVwRe1);
        textView.setLayoutParams(paramTxtVw);



    }
}

package com.example.androidui_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;



 public class MainActivity extends AppCompatActivity {
     EditText editText;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         editText = findViewById(R.id.text);
     }
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         this.getMenuInflater().inflate(R.menu.menu,menu);
         return true;
     }
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.font_10:
                 editText.setTextSize(10*2);
                 break;
             case R.id.font_16:
                 editText.setTextSize(16*2);
                 break;
             case R.id.font_20:
                editText.setTextSize(20*2);
                 break;
             case R.id.plain_item:
                 Toast.makeText(this, "普通菜单项", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.red_font:
                 editText.setTextColor(Color.RED);
                 break;
             case R.id.black_font:
                 editText.setTextColor(Color.BLACK);
                 break;
         }
         return true;
     }
 }

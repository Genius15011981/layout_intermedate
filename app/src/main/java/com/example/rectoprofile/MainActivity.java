package com.example.rectoprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//3-vazifa
//NestedScrollView ichida RecyclerView ishlatilgan misol keltiring hamda uni Emulator da ko`rsating.
        Button btn_3=findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNestedActive();
            }
        });
//4-vazifa
//RecyclerView dagi element ni bosganda yangi ProfileActivity ochilsin . Member objectni ProfileActivity olib o`tib ko`rsating.
        Button btn_4=findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfActive();
            }
        });
//5-vazifa
//RecyclerView dagi Multiple Adapter ishlatib ko`rsating. Va natijani Emulatorda ko`rsating.
        Button btn_5=findViewById(R.id.btn_5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMultiActive();
            }
        });
//6-vazifa
//RecyclerView dagi xar bir element larida Horizontal RecyclerView chiqadigan qiling. Va natijani Emulatorda ko`rsating.
        Button btn_6=findViewById(R.id.btn_6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecVActive();
            }
        });
    }
    void openNestedActive(){
        Intent in=new Intent(this, NestedActivity.class);
        startActivity(in);
    }
    void openProfActive(){
        Intent in=new Intent(this, ProfileActivity.class);
        startActivity(in);
    }
    void openMultiActive(){
        Intent in=new Intent(this, MultiAdapterActivity.class);
        startActivity(in);
    }
    void openRecVActive(){
        Intent in=new Intent(this, RecViewActivity.class);
        startActivity(in);
    }
}
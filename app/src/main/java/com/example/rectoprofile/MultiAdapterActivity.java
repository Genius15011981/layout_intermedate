package com.example.rectoprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MultiAdapterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        Button btn_b=findViewById(R.id.btn_back);
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActive();
            }
        });
    }
    void openMainActive(){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }
}

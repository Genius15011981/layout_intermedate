package com.example.rectoprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecViewActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recv);
    Button btn_b=findViewById(R.id.back_btn);
    btn_b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openMainActivity();
        }
    });
}
    void openMainActivity(){
        Intent in=new Intent(this, MainActivity.class);
        startActivity(in);
    }
}

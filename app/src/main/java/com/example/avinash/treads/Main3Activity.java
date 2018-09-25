package com.example.avinash.treads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        new Thread((new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(4000);
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        })).start();
    }
}

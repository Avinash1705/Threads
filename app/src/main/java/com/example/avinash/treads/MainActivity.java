package com.example.avinash.treads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "rawat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        new Thread((new Runnable() {
            @Override
            public void run() {
            try{
                Log.d(TAG, "tread");
                Thread.sleep(4000);
                Log.d(TAG, "run: thread2");
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
            catch(Exception ex){
                Log.d(TAG, "run: "+ex.toString());
                ex.printStackTrace();
                }
            }
        })).start();

    }
}

package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void sendNow(View view) { // alt + enter
        Toast.makeText(this, "send working", Toast.LENGTH_SHORT).show();
    }
    public void receiveNow(View view) { // alt + enter
        Toast.makeText(this, "receive working", Toast.LENGTH_SHORT).show();
    }
    public void deleteNow(View view) { // alt + enter
        Toast.makeText(this, "Delete working", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
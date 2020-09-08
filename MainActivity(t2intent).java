package com.example.t2intentlatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.explicitintent:
             Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
             startActivity(explicit);
             break;
             default:
                 break;
     }
    }
}

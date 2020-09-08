package com.example.t2intentlatihan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent2;
    Button implicitintent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        explicitintent2 = (Button)findViewById(R.id.explicitintent2);
        explicitintent2.setOnClickListener(this);
        implicitintent2 = (Button)findViewById(R.id.implicitintent2);
        implicitintent2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicitintent2:
                Intent explicit = new Intent(IntentActivity.this, BacaActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicitintent2:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldnovel.online/novel/solo-leveling/"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}

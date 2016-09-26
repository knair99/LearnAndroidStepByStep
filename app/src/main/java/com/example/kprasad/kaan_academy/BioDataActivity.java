package com.example.kprasad.kaan_academy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BioDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata_layout);

        //Now receive data from MainActivity
        String title = getIntent().getStringExtra(MainActivity.KK_TITLE_DATA);
        TextView tv = (TextView) findViewById(R.id.biodata_title);
        tv.setText(title);

    }
}

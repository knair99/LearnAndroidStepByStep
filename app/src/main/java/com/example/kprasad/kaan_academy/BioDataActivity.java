package com.example.kprasad.kaan_academy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BioDataActivity extends AppCompatActivity {

    protected String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata_layout);

        //Now receive data from MainActivity
        title = getIntent().getStringExtra(MainActivity.KK_TITLE_DATA);
        TextView tv = (TextView) findViewById(R.id.biodata_title);
        tv.setText(title);

    }

    public void bioDoneBtnHandler(View view) {

        //How to return data back from activity
        getIntent().putExtra("resultBioActivity", "Looking for another " + title + "? Good luck!" );
        setResult(RESULT_OK, getIntent());
        finish(); //Finish resturns to the calling activity

    }

    public void showGitHubOnClick(View view) {
        Uri github = Uri.parse("https://github.com/knair99?tab=repositories");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, github);
        startActivity(webIntent);
    }
}

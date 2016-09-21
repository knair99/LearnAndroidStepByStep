package com.example.kprasad.kaan_academy;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG_MAINACTIVITY = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_handling_layout);

        //how to handle the button based on id - and listen for events
        Button b = (Button) findViewById(R.id.radioButton);

        Log.d(LOG_TAG_MAINACTIVITY, "onCreate");

        //You create an event listener object and define a function inside it
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Onclick through findViewByID");
            }
        });

        //Activity life cycle demo


        /*
        //2. Now create a reference to the layout
        // type cast to linear layout,
        // since it's a super class view that's returned
        LinearLayout layout = (LinearLayout) findViewById(R.id.progLayout);

        //R = is like the main resource object - get all other resources from here

        //5. Skip till 3,4 -  This is how you specify parameters for layout
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT, //for width
                ActionBar.LayoutParams.WRAP_CONTENT  //for height
        );


        //3. Add three buttons programmatically
        for (int i = 0; i < 3; i ++){
            Button button = new Button(this); //this here refers to a 'context' which is a super class of activity
            button.setText(R.string.click_me_text);


            //6. Skip - This is how we add layout params for styling whatever element
            button.setLayoutParams(params);

            //4. Add it to layout
            layout.addView(button);

        }*/

    }

    //ALC - pause


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG_MAINACTIVITY, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG_MAINACTIVITY, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG_MAINACTIVITY, "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG_MAINACTIVITY, "onStart");
    }


    public void submitButtonHandler(View view) {

        Button b = (Button) view;
        Log.d("MainActivity", "Handling submit request" + b.getText());
    }
}//End of class

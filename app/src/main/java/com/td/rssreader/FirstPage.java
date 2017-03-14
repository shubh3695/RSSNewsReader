package com.td.rssreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*Created by Shubham Saxena
* Date: 27/03/2015*/
public class FirstPage extends Activity {
    Button explore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        explore=(Button)findViewById(R.id.button2);
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this,Begin.class);
                startActivity(i);
            }        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

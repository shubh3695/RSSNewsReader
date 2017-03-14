package com.td.rssreader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*Created by Shubham Saxena
* Date: 27/03/2015*/
public class Begin extends Activity {
    EditText et_txt;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.splash);
        super.onCreate(savedInstanceState);
        et_txt=(EditText)findViewById(R.id.editText);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= et_txt.getText().toString();
                if(str.equalsIgnoreCase(""))
                {
                    Toast.makeText(Begin.this, "Please Enter the URL!!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent mIntent= new Intent(Begin.this, SplashActivity.class);
                    mIntent.putExtra("str",str);
                    startActivity(mIntent); //to next activity of parsing
                }
            }
        });


    }


    }


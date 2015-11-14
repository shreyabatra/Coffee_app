package com.example.shreyabatra.coffe_app;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by shreya batra on 02-11-2015.
 */
public class TextPlay extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);
        Button checkbt=(Button) findViewById(R.id.btresult);
        final ToggleButton passTog=(ToggleButton)findViewById(R.id.tbpassword);
        final EditText input=(EditText)findViewById(R.id.etcommands);
        TextView comm=(TextView) findViewById(R.id.invalidtext);
        passTog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passTog.isChecked()){
                    input.setInputType(InputType.TYPE_CLASS_TEXT |InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }else{
                   input.setInputType(InputType.TYPE_CLASS_TEXT);
                }
        }
          });
    }
}

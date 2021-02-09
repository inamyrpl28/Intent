package com.dycode.edu.intent;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TargetActivity extends AppCompatActivity {

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView) findViewById(R.id.textView);

        //get data
        if(getIntent().getExtras() !=null){
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            txtResult.setText(data);
        }
    }
}

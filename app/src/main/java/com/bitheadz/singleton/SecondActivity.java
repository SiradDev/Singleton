package com.bitheadz.singleton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtSingleton = (TextView)findViewById(R.id.txtSingletonRec);
        //Show the string value of the singleton
        String singletonResultRec = Singleton.getInstance().getString();
        txtSingleton.setText(singletonResultRec);

        Button btnOpen = (Button)findViewById(R.id.btnClose);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

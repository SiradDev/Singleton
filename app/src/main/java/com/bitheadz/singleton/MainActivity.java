package com.bitheadz.singleton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtSingleton = (TextView)findViewById(R.id.txtSingleton);

        String singletonResult = Singleton.getInstance().getString();
        txtSingleton.setText(singletonResult);

        final EditText editText = (EditText)findViewById(R.id.editText);

        //Change the string value and launch intent to SecondActivity
        Button btnOpen = (Button)findViewById(R.id.btnOpen);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!editText.getText().toString().equals("")) {
                    String txtNewValue = editText.getText().toString();
                    Singleton.getInstance().setString(txtNewValue);
                }else {
                    Singleton.getInstance().setString("Singleton");
                }
                onClickOpen();
            }
        });
    }

    public void onClickOpen() {
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        this.startActivity(intent);
    }
}

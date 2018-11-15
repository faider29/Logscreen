package com.example.faide.logscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ET = findViewById(R.id.etpassnomb);
        ET.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }

}

package com.example.madaim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onButtonClick(View view) {


        EditText firstName = (EditText) findViewById(R.id.editText);
        EditText lastName = (EditText) findViewById(R.id.editText2);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        int gender = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(gender);
        String genderS = rb.getText().toString();
        String stringToPassBack = firstName.getText().toString();
        String stringToPassBack2 = lastName.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("firstName", stringToPassBack);
        intent.putExtra("lastName", stringToPassBack2);
        intent.putExtra("gender", genderS);
        setResult(RESULT_OK, intent);
        finish();
    }
}


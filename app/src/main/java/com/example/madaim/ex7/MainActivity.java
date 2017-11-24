
package com.example.madaim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.madaim.ex7.R.layout.activity_main;

public class MainActivity extends Activity {
    final int REGISTER_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2 (View view){
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivityForResult(intent,REGISTER_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REGISTER_CODE)
        {
            String gender;

            if(data.getStringExtra("gender").compareTo("Male")==0){
                gender = "Mr. ";
            }
            else{
                gender = "Ms. ";
            }
            String returnString = "Welcome back "+gender+" "+data.getStringExtra("firstName")+", "+data.getStringExtra("lastName");
            TextView textView = (TextView)findViewById(R.id.textView);
            Button b = (Button) findViewById(R.id.button);
            b.setText("again...");
            textView.setText(returnString);
        }
    }


}

package com.example.newone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView factsCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factsCheck = findViewById(R.id.factsView);
        String[] myfacts = Facts.getData();

        for(String facts: myfacts){
            factsCheck.append(facts + "\n\n");

        }

    }


}

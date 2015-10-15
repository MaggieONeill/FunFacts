package com.example.maggieoneill.funfacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare our view variables and assign views from layout file

        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the button was clicked , so update the fact label with new fact
                String fact = "";
                //randomly select a fact
                Random randomGenerator = new Random();//construct a new random number generator
                int randomNumber = randomGenerator.nextInt(3);
                fact =  randomNumber + "";

                //update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

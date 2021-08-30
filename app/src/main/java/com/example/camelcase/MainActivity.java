package com.example.camelcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Connect XML to Java Code - 4 Widgets ; 2 TextViews , 1 EditText and 1 Button
    private TextView title, camelDisplayWord;
    private EditText camelCaseInput;
    private Button camelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        camelDisplayWord = findViewById(R.id.camel_display_word);
        camelCaseInput = findViewById(R.id.camel_case_input);
        camelButton = findViewById(R.id.camel_button);

        camelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncamelFy();
            }
        });
    }

    // Function will take user's input and remove camel case, then display un-cameled word in textView.
    private void uncamelFy() {
        String splitCamel = "";
        String camelCaseString = camelCaseInput.getText().toString();
        String[] camelCaseArray = camelCaseString.split("");

        for (int i = 0; i < camelCaseString.length(); i++) {
            if (camelCaseArray[i] == camelCaseArray[i].toUpperCase()) {
                splitCamel += " " + camelCaseArray[i];
            } else {
                splitCamel += camelCaseArray[i];
            }
        }
        camelDisplayWord.setText(splitCamel);
    }


}
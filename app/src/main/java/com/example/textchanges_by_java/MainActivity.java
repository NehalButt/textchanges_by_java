package com.example.textchanges_by_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textbyuser;
    TextView textchangebyjava;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textbyuser=(EditText) findViewById(R.id.textbyuser);
        textchangebyjava=(TextView) findViewById(R.id.textchangebyjava);
    }
    public void textchangesbyjava(View view){
        textchangebyjava.setText(textbyuser.getText());
        Toast.makeText(this, "Textchanged", Toast.LENGTH_SHORT).show();
    }
}
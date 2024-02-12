package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        EditText editText1=findViewById(R.id.editTextTextPersonName2);
        Button button=findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);
        TextView textView=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar=Integer.parseInt(editText.getText().toString());
                Dortgen kare=new Dortgen(kenar);
                alan= kare.alanbul();
                textView.setText(alan.toString());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisakenar=  Integer.parseInt(editText.getText().toString());
                Integer uzunkenar=Integer.parseInt(editText1.getText().toString());
                Integer alan;
                Dortgen dikdortgen=new Dortgen(kisakenar,uzunkenar);
                alan=dikdortgen.alanbul();
                textView.setText(alan.toString());
            }
        });
    }
}
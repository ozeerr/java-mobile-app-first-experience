package com.example.basic_java_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    ConstraintLayout mainbackground;

 CheckBox cbred,cbblue,cbgreen;
 Button btnPrint;
 EditText name,surname;
 TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbred=findViewById(R.id.checkBox_red);
        cbblue=findViewById(R.id.checkBox_blue);
        cbgreen=findViewById(R.id.checkBox_green);

        mainbackground=findViewById(R.id.mainbg);

        name=(EditText)findViewById(R.id.name_input);
        surname=(EditText)findViewById(R.id.lastname_input);
        result=(TextView)findViewById(R.id.result_txt);
        btnPrint=findViewById(R.id.button2);

        btnPrint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstinput=name.getText().toString();
                String secondinput=surname.getText().toString();
                String resulttext=firstinput+" "+secondinput;
                result.setText(resulttext);
            }
        });

        cbred.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbblue.setEnabled(false);
                    cbgreen.setEnabled(false);
                    mainbackground.setBackground(new ColorDrawable(Color.RED));

                } else {
                    cbblue.setEnabled(true);
                    cbgreen.setEnabled(true);
                    mainbackground.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });

        cbblue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbred.setEnabled(false);
                    cbgreen.setEnabled(false);
                    mainbackground.setBackground(new ColorDrawable(Color.BLUE));

                } else {
                    cbred.setEnabled(true);
                    cbgreen.setEnabled(true);
                    mainbackground.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });

        cbgreen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbblue.setEnabled(false);
                    cbred.setEnabled(false);
                    mainbackground.setBackground(new ColorDrawable(Color.GREEN));
                } else {
                    cbblue.setEnabled(true);
                    cbred.setEnabled(true);
                    mainbackground.setBackground(new ColorDrawable(Color.WHITE));

                }
            }
        });



    }



}
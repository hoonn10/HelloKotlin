package com.androidapp.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightField, weightField;
    TextView txtResult;
    Button btnBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightField = findViewById(R.id.heightField);
        weightField = findViewById(R.id.weightField);
        txtResult = findViewById(R.id.txtResult);
        btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* String height = heightField.getText().toString();
                String weight = weightField.getText().toString(); //toString()문자열로 바꿔줌*/

                /*if(!weightField.getText().toString().isEmpty() && !heightField.getText().toString().isEmpty()) {
                    if(height != null && weight !=null) {
                        double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(height)/100., 2);
                        txtResult.setText("Your Bmi: " + bmi);
                    }
                    else{
                        txtResult.setText("Input missing");
                    }
                }*/

                try{    //try부분에 있는것을 실행해라 하지만 문제가 생기면 catch부분을 실행해라
                    String sheight = heightField.getText().toString();
                    String sweight = weightField.getText().toString();
                    double bmi = Double.parseDouble(sweight) / Math.pow(Double.parseDouble(sheight)/100., 2);
                    txtResult.setText("Your Bmi: " + bmi);
                }catch(Exception e){
                    txtResult.setText("Input missing");

                }
            }
        });

    }
}
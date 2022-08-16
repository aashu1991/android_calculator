package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global scope
    EditText editView_num1, editView_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Local scope
        Button button_0 = findViewById(R.id.button_0);
        Button button_point = findViewById(R.id.button_point);

        Button button_1 = findViewById(R.id.Button_1);
        Button button_2 = findViewById(R.id.button_2);
        Button button_3 = findViewById(R.id.button_3);
        Button button_add = findViewById(R.id.button_add);
        Button button_4 = findViewById(R.id.button_4);
        Button button_5 = findViewById(R.id.button_5);
        Button button_6 = findViewById(R.id.button_6);
        Button button_subtract = findViewById(R.id.button_subtract);
        Button button_7 = findViewById(R.id.button_7);
        Button button_8 = findViewById(R.id.button_8);
        Button button_9 = findViewById(R.id.button_9);
        Button button_multiply = findViewById(R.id.button_multiply);
        Button button_Ac = findViewById(R.id.button_Ac);
        Button button_Clr = findViewById(R.id.button_Clr);
        Button button_percentage = findViewById(R.id.button_percentage);
        Button button_divide = findViewById(R.id.button_divide);
        ImageView enter_image = findViewById(R.id.enter_image);

        Button button_equals = findViewById(R.id.button_equals);
        editView_num1 = findViewById(R.id.editView_num1);
        editView_num1.setShowSoftInputOnFocus(false);
        editView_num2 = findViewById(R.id.editView_num2);
        editView_num2.setShowSoftInputOnFocus(false);

        EditText operator_symbol = findViewById(R.id.operator_symbol);
        operator_symbol.setShowSoftInputOnFocus(false);

        TextView textView_result = findViewById(R.id.textView_result);



        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_0.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_point.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_1.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_2.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_3.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_add.getText().toString();
                operator_symbol.setText(name);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_4.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_5.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_6.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_subtract.getText().toString();
                operator_symbol.setText(name);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_7.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_8.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_9.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_multiply.getText().toString();
                operator_symbol.setText(name);
            }
        });

        button_Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Empty = "";
                editView_num1.setText(Empty);
                editView_num2.setText(Empty);
                operator_symbol.setText(Empty);
                textView_result.setText(Empty);
            }
        });

        button_Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_Clr.getText().toString();
                setButtonValueInEditText(name);
            }
        });

        button_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_percentage.getText().toString();
                operator_symbol.setText(name);
            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = button_divide.getText().toString();
                operator_symbol.setText(name);
            }
        });

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editView_num1.getText().toString());
                double num2 = Double.parseDouble(editView_num2.getText().toString());

                String operator = operator_symbol.getText().toString();
                Log.e("operator", operator);
                if (operator.equals("+")) {
                    double num3 = num1 + num2;
                    textView_result.setText(String.valueOf(num3));
                } else if (operator.equals("-")) {
                    double num3 = num1 - num2;
                    textView_result.setText(String.valueOf(num3));
                } else if (operator.equals("*")) {
                    double num3 = num1 * num2;
                    textView_result.setText(String.valueOf(num3));
                } else if (operator.equals("/")) {
                    double num3 = num1 / num2;
                    textView_result.setText(String.valueOf(num3));
                } else if (operator.equals("%")) {
                    double num3 = ((double) num1 * (double) num2) / 100;
                    Log.e("Num3", "" + num3);
                    textView_result.setText(String.valueOf(num3));
                }
            }

        });

        button_Clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editView_num1.hasFocus()) {
                    String old_value = editView_num1.getText().toString();
                    int length = old_value.length();
                    if (length <= 0) return;
                    String final_value = old_value.substring(0, length - 1);
                    //11234, length = 5 , start = 0 end = length - 1 => 4
                    // final_value = 0 => 1 to 3 => 3
                    editView_num1.setText(final_value);
                } else if (editView_num2.hasFocus()) {
                    String old_value = editView_num2.getText().toString();
                    int length = old_value.length();
                    if (length <= 0) return;
                    String final_value = old_value.substring(0, length - 1);
                    editView_num2.setText(final_value);
                }

            }
        });

        enter_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editView_num1.hasFocus()) {
                    editView_num2.requestFocus();
                } else if (editView_num2.hasFocus()) {
                    operator_symbol.requestFocus();
                }
            }
        });
    }

    public void setButtonValueInEditText(String name) {
        if (editView_num1.hasFocus()) {
            String old_value = editView_num1.getText().toString();
            String final_value = old_value + name;
            editView_num1.setText(final_value);
        } else if (editView_num2.hasFocus()) {
            String old_value = editView_num2.getText().toString();
            String final_value = old_value + name;
            editView_num2.setText(final_value);
        }
    }


}
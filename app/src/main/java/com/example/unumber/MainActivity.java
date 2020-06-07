package com.example.unumber;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int di = 100;
    int anka = (int) (Math.random() * di);
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        EditText Input = (EditText) findViewById(R.id.Input);
    }

    public void onClick(View view) {
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        EditText Input = (EditText) findViewById(R.id.Input);
        String pi = String.valueOf(Input.getText());
        if (pi.length()==0){
            textView3.setText("Строка пуста.");
            return;
        }
        char[] chars = pi.toCharArray();
        List<Character> chisla = new ArrayList<Character>();
        chisla.add('0');
        chisla.add('1');
        chisla.add('2');
        chisla.add('3');
        chisla.add('4');
        chisla.add('5');
        chisla.add('6');
        chisla.add('7');
        chisla.add('8');
        chisla.add('9');
        for (int i = 0; i < Input.length(); i++) {
            if (!(chisla.contains(chars[i]))) {
                textView3.setText("Строка содержит не числа \nили не только числа");
                return;
            }
        }
        Integer d = Integer.parseInt(pi);
        if (d>100){
            textView3.setText("Введённое число больше максимального \nВведённое число: "+d);
            return;
        }
        if (anka == d){
            textView3.setText("Молодец, ты угадал число.");
            Input.setText("");
            anka = (int) (Math.random() * di);
            return;
        }
        if (anka < d)
            textView3.setText("Напиши число по-меньше.");
        if (anka > d)
            textView3.setText("Напиши число по-больше.");

    }
}

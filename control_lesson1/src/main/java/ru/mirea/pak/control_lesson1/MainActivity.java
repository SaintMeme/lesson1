package ru.mirea.pak.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = findViewById(R.id.textView6);
        TextView myTextView = (TextView) findViewById(R.id.textView6);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button);
        button.setText("MireaButton");
    }
}
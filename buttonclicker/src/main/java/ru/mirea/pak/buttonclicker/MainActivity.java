package ru.mirea.pak.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 16");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);

        View.OnClickListener oclСheckBox = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Нажат чекбокс");
            }
        };
        checkBox.setOnClickListener(oclСheckBox);
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }
}
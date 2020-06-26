package com.hello.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText firstName;
    EditText lastName;
    EditText age;
    TextView warning;
    Switch Switch;
    Boolean switchCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // нахождение элементов по id
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        warning = findViewById(R.id.warning);
        age = findViewById(R.id.age);
        Switch = findViewById(R.id.switch1);

    }

    public void goToNextActivity(View view) {
        // проверка на пустоту полей
        if(firstName.getText().toString().trim().equals("") || lastName.getText().toString().trim().equals("")){
            warning.setVisibility(View.VISIBLE);
        } else{
            // создание нового объекта intent, и запуск новой активности при клике, добавление экстр в intent.
            intent = new Intent(this, ActivityInfo.class);
            intent.putExtra("switch", Switch.isChecked());
            intent.putExtra("age", age.getText().toString());
            intent.putExtra("firstName", firstName.getText().toString());
            intent.putExtra("lastName", lastName.getText().toString());
            startActivity(intent);
        }
    }
}

package com.example.GoalGuide;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.test.R;

public class RegisterActivity extends AppCompatActivity {

    private CheckBox license;
    private Spinner spinner;
    private Button withAccountButton;
    private Button signupButton;
    private TextView usernameDark;
    private TextView emailDark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_register), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usernameDark = findViewById(R.id.usernameDark);
        emailDark = findViewById(R.id.emailDark);
        license = findViewById(R.id.termsCheck);

        SharedPreferences sharedPref = getSharedPreferences("MyData", MODE_PRIVATE);
        String username = sharedPref.getString("username", "");
        String email = sharedPref.getString("email", "");

        spinner = findViewById(R.id.countryDark);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.custom_spinner, getResources().getStringArray(R.array.countries));
        spinner.setAdapter(adapter);

        withAccountButton = findViewById(R.id.withAccDark);
        withAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        signupButton = findViewById(R.id.signupBttDark);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!license.isChecked())
                    Toast.makeText(RegisterActivity.this, "You must accept the terms and conditions", Toast.LENGTH_SHORT).show();

                else {
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("username", usernameDark.getText().toString());
                    editor.putString("email", emailDark.getText().toString());
                    editor.apply();

                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
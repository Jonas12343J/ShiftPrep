package com.example.GoalGuide;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.test.R;

public class ProfileActivity extends AppCompatActivity {

    private Button save, editPfp, back;
    private TextView name_profile, email_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        SharedPreferences sharedPref = getSharedPreferences("MyData", MODE_PRIVATE);
        String username = sharedPref.getString("username", "");
        String email = sharedPref.getString("email", "");

        back = findViewById(R.id.back_profile);
        save = findViewById(R.id.save_profile);

        name_profile = findViewById(R.id.name_profile);
        email_profile = findViewById(R.id.email_profile);

        name_profile.setText(username);
        if (email.isEmpty()) {
            email = username + "@example.com";
        }
        email_profile.setText(email);


        back.setOnClickListener(v -> finish());
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("username", name_profile.getText().toString());
                editor.putString("email", email_profile.getText().toString());
                editor.apply();

                Toast.makeText(ProfileActivity.this, "Saved changes", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }


}
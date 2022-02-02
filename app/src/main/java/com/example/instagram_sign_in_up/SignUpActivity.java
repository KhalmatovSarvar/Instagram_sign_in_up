package com.example.instagram_sign_in_up;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    EditText et_fullname, et_email, et_password, et_confirm_password;
    Button btn_sign_up;
    TextView tv_sign_in;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initViews();
    }

    private void initViews() {

        et_fullname = findViewById(R.id.et_fullname);
        et_email = findViewById(R.id.et_email_sign_up);
        et_password = findViewById(R.id.et_password_sign_up);
        et_confirm_password = findViewById(R.id.et_confirm_password_sign_up);
        btn_sign_up = findViewById(R.id.btn_sign_up);
        tv_sign_in = findViewById(R.id.tv_sign_in);

        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomePage();
            }
        });
        tv_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignInPage();
            }
        });
    }

    private void openSignInPage() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    private void openHomePage() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();

    }



}
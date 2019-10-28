package com.crowxxx.fake_qq;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class LoginActivity extends AppCompatActivity {
    EditText edt_username;
    EditText edt_password;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_test);
    }
    public void login(View view) {
        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
    }
}

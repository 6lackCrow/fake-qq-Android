package com.crowxxx.fake_qq;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RegsiterActivity extends AppCompatActivity {
    EditText edt_username;
    EditText edt_password;
    EditText edt_confirm;
    EditText edt_nickname;
    TextView tv_msg;
    String jsonStr;
    Button btn_registerAndLogin;
    int status_register = 0;

    public void findId(){
        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        edt_confirm = findViewById(R.id.edt_confirm);
        edt_nickname = findViewById(R.id.edt_nickname);
        tv_msg = findViewById(R.id.tv_msg);
        btn_registerAndLogin = findViewById(R.id.btn_registerAndLogin);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsiter);
        findId();
        btn_registerAndLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username = edt_username.getText().toString();
                String password = edt_password.getText().toString();
                String confirm = edt_confirm.getText().toString();
                String nickname = edt_nickname.getText().toString();
                if (username.equals("")||password.equals("")||confirm.equals("")||nickname.equals("")){
                    tv_msg.setText("以上信息不能为空");
                    return;
                }
                if(!password.equals(confirm)){
                    tv_msg.setText("密码与确认密码不一致");
                    return;
                }
                OkHttpClient client = new OkHttpClient();
                final FormBody.Builder formBody = new FormBody.Builder();
                formBody.add("username",username).add("password",password).add("nickname",nickname);
                Request request = new Request.Builder()//创建Request 对象。
                        .url("http://182.92.118.21:8080/register")
                        .post(formBody.build())//传递请求体
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        if(response.code()>=500){
                            tv_msg.setText("用户名已被注册");
                            return;
                        }
                        status_register = response.code();
                        jsonStr = response.body().string();
                        JSONObject jsonObject = JSON.parseObject(jsonStr);
                        Account account = jsonObject.toJavaObject(Account.class);
                        tv_msg.setText(  account.getUsername()+"注册成功");
                    }
                });
            }
        });
    }

    public void backLastActivity(View view) {
        RegsiterActivity.this.finish();
    }

}

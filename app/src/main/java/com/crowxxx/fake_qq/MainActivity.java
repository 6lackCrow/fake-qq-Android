package com.crowxxx.fake_qq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        JSONObject jsonObject = new JSONObject().parseObject(jsonStr);
//        JSONArray jsonArray = jsonObject.getJSONArray("users");
//        List<User> list = new ArrayList<User>();
//
//        for(int i = 0;i < jsonArray.size();i++){
//            User user = jsonArray.getJSONObject(i).toJavaObject(User.class);
//            list.add(user);
//        }



    }


    String jsonStr = "{\n" +
            "  \"users\": [\n" +
            "    {\n" +
            "      \"id\": 2558050,\n" +
            "      \"slug\": \"d99a7dfae9e4\",\n" +
            "      \"nickname\": \"闃挎爤\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\",\n" +
            "      \"total_likes_count\": 1559,\n" +
            "      \"total_wordage\": 472764,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 278,\n" +
            "      \"slug\": \"paQcNW\",\n" +
            "      \"nickname\": \"閭撳摬\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/278/3d103a3cbb96.jpg\",\n" +
            "      \"total_likes_count\": 1272,\n" +
            "      \"total_wordage\": 412683,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 13213889,\n" +
            "      \"slug\": \"080bb4eac1c9\",\n" +
            "      \"nickname\": \"鏃犻檺鐚村瓙\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg\",\n" +
            "      \"total_likes_count\": 2221,\n" +
            "      \"total_wordage\": 412681,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 52841,\n" +
            "      \"slug\": \"8f5b45499715\",\n" +
            "      \"nickname\": \"闂\uE0A3辰鍗�\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/52841/251f5481-67b6-4bf0-86f4-faac9768beb3.jpeg\",\n" +
            "      \"total_likes_count\": 4438,\n" +
            "      \"total_wordage\": 252039,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2558050,\n" +
            "      \"slug\": \"d99a7dfae9e4\",\n" +
            "      \"nickname\": \"闃挎爤\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\",\n" +
            "      \"total_likes_count\": 1559,\n" +
            "      \"total_wordage\": 472764,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 278,\n" +
            "      \"slug\": \"paQcNW\",\n" +
            "      \"nickname\": \"閭撳摬\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/278/3d103a3cbb96.jpg\",\n" +
            "      \"total_likes_count\": 1272,\n" +
            "      \"total_wordage\": 412683,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 13213889,\n" +
            "      \"slug\": \"080bb4eac1c9\",\n" +
            "      \"nickname\": \"鏃犻檺鐚村瓙\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg\",\n" +
            "      \"total_likes_count\": 2221,\n" +
            "      \"total_wordage\": 412681,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 52841,\n" +
            "      \"slug\": \"8f5b45499715\",\n" +
            "      \"nickname\": \"闂\uE0A3辰鍗�\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/52841/251f5481-67b6-4bf0-86f4-faac9768beb3.jpeg\",\n" +
            "      \"total_likes_count\": 4438,\n" +
            "      \"total_wordage\": 252039,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2558050,\n" +
            "      \"slug\": \"d99a7dfae9e4\",\n" +
            "      \"nickname\": \"闃挎爤\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\",\n" +
            "      \"total_likes_count\": 1559,\n" +
            "      \"total_wordage\": 472764,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 278,\n" +
            "      \"slug\": \"paQcNW\",\n" +
            "      \"nickname\": \"閭撳摬\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/278/3d103a3cbb96.jpg\",\n" +
            "      \"total_likes_count\": 1272,\n" +
            "      \"total_wordage\": 412683,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 13213889,\n" +
            "      \"slug\": \"080bb4eac1c9\",\n" +
            "      \"nickname\": \"鏃犻檺鐚村瓙\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg\",\n" +
            "      \"total_likes_count\": 2221,\n" +
            "      \"total_wordage\": 412681,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 52841,\n" +
            "      \"slug\": \"8f5b45499715\",\n" +
            "      \"nickname\": \"闂\uE0A3辰鍗�\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/52841/251f5481-67b6-4bf0-86f4-faac9768beb3.jpeg\",\n" +
            "      \"total_likes_count\": 4438,\n" +
            "      \"total_wordage\": 252039,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2558050,\n" +
            "      \"slug\": \"d99a7dfae9e4\",\n" +
            "      \"nickname\": \"闃挎爤\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/2558050/7761b285-2805-4534-9870-ba7dcc7538ec.jpg\",\n" +
            "      \"total_likes_count\": 1559,\n" +
            "      \"total_wordage\": 472764,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 278,\n" +
            "      \"slug\": \"paQcNW\",\n" +
            "      \"nickname\": \"閭撳摬\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/278/3d103a3cbb96.jpg\",\n" +
            "      \"total_likes_count\": 1272,\n" +
            "      \"total_wordage\": 412683,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 13213889,\n" +
            "      \"slug\": \"080bb4eac1c9\",\n" +
            "      \"nickname\": \"鏃犻檺鐚村瓙\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/13213889/7314c5cc-ca7f-4542-b914-2c8dffaf324d.jpg\",\n" +
            "      \"total_likes_count\": 2221,\n" +
            "      \"total_wordage\": 412681,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 52841,\n" +
            "      \"slug\": \"8f5b45499715\",\n" +
            "      \"nickname\": \"闂\uE0A3辰鍗�\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/52841/251f5481-67b6-4bf0-86f4-faac9768beb3.jpeg\",\n" +
            "      \"total_likes_count\": 4438,\n" +
            "      \"total_wordage\": 252039,\n" +
            "      \"is_following_user\": false\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 7416466,\n" +
            "      \"slug\": \"e7dd0b3c7b70\",\n" +
            "      \"nickname\": \"鑰佹矆1\",\n" +
            "      \"avatar_source\": \"http://upload.jianshu.io/users/upload_avatars/7416466/fc1a1a0d-e3c7-4bca-9720-028c5c9914f3.jpg\",\n" +
            "      \"total_likes_count\": 700,\n" +
            "      \"total_wordage\": 133741,\n" +
            "      \"is_following_user\": false\n" +
            "    }\n" +
            "  ],\n" +
            "  \"total_count\": 39415\n" +
            "}";

    public void starRegisterActivity(View view) {
        startActivity(new Intent(MainActivity.this,RegsiterActivity.class));
    }

    EditText edt_username;
    EditText edt_password;
    ImageView iv_login;
    TextView tv_login_msg;
    public void findView(){
        edt_username = findViewById(R.id.edt_login_Username);
        edt_password = findViewById(R.id.edt_login_password);
        iv_login = findViewById(R.id.iv_login);
        tv_login_msg = findViewById(R.id.tv_login_msg);
    }
    public void userLogin(View view) {
        findView();
        String username = edt_username.getText().toString();
        String password = edt_password.getText().toString();

        OkHttpClient client = new OkHttpClient();
        FormBody.Builder fromBody = new FormBody.Builder();
        fromBody.add("username",username).add("password",password);

        Request request = new Request.Builder().url("http://182.92.118.21:8080/login").post(fromBody.build()).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.code()==200){
                    tv_login_msg.setText(response.body().string());
                    return;
                }
                tv_login_msg.setText("用户名或密码错误");
            }
        });

    }
}

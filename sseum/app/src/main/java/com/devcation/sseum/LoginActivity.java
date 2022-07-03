package com.devcation.sseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnJoin = findViewById(R.id.btnjoin);
        btnJoin.setOnClickListener(view -> {
            moveJoinActivity();
        });

        Button btnJLogin = findViewById(R.id.btnlogin);
        btnJLogin.setOnClickListener(view -> {
            moveRootActivity();
        });

    }

    private void moveJoinActivity(){
        Intent intent = new Intent(LoginActivity.this, JoinActivity.class);
        startActivityResult.launch(intent);
    }

    private void moveRootActivity(){
        Intent intent = new Intent(LoginActivity.this, RootActivity.class);
        startActivityResult.launch(intent);
    }

    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == Activity.RESULT_OK) {
                        Bundle bundle = result.getData().getExtras();
                        String join = bundle.getString("join");
                        Log.d("join",join);

                        //
                    }
                }
            }
    );

}
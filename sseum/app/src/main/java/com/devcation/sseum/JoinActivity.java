package com.devcation.sseum;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    EditText edtEmail;
    EditText edtPw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        edtEmail = findViewById(R.id.edtEmail);
        edtPw = findViewById(R.id.edtPw);

        Button btnSingUp = findViewById(R.id.btnSignUp);
        btnSingUp.setOnClickListener(view -> {
            Log.d("joinact","btnSignup");

            AlertDialog.Builder builder = new AlertDialog.Builder(JoinActivity.this);
            builder.setTitle("join");
            builder.setMessage("join join");
            builder.setIcon(android.R.drawable.ic_lock_lock);
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(getApplicationContext(), "join yes", Toast.LENGTH_SHORT).show();
//                    Intent intent = getIntent();
//                    intent.putExtra("join",edtName.getText().toString());
//
//                    setResult(RESULT_OK, intent);
                    Intent intent = getIntent();
                    intent.putExtra("email","test data");
                    intent.putExtra("password","test data");
                    setResult(RESULT_OK, intent);




                    finish();
                }
            });
            builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(getApplicationContext(), "join no", Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                    edtPw.setText("");
                }
            });

            AlertDialog dialog = builder.create();
            dialog.show();

        });

    }
}
//package com.chatapp.pritesh.Activities;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//import com.chatapp.pritesh.R;
//
//public class Login_call extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_call);
//
//        if (ContextCompat.checkSelfPermission(Login_call.this,
//                Manifest.permission.RECORD_AUDIO) !=
//                PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission
//                (Login_call.this, Manifest.permission.READ_PHONE_STATE)
//                != PackageManager.PERMISSION_GRANTED ) {
//            ActivityCompat.requestPermissions(Login_call.this,
//                    new String[]{Manifest.permission.RECORD_AUDIO, Manifest.permission.READ_PHONE_STATE},
//                    1);
//        }
//
//        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Call2.class);
//                intent.putExtra("callerId", ((TextView) findViewById(R.id.callerId)).getText().toString());
//                intent.putExtra("recipientId", ((TextView) findViewById(R.id.recipientId)).getText().toString());
//                startActivity(intent);
//            }
//        });
//    }
//}
package com.please.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


public class NextActivity extends AppCompatActivity {

    private Button btn_next;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String svbt = "svbt";
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sv();
                Toast.makeText(getApplicationContext(),"성공적으로 저장되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }

    public void sv(){
        String svbt = "svbt";
        SharedPreferences pref = getSharedPreferences("pref",0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(svbt,R.layout.activity_next);
        editor.commit();
    }

}

package com.please.myapp.scene20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;
import com.please.myapp.scene21.TwentyoneOne;

public class TwentyNine extends AppCompatActivity {
    private Button btn_next;
    private Button btn_prev;
    private Button btn_nextNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_twenty_nine);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwentyNine.this, TwentyoneOne.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
        btn_nextNo = findViewById(R.id.btn_no);
        btn_nextNo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwentyNine.this, TwentyTen.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        } );

        btn_prev = findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_prev.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(TwentyNine.this, TwentyEight.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                });
            }
        });


    }public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }

}


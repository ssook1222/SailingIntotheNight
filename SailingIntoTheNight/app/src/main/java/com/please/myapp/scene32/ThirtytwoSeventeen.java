package com.please.myapp.scene32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;
import com.please.myapp.scene33.ThirtythreeOne;

public class ThirtytwoSeventeen extends AppCompatActivity {
    private Button btn_next;
    private Button btn_prev;
    private Button btn_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_thirtytwo_seventeen);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirtytwoSeventeen.this, ThirtythreeOne.class);
                startActivity(intent);
            }
        });

    }public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }

}


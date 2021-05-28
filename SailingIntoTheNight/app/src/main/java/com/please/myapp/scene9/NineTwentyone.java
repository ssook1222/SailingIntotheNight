package com.please.myapp.scene9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.please.myapp.MainActivity;
import com.please.myapp.MusicService;
import com.please.myapp.R;

public class NineTwentyone extends AppCompatActivity {
    private Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_twentyone);
        btn_next = findViewById(R.id.button_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NineTwentyone.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }
}

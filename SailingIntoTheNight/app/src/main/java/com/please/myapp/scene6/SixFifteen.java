package com.please.myapp.scene6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;

public class SixFifteen extends AppCompatActivity {
    private Button btn_next;
    private Button btn_nextNo;
    private Button btn_prev;
    public boolean sora=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_six_fifteen);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sora=true;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("check",sora);
                editor.commit();

                boolean checkIt = pref.getBoolean("check",false);
                if(checkIt==true){
                    Intent intent = new Intent(SixFifteen.this, SixSixteen.class);
                    startActivity(intent);
                }

            }
        });

        btn_nextNo =findViewById(R.id.btn_no);
        btn_nextNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sora=false;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("check",sora);
                editor.commit();
                boolean checkIt = pref.getBoolean("check",true);
                if(checkIt == false){
                    Intent intent = new Intent(SixFifteen.this, SixSeventeen.class);
                    startActivity(intent);
                }

            }
        });

        btn_prev = findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_prev.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SixFifteen.this, SixFourteen.class);
                        startActivity(intent);
                        overridePendingTransition(0,0);
                    }
                });
            }
        });


    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }

}

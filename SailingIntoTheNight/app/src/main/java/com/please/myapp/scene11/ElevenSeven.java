package com.please.myapp.scene11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;
import com.please.myapp.scene12.TwelveOne;
import com.please.myapp.scene12.TwelveThirteen;

public class ElevenSeven extends AppCompatActivity {
    private Button btn_next;
    private Button btn_nextNo;
    private Button btn_prev;
    public boolean flower=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_eleven_seven);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flower=false;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("flower",flower);
                editor.commit();

                boolean checkIt = pref.getBoolean("flower",false);
                if(checkIt==false){
                    Intent intent = new Intent(ElevenSeven.this, TwelveThirteen.class);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }

            }
        });

        btn_nextNo =findViewById(R.id.btn_no);
        btn_nextNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flower=true;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("flower",flower);
                editor.commit();
                boolean checkIt = pref.getBoolean("flower",true);
                if(checkIt == true){
                    Intent intent = new Intent(ElevenSeven.this, TwelveOne.class);
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
                        Intent intent = new Intent(ElevenSeven.this, ElevenSix.class);
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

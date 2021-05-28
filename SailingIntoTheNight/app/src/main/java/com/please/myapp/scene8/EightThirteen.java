package com.please.myapp.scene8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;
import com.please.myapp.scene9.NineOne;
import com.please.myapp.scene9.NineThirteen;

public class EightThirteen extends AppCompatActivity {
    private Button btn_next;
    private Button btn_prev;
    private Button btn_nextNo;
    public boolean butak=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_eight_thirteen);

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butak=true;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("butak",butak);
                editor.commit();
                boolean checkIt = pref.getBoolean("butak",false);
                if(checkIt == true){
                    Intent intent = new Intent(EightThirteen.this, NineOne.class);
                    startActivity(intent);
                }
            }
        });

        btn_nextNo =findViewById(R.id.btn_no);
        btn_nextNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butak=false;
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("butak",butak);
                editor.commit();
                boolean checkIt = pref.getBoolean("butak",true);
                if(checkIt == false){
                    Intent intent = new Intent(EightThirteen.this, NineThirteen.class);
                    startActivity(intent);
                }

            }
        });
        btn_prev = findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EightThirteen.this, EightTwelve.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }
}


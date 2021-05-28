package com.please.myapp.scene16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.MusicService;
import com.please.myapp.R;
import com.please.myapp.scene17.SeventeenOne;

public class SixteenNineteen extends AppCompatActivity {
    private Button btn_paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sixteen_nineteen);

        //페인트 줌 - 페인트 없음
        btn_paint = findViewById(R.id.button_paint);
        btn_paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = getSharedPreferences("pref",0);
                SharedPreferences.Editor editor = pref.edit();
                boolean paint = false;
                editor.putBoolean("paint",paint);
                editor.commit();
                boolean checkIt =pref.getBoolean("paint",false);
                if(checkIt==false){
                    Intent intent = new Intent(SixteenNineteen.this, SeventeenOne.class);
                    startActivity(intent);
                    overridePendingTransition(0,0);
                }
            }
        });


    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }

}


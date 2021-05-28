package com.please.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.please.myapp.scene10.TenEight;
import com.please.myapp.scene10.TenFive;
import com.please.myapp.scene10.TenFour;
import com.please.myapp.scene10.TenNine;
import com.please.myapp.scene10.TenOne;
import com.please.myapp.scene10.TenSeven;
import com.please.myapp.scene10.TenSix;
import com.please.myapp.scene10.TenThree;
import com.please.myapp.scene10.TenTwo;
import com.please.myapp.scene11.ElevenFive;
import com.please.myapp.scene11.ElevenFour;
import com.please.myapp.scene11.ElevenOne;
import com.please.myapp.scene11.ElevenSeven;
import com.please.myapp.scene11.ElevenSix;
import com.please.myapp.scene11.ElevenThree;
import com.please.myapp.scene11.ElevenTwo;
import com.please.myapp.scene12.TwelveEight;
import com.please.myapp.scene12.TwelveEleven;
import com.please.myapp.scene12.TwelveFifteen;
import com.please.myapp.scene12.TwelveFive;
import com.please.myapp.scene12.TwelveFour;
import com.please.myapp.scene12.TwelveFourteen;
import com.please.myapp.scene12.TwelveNine;
import com.please.myapp.scene12.TwelveOne;
import com.please.myapp.scene12.TwelveSeven;
import com.please.myapp.scene12.TwelveSix;
import com.please.myapp.scene12.TwelveSixteen;
import com.please.myapp.scene12.TwelveTen;
import com.please.myapp.scene12.TwelveThirteen;
import com.please.myapp.scene12.TwelveThree;
import com.please.myapp.scene12.TwelveTwelve;
import com.please.myapp.scene12.TwelveTwo;
import com.please.myapp.scene13.ThirteenOne;
import com.please.myapp.scene13.ThirteenThree;
import com.please.myapp.scene13.ThirteenTwo;
import com.please.myapp.scene14.FourteenEight;
import com.please.myapp.scene14.FourteenEighteen;
import com.please.myapp.scene14.FourteenEleven;
import com.please.myapp.scene14.FourteenFifteen;
import com.please.myapp.scene14.FourteenFive;
import com.please.myapp.scene14.FourteenFour;
import com.please.myapp.scene14.FourteenNine;
import com.please.myapp.scene14.FourteenOne;
import com.please.myapp.scene14.FourteenSeven;
import com.please.myapp.scene14.FourteenSeventeen;
import com.please.myapp.scene14.FourteenSix;
import com.please.myapp.scene14.FourteenSixteen;
import com.please.myapp.scene14.FourteenTen;
import com.please.myapp.scene14.FourteenThirteen;
import com.please.myapp.scene14.FourteenThree;
import com.please.myapp.scene14.FourteenTwelve;
import com.please.myapp.scene14.FourteenTwo;
import com.please.myapp.scene14.Fourteenfourteen;
import com.please.myapp.scene15.FifteenEight;
import com.please.myapp.scene15.FifteenFive;
import com.please.myapp.scene15.FifteenFour;
import com.please.myapp.scene15.FifteenOne;
import com.please.myapp.scene15.FifteenSeven;
import com.please.myapp.scene15.FifteenSix;
import com.please.myapp.scene15.FifteenTwo;
import com.please.myapp.scene16.SixteenEight;
import com.please.myapp.scene16.SixteenEleven;
import com.please.myapp.scene16.SixteenFifteen;
import com.please.myapp.scene16.SixteenFive;
import com.please.myapp.scene16.SixteenFour;
import com.please.myapp.scene16.SixteenFourteen;
import com.please.myapp.scene16.SixteenNine;
import com.please.myapp.scene16.SixteenOne;
import com.please.myapp.scene16.SixteenSeven;
import com.please.myapp.scene16.SixteenSeventeen;
import com.please.myapp.scene16.SixteenSix;
import com.please.myapp.scene16.SixteenSixteen;
import com.please.myapp.scene16.SixteenTen;
import com.please.myapp.scene16.SixteenThirteen;
import com.please.myapp.scene16.SixteenThree;
import com.please.myapp.scene16.SixteenTwelve;
import com.please.myapp.scene16.SixteenTwo;
import com.please.myapp.scene17.SeventeenFive;
import com.please.myapp.scene17.SeventeenFour;
import com.please.myapp.scene17.SeventeenOne;
import com.please.myapp.scene17.SeventeenSeven;
import com.please.myapp.scene17.SeventeenSix;
import com.please.myapp.scene17.SeventeenThree;
import com.please.myapp.scene17.SeventeenTwo;
import com.please.myapp.scene18.EighteenEight;
import com.please.myapp.scene18.EighteenFive;
import com.please.myapp.scene18.EighteenFour;
import com.please.myapp.scene18.EighteenNine;
import com.please.myapp.scene18.EighteenOne;
import com.please.myapp.scene18.EighteenSeven;
import com.please.myapp.scene18.EighteenSix;
import com.please.myapp.scene18.EighteenThree;
import com.please.myapp.scene18.EighteenTwo;
import com.please.myapp.scene19.NineteenEight;
import com.please.myapp.scene19.NineteenEighteen;
import com.please.myapp.scene19.NineteenEleven;
import com.please.myapp.scene19.NineteenFifteen;
import com.please.myapp.scene19.NineteenFive;
import com.please.myapp.scene19.NineteenFour;
import com.please.myapp.scene19.NineteenFourteen;
import com.please.myapp.scene19.NineteenNine;
import com.please.myapp.scene19.NineteenOne;
import com.please.myapp.scene19.NineteenSeven;
import com.please.myapp.scene19.NineteenSeventeen;
import com.please.myapp.scene19.NineteenSix;
import com.please.myapp.scene19.NineteenSixteen;
import com.please.myapp.scene19.NineteenTen;
import com.please.myapp.scene19.NineteenThirteen;
import com.please.myapp.scene19.NineteenThree;
import com.please.myapp.scene19.NineteenTwelve;
import com.please.myapp.scene19.NineteenTwo;
import com.please.myapp.scene2.TwoEight;
import com.please.myapp.scene2.TwoEighteen;
import com.please.myapp.scene2.TwoEleven;
import com.please.myapp.scene2.TwoFifteen;
import com.please.myapp.scene2.TwoFive;
import com.please.myapp.scene2.TwoFour;
import com.please.myapp.scene2.TwoFourteen;
import com.please.myapp.scene2.TwoNine;
import com.please.myapp.scene2.TwoNineteen;
import com.please.myapp.scene2.TwoOne;
import com.please.myapp.scene2.TwoSeven;
import com.please.myapp.scene2.TwoSeventeen;
import com.please.myapp.scene2.TwoSix;
import com.please.myapp.scene2.TwoSixteen;
import com.please.myapp.scene2.TwoTen;
import com.please.myapp.scene2.TwoThirteen;
import com.please.myapp.scene2.TwoThree;
import com.please.myapp.scene2.TwoTwelve;
import com.please.myapp.scene2.TwoTwo;
import com.please.myapp.scene20.TwentyEight;
import com.please.myapp.scene20.TwentyEleven;
import com.please.myapp.scene20.TwentyFive;
import com.please.myapp.scene20.TwentyFour;
import com.please.myapp.scene20.TwentyNine;
import com.please.myapp.scene20.TwentyOne;
import com.please.myapp.scene20.TwentySeven;
import com.please.myapp.scene20.TwentySix;
import com.please.myapp.scene20.TwentyTen;
import com.please.myapp.scene20.TwentyThree;
import com.please.myapp.scene20.TwentyTwo;
import com.please.myapp.scene21.TwentyoneFive;
import com.please.myapp.scene21.TwentyoneFour;
import com.please.myapp.scene21.TwentyoneOne;
import com.please.myapp.scene21.TwentyoneThree;
import com.please.myapp.scene21.TwentyoneTwo;
import com.please.myapp.scene21_bad.TwentyOneBadEight;
import com.please.myapp.scene21_bad.TwentyoneBadFive;
import com.please.myapp.scene21_bad.TwentyoneBadFour;
import com.please.myapp.scene21_bad.TwentyoneBadNine;
import com.please.myapp.scene21_bad.TwentyoneBadOne;
import com.please.myapp.scene21_bad.TwentyoneBadSeven;
import com.please.myapp.scene21_bad.TwentyoneBadSix;
import com.please.myapp.scene21_bad.TwentyoneBadTen;
import com.please.myapp.scene21_bad.TwentyoneBadThree;
import com.please.myapp.scene21_bad.TwentyoneBadTwo;
import com.please.myapp.scene22.TwentytwoEight;
import com.please.myapp.scene22.TwentytwoFive;
import com.please.myapp.scene22.TwentytwoFour;
import com.please.myapp.scene22.TwentytwoOne;
import com.please.myapp.scene22.TwentytwoSeven;
import com.please.myapp.scene22.TwentytwoSix;
import com.please.myapp.scene22.TwentytwoThree;
import com.please.myapp.scene22.TwentytwoTwo;
import com.please.myapp.scene23.TwentythreeEight;
import com.please.myapp.scene23.TwentythreeEighteen;
import com.please.myapp.scene23.TwentythreeEleven;
import com.please.myapp.scene23.TwentythreeFifteen;
import com.please.myapp.scene23.TwentythreeFive;
import com.please.myapp.scene23.TwentythreeFour;
import com.please.myapp.scene23.TwentythreeFourteen;
import com.please.myapp.scene23.TwentythreeNine;
import com.please.myapp.scene23.TwentythreeNineteen;
import com.please.myapp.scene23.TwentythreeOne;
import com.please.myapp.scene23.TwentythreeSeven;
import com.please.myapp.scene23.TwentythreeSeventeen;
import com.please.myapp.scene23.TwentythreeSix;
import com.please.myapp.scene23.TwentythreeSixteen;
import com.please.myapp.scene23.TwentythreeTen;
import com.please.myapp.scene23.TwentythreeThirteen;
import com.please.myapp.scene23.TwentythreeThree;
import com.please.myapp.scene23.TwentythreeTwelve;
import com.please.myapp.scene23.TwentythreeTwo;
import com.please.myapp.scene24.TwentyfourFive;
import com.please.myapp.scene24.TwentyfourFour;
import com.please.myapp.scene24.TwentyfourOne;
import com.please.myapp.scene24.TwentyfourSeven;
import com.please.myapp.scene24.TwentyfourSix;
import com.please.myapp.scene24.TwentyfourThree;
import com.please.myapp.scene24.TwentyfourTwo;
import com.please.myapp.scene25.TwentyfiveEight;
import com.please.myapp.scene25.TwentyfiveEleven;
import com.please.myapp.scene25.TwentyfiveFive;
import com.please.myapp.scene25.TwentyfiveFour;
import com.please.myapp.scene25.TwentyfiveNine;
import com.please.myapp.scene25.TwentyfiveOne;
import com.please.myapp.scene25.TwentyfiveSeven;
import com.please.myapp.scene25.TwentyfiveSix;
import com.please.myapp.scene25.TwentyfiveTen;
import com.please.myapp.scene25.TwentyfiveThree;
import com.please.myapp.scene25.TwentyfiveTwo;
import com.please.myapp.scene26.TwentysixFive;
import com.please.myapp.scene26.TwentysixFour;
import com.please.myapp.scene26.TwentysixOne;
import com.please.myapp.scene26.TwentysixSeven;
import com.please.myapp.scene26.TwentysixSix;
import com.please.myapp.scene26.TwentysixThree;
import com.please.myapp.scene26.TwentysixTwo;
import com.please.myapp.scene27.TwentySevenTwo;
import com.please.myapp.scene27.TwentysevenOne;
import com.please.myapp.scene27.TwentysevenThree;
import com.please.myapp.scene28.TwentyeightFour;
import com.please.myapp.scene28.TwentyeightOne;
import com.please.myapp.scene28.TwentyeightThree;
import com.please.myapp.scene28.TwentyeightTwo;
import com.please.myapp.scene29.TwentynineEight;
import com.please.myapp.scene29.TwentynineFive;
import com.please.myapp.scene29.TwentynineFour;
import com.please.myapp.scene29.TwentynineOne;
import com.please.myapp.scene29.TwentynineSeven;
import com.please.myapp.scene29.TwentynineSix;
import com.please.myapp.scene29.TwentynineThree;
import com.please.myapp.scene29.TwentynineTwo;
import com.please.myapp.scene3.ThreeEight;
import com.please.myapp.scene3.ThreeFive;
import com.please.myapp.scene3.ThreeFour;
import com.please.myapp.scene3.ThreeOne;
import com.please.myapp.scene3.ThreeSeven;
import com.please.myapp.scene3.ThreeSix;
import com.please.myapp.scene3.ThreeThree;
import com.please.myapp.scene3.ThreeTwo;
import com.please.myapp.scene30.ThirtyEight;
import com.please.myapp.scene30.ThirtyEleven;
import com.please.myapp.scene30.ThirtyFive;
import com.please.myapp.scene30.ThirtyFour;
import com.please.myapp.scene30.ThirtyNine;
import com.please.myapp.scene30.ThirtyOne;
import com.please.myapp.scene30.ThirtySeven;
import com.please.myapp.scene30.ThirtySix;
import com.please.myapp.scene30.ThirtyTen;
import com.please.myapp.scene30.ThirtyThree;
import com.please.myapp.scene30.ThirtyTwo;
import com.please.myapp.scene31.ThirtyoneEight;
import com.please.myapp.scene31.ThirtyoneEleven;
import com.please.myapp.scene31.ThirtyoneFive;
import com.please.myapp.scene31.ThirtyoneFour;
import com.please.myapp.scene31.ThirtyoneNine;
import com.please.myapp.scene31.ThirtyoneOne;
import com.please.myapp.scene31.ThirtyoneSeven;
import com.please.myapp.scene31.ThirtyoneSix;
import com.please.myapp.scene31.ThirtyoneTen;
import com.please.myapp.scene31.ThirtyoneThree;
import com.please.myapp.scene31.ThirtyoneTwo;
import com.please.myapp.scene32.ThirtytwoEight;
import com.please.myapp.scene32.ThirtytwoEleven;
import com.please.myapp.scene32.ThirtytwoFifteen;
import com.please.myapp.scene32.ThirtytwoFive;
import com.please.myapp.scene32.ThirtytwoFour;
import com.please.myapp.scene32.ThirtytwoFourteen;
import com.please.myapp.scene32.ThirtytwoNine;
import com.please.myapp.scene32.ThirtytwoOne;
import com.please.myapp.scene32.ThirtytwoSeven;
import com.please.myapp.scene32.ThirtytwoSix;
import com.please.myapp.scene32.ThirtytwoSixteen;
import com.please.myapp.scene32.ThirtytwoTen;
import com.please.myapp.scene32.ThirtytwoThirteen;
import com.please.myapp.scene32.ThirtytwoThree;
import com.please.myapp.scene32.ThirtytwoTwelve;
import com.please.myapp.scene32.ThirtytwoTwo;
import com.please.myapp.scene33.ThirtythreeOne;
import com.please.myapp.scene33.ThirtythreeTwo;
import com.please.myapp.scene4.FourEight;
import com.please.myapp.scene4.FourEleven;
import com.please.myapp.scene4.FourFive;
import com.please.myapp.scene4.FourFour;
import com.please.myapp.scene4.FourNine;
import com.please.myapp.scene4.FourOne;
import com.please.myapp.scene4.FourSeven;
import com.please.myapp.scene4.FourSix;
import com.please.myapp.scene4.FourTen;
import com.please.myapp.scene4.FourThree;
import com.please.myapp.scene4.FourTwelve;
import com.please.myapp.scene4.FourTwo;
import com.please.myapp.scene5.FiveEight;
import com.please.myapp.scene5.FiveEighteen;
import com.please.myapp.scene5.FiveEleven;
import com.please.myapp.scene5.FiveFifteen;
import com.please.myapp.scene5.FiveFive;
import com.please.myapp.scene5.FiveFour;
import com.please.myapp.scene5.FiveFourteen;
import com.please.myapp.scene5.FiveFourty;
import com.please.myapp.scene5.FiveNine;
import com.please.myapp.scene5.FiveNineTeen;
import com.please.myapp.scene5.FiveOne;
import com.please.myapp.scene5.FiveSeven;
import com.please.myapp.scene5.FiveSeventeen;
import com.please.myapp.scene5.FiveSix;
import com.please.myapp.scene5.FiveSixteen;
import com.please.myapp.scene5.FiveTen;
import com.please.myapp.scene5.FiveThirteen;
import com.please.myapp.scene5.FiveThirty;
import com.please.myapp.scene5.FiveThirtyeight;
import com.please.myapp.scene5.FiveThirtyfive;
import com.please.myapp.scene5.FiveThirtyfour;
import com.please.myapp.scene5.FiveThirtynine;
import com.please.myapp.scene5.FiveThirtyone;
import com.please.myapp.scene5.FiveThirtyseven;
import com.please.myapp.scene5.FiveThirtysix;
import com.please.myapp.scene5.FiveThirtythree;
import com.please.myapp.scene5.FiveThirtytwo;
import com.please.myapp.scene5.FiveThree;
import com.please.myapp.scene5.FiveTwelve;
import com.please.myapp.scene5.FiveTwenty;
import com.please.myapp.scene5.FiveTwentyOne;
import com.please.myapp.scene5.FiveTwentyeight;
import com.please.myapp.scene5.FiveTwentyfive;
import com.please.myapp.scene5.FiveTwentyfour;
import com.please.myapp.scene5.FiveTwentynine;
import com.please.myapp.scene5.FiveTwentyseven;
import com.please.myapp.scene5.FiveTwentysix;
import com.please.myapp.scene5.FiveTwentythree;
import com.please.myapp.scene5.FiveTwentytwo;
import com.please.myapp.scene5.FiveTwo;
import com.please.myapp.scene5.Fivefifty;
import com.please.myapp.scene5.Fivefourtyeight;
import com.please.myapp.scene5.Fivefourtyfive;
import com.please.myapp.scene5.Fivefourtyfour;
import com.please.myapp.scene5.Fivefourtynine;
import com.please.myapp.scene5.Fivefourtyone;
import com.please.myapp.scene5.Fivefourtyseven;
import com.please.myapp.scene5.Fivefourtysix;
import com.please.myapp.scene5.Fivefourtythree;
import com.please.myapp.scene5.Fivefourtytwo;
import com.please.myapp.scene6.SIxEight;
import com.please.myapp.scene6.SixEighteen;
import com.please.myapp.scene6.SixEleven;
import com.please.myapp.scene6.SixFive;
import com.please.myapp.scene6.SixFour;
import com.please.myapp.scene6.SixFourteen;
import com.please.myapp.scene6.SixNine;
import com.please.myapp.scene6.SixNineteen;
import com.please.myapp.scene6.SixOne;
import com.please.myapp.scene6.SixSeven;
import com.please.myapp.scene6.SixSeventeen;
import com.please.myapp.scene6.SixSix;
import com.please.myapp.scene6.SixSixteen;
import com.please.myapp.scene6.SixTen;
import com.please.myapp.scene6.SixThirteen;
import com.please.myapp.scene6.SixThree;
import com.please.myapp.scene6.SixTwelve;
import com.please.myapp.scene6.SixTwo;
import com.please.myapp.scene7.SevenEight;
import com.please.myapp.scene7.SevenFive;
import com.please.myapp.scene7.SevenFour;
import com.please.myapp.scene7.SevenOne;
import com.please.myapp.scene7.SevenSeven;
import com.please.myapp.scene7.SevenSix;
import com.please.myapp.scene7.SevenThree;
import com.please.myapp.scene7.SevenTwo;
import com.please.myapp.scene8.EightEight;
import com.please.myapp.scene8.EightEleven;
import com.please.myapp.scene8.EightFive;
import com.please.myapp.scene8.EightFour;
import com.please.myapp.scene8.EightNine;
import com.please.myapp.scene8.EightOne;
import com.please.myapp.scene8.EightSeven;
import com.please.myapp.scene8.EightSix;
import com.please.myapp.scene8.EightTen;
import com.please.myapp.scene8.EightThree;
import com.please.myapp.scene8.EightTwelve;
import com.please.myapp.scene8.EightTwo;
import com.please.myapp.scene9.NineEight;
import com.please.myapp.scene9.NineEighteen;
import com.please.myapp.scene9.NineEleven;
import com.please.myapp.scene9.NineFifteen;
import com.please.myapp.scene9.NineFive;
import com.please.myapp.scene9.NineFour;
import com.please.myapp.scene9.NineFourteen;
import com.please.myapp.scene9.NineNine;
import com.please.myapp.scene9.NineNineteen;
import com.please.myapp.scene9.NineOne;
import com.please.myapp.scene9.NineSeven;
import com.please.myapp.scene9.NineSeventeen;
import com.please.myapp.scene9.NineSix;
import com.please.myapp.scene9.NineSixteen;
import com.please.myapp.scene9.NineTen;
import com.please.myapp.scene9.NineThirteen;
import com.please.myapp.scene9.NineThree;
import com.please.myapp.scene9.NineTwelve;
import com.please.myapp.scene9.NineTwenty;
import com.please.myapp.scene9.NineTwo;

public class MainActivity extends AppCompatActivity {

    private Button btn_next;
    private Button btn_exit;
    private Button btn_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String svbt = "svbt";

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        startService(new Intent(getApplicationContext(), MusicService.class));

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tutorial.class);
                startActivity(intent);
            }
        });
        btn_exit = findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("게임을 종료하시겠습니까?");
                builder.setTitle("Sailing Into the Night").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Sailing Into the Night");
                alert.show();
            }
        });

        btn_load = findViewById(R.id.btn_load);
        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scview = R.layout.activity_next;
                SharedPreferences pref = getSharedPreferences("pref",0);
                scview = pref.getInt(svbt,R.layout.activity_next);
                if(scview==R.layout.activity_next)
                {
                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_third)
                {
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourth_actvity)
                {
                    Intent intent = new Intent(MainActivity.this, FourthActvity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifth)
                {
                    Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixth)
                {
                    Intent intent = new Intent(MainActivity.this, SixthActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventh)
                {
                    Intent intent = new Intent(MainActivity.this, SeventhActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighth_actvity)
                {
                    Intent intent = new Intent(MainActivity.this, EighthActvity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineth)
                {
                    Intent intent = new Intent(MainActivity.this, NinethActivity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_tenth_)
                {
                    Intent intent = new Intent(MainActivity.this, Tenth_Activity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleventh_)
                {
                    Intent intent = new Intent(MainActivity.this, Eleventh_Activity.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwoOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwoTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwoThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwoFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwoFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwoSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwoSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwoEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwoNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwoTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, TwoEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, TwoTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_two_nineteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwoNineteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_three)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_four)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_five)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_six)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_seven)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_three_eight)
                {
                    Intent intent = new Intent(MainActivity.this, ThreeEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_one)
                {
                    Intent intent = new Intent(MainActivity.this, FourOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_two)
                {
                    Intent intent = new Intent(MainActivity.this, FourTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_three)
                {
                    Intent intent = new Intent(MainActivity.this, FourThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_four)
                {
                    Intent intent = new Intent(MainActivity.this, FourFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_five)
                {
                    Intent intent = new Intent(MainActivity.this, FourFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_six)
                {
                    Intent intent = new Intent(MainActivity.this, FourSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_seven)
                {
                    Intent intent = new Intent(MainActivity.this, FourSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_eight)
                {
                    Intent intent = new Intent(MainActivity.this, FourEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_nine)
                {
                    Intent intent = new Intent(MainActivity.this, FourNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_ten)
                {
                    Intent intent = new Intent(MainActivity.this, FourTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, FourEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_four_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, FourTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_one)
                {
                    Intent intent = new Intent(MainActivity.this, FiveOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_two)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_three)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_four)
                {
                    Intent intent = new Intent(MainActivity.this, FiveFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_five)
                {
                    Intent intent = new Intent(MainActivity.this, FiveFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_six)
                {
                    Intent intent = new Intent(MainActivity.this, FiveSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_seven)
                {
                    Intent intent = new Intent(MainActivity.this, FiveSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_eight)
                {
                    Intent intent = new Intent(MainActivity.this, FiveEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_nine)
                {
                    Intent intent = new Intent(MainActivity.this, FiveNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_ten)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, FiveEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_nine_teen)
                {
                    Intent intent = new Intent(MainActivity.this, FiveNineTeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twenty)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwenty.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twenty_one)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentytwo)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentytwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentythree)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentythree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyfour)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyfour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyfive)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyfive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentysix)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentysix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyseven)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyseven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyeight)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyeight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentynine)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentynine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyseven)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyseven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentyeight)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentyeight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_twentynine)
                {
                    Intent intent = new Intent(MainActivity.this, FiveTwentynine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirty)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirty.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtyone)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtyone.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtytwo)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtytwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtythree)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtythree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtyfour)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtyfour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtyfive)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtyfive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtysix)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtysix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtyseven)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtyseven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtyeight)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtyeight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_thirtynine)
                {
                    Intent intent = new Intent(MainActivity.this, FiveThirtynine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_five_fourty)
                {
                    Intent intent = new Intent(MainActivity.this, FiveFourty.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtyone)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtyone.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtytwo)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtytwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtythree)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtythree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtyfour)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtyfour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtyfive)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtyfive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtysix)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtysix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtyseven)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtyseven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtyeight)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtyeight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefourtynine)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefourtynine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fivefifty)
                {
                    Intent intent = new Intent(MainActivity.this, Fivefifty.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_one)
                {
                    Intent intent = new Intent(MainActivity.this, SixOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_two)
                {
                    Intent intent = new Intent(MainActivity.this, SixTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_three)
                {
                    Intent intent = new Intent(MainActivity.this, SixThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_four)
                {
                    Intent intent = new Intent(MainActivity.this, SixFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_five)
                {
                    Intent intent = new Intent(MainActivity.this, SixFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_six)
                {
                    Intent intent = new Intent(MainActivity.this, SixSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_seven)
                {
                    Intent intent = new Intent(MainActivity.this, SixSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_s_ix_eight)
                {
                    Intent intent = new Intent(MainActivity.this, SIxEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_nine)
                {
                    Intent intent = new Intent(MainActivity.this, SixNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_ten)
                {
                    Intent intent = new Intent(MainActivity.this, SixTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, SixEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, SixTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, SixSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_six_nineteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixNineteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_one)
                {
                    Intent intent = new Intent(MainActivity.this, SevenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_two)
                {
                    Intent intent = new Intent(MainActivity.this, SevenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_three)
                {
                    Intent intent = new Intent(MainActivity.this, SevenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_four)
                {
                    Intent intent = new Intent(MainActivity.this, SevenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_five)
                {
                    Intent intent = new Intent(MainActivity.this, SevenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_six)
                {
                    Intent intent = new Intent(MainActivity.this, SevenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_seven)
                {
                    Intent intent = new Intent(MainActivity.this, SevenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seven_eight)
                {
                    Intent intent = new Intent(MainActivity.this, SevenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_one)
                {
                    Intent intent = new Intent(MainActivity.this, EightOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_two)
                {
                    Intent intent = new Intent(MainActivity.this, EightTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_three)
                {
                    Intent intent = new Intent(MainActivity.this, EightThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_four)
                {
                    Intent intent = new Intent(MainActivity.this, EightFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_five)
                {
                    Intent intent = new Intent(MainActivity.this, EightFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_six)
                {
                    Intent intent = new Intent(MainActivity.this, EightSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_seven)
                {
                    Intent intent = new Intent(MainActivity.this, EightSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_eight)
                {
                    Intent intent = new Intent(MainActivity.this, EightEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_nine)
                {
                    Intent intent = new Intent(MainActivity.this, EightNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_ten)
                {
                    Intent intent = new Intent(MainActivity.this, EightTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, EightEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eight_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, EightTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_one)
                {
                    Intent intent = new Intent(MainActivity.this, NineOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_two)
                {
                    Intent intent = new Intent(MainActivity.this, NineTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_three)
                {
                    Intent intent = new Intent(MainActivity.this, NineThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_four)
                {
                    Intent intent = new Intent(MainActivity.this, NineFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_five)
                {
                    Intent intent = new Intent(MainActivity.this, NineFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_six)
                {
                    Intent intent = new Intent(MainActivity.this, NineSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_seven)
                {
                    Intent intent = new Intent(MainActivity.this, NineSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_eight)
                {
                    Intent intent = new Intent(MainActivity.this, NineEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_nine)
                {
                    Intent intent = new Intent(MainActivity.this, NineNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_ten)
                {
                    Intent intent = new Intent(MainActivity.this, NineTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, NineEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, NineTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, NineSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_nineteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineNineteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nine_twenty)
                {
                    Intent intent = new Intent(MainActivity.this, NineTwenty.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_one)
                {
                    Intent intent = new Intent(MainActivity.this, TenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_two)
                {
                    Intent intent = new Intent(MainActivity.this, TenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_three)
                {
                    Intent intent = new Intent(MainActivity.this, TenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_four)
                {
                    Intent intent = new Intent(MainActivity.this, TenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_five)
                {
                    Intent intent = new Intent(MainActivity.this, TenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_six)
                {
                    Intent intent = new Intent(MainActivity.this, TenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_ten_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TenNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_one)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_two)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_three)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_four)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_five)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_six)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eleven_seven)
                {
                    Intent intent = new Intent(MainActivity.this, ElevenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twelve_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwelveSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThirteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThirteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, ThirteenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_four)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_five)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_six)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_eight)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_nine)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_ten)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteenfourteen)
                {
                    Intent intent = new Intent(MainActivity.this, Fourteenfourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fourteen_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, FourteenEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_four)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_five)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_six)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_fifteen_eight)
                {
                    Intent intent = new Intent(MainActivity.this, FifteenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_four)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_five)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_six)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_eight)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_nine)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_ten)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_sixteen_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, SixteenSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_one)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_two)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_three)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_four)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_five)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_six)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_seventeen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, SeventeenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_four)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_five)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_six)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_eight)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_eighteen_nine)
                {
                    Intent intent = new Intent(MainActivity.this, EighteenNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_one)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_two)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_three)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_four)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_five)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_six)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_seven)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_eight)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_nine)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_ten)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_nineteen_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, NineteenEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentySix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentySeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_one_bad_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyOneBadEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_bad_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneBadTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyone_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyoneFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentytwo_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentytwoEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_seventeen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeSeventeen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_eighteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeEighteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentythree_nineteen)
                {
                    Intent intent = new Intent(MainActivity.this, TwentythreeNineteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfour_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfourSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_nine)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_ten)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyfive_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyfiveEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentysix_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysixSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyseven_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysevenOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twenty_seven_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentySevenTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyseven_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentysevenThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyeight_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyeightOne.class);
                    startActivity(intent);
                }else if(scview==R.layout.activity_twentyeight_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyeightTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyeight_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyeightThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentyeight_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentyeightFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_one)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_two)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_three)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_four)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_five)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_six)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_seven)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_twentynine_eight)
                {
                    Intent intent = new Intent(MainActivity.this, TwentynineEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_three)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_four)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_five)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_six)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtySix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_seven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtySeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_eight)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_nine)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_ten)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirty_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_three)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_four)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_five)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_six)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_seven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_eight)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_nine)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_ten)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtyone_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtyoneEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoTwo.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_three)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoThree.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_four)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoFour.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_five)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoFive.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_six)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoSix.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_seven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoSeven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_eight)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoEight.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_nine)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoNine.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_ten)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoTen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_eleven)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoEleven.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_twelve)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoTwelve.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_thirteen)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoThirteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_fourteen)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoFourteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_fifteen)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoFifteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtytwo_sixteen)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtytwoSixteen.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtythree_one)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtythreeOne.class);
                    startActivity(intent);
                }
                else if(scview==R.layout.activity_thirtythree_two)
                {
                    Intent intent = new Intent(MainActivity.this, ThirtythreeTwo.class);
                    startActivity(intent);
                }
            }
        });

    }
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicService.class));
    }



}

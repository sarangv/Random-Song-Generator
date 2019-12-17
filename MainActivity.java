package com.example.sarang.synthesizer_activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private final int HALF_NOTE = 500;
    private Button button2;
    private Button button3;
    private Button button5;
    private Button button6;
    private Button button7;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private MediaPlayer mpHighG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private NumberPicker note1;
    private NumberPicker note2;
    private int a;
    private CheckBox checkBox;
    MediaPlayer aSongs[];
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(MainActivity.this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(MainActivity.this);

        button5 = (Button) findViewById(R.id.button1);
        button5.setOnClickListener(MainActivity.this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(MainActivity.this);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(MainActivity.this);




        MediaPlayer [] aSongs;
        aSongs = new MediaPlayer[16];

        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);

    }


    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("Synthesizer", "Sorry, There are Some Technical Difficulties");
        }
    }

    public void changescreen(View view){
        Intent startNewActivity = new Intent(this, Extension_Activity.class);
        startActivity(startNewActivity);
    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.button2) {
            try {
                mpE.start();
                delayPlaying(HALF_NOTE);
                mpFs.start();
                delayPlaying(HALF_NOTE);
                mpG.start();
                delayPlaying(HALF_NOTE);
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpE.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (v.getId() == R.id.button3) {
            a = note2.getValue() - 1;

            if (note1.getValue() == 1) {
                mpA.start();
                mpA.setLooping(true);
                try {
                    delayPlaying((5000 * a) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpA.setLooping(true);


            } else if (note1.getValue() == 2) {
                mpB.start();
                mpB.setLooping(true);
                try {
                    delayPlaying((5000 * a) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpB.setLooping(true);
            } else if (note1.getValue() == 3) {
                mpBB.start();
                mpBB.setLooping(true);
                try {
                    delayPlaying((5000 * a) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpBB.setLooping(true);
            } else if (note1.getValue() == 4) {
                mpC.start();
                mpC.setLooping(true);
                try {
                    delayPlaying((5000 * a) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpC.setLooping(true);
            } else if (note1.getValue() == 5) {
                mpCs.start();
                mpCs.setLooping(true);
                try {
                    delayPlaying((5000 * a) + 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mpCs.setLooping(true);
            } else if (note1.getValue() == 6) {
                mpD.start();
            } else if (note1.getValue() == 7) {
                mpDs.start();
            } else if (note1.getValue() == 8) {
                mpE.start();
            } else if (note1.getValue() == 9) {
                mpF.start();
            } else if (note1.getValue() == 10) {
                mpFs.start();
            } else if (note1.getValue() == 11) {
                mpG.start();
            } else if (note1.getValue() == 12) {
                mpHighE.start();
            } else if (note1.getValue() == 13) {
                mpHighG.start();
            } else if (note1.getValue() == 14) {
                mpGs.start();
            } else if (note1.getValue() == 15) {
                mpHighF.start();
            } else if (note1.getValue() == 16) {
                mpHighFs.start();
            }

        }

        if (v.getId() == R.id.button1 && checkBox.isChecked() ) {
            try {
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(HALF_NOTE);;
                mpA.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpA.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        if (v.getId() == R.id.button6) {
            try {
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpA.seekTo(0);
                mpA.start();
                delayPlaying(HALF_NOTE);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighFs.seekTo(0);
                mpHighFs.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE);;
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(HALF_NOTE);
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpHighE.seekTo(0);
                mpHighE.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpD.seekTo(0);
                mpD.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpCs.seekTo(0);
                mpCs.start();
                delayPlaying(HALF_NOTE);
                mpB.seekTo(0);
                mpB.start();
                delayPlaying(WHOLE_NOTE);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

           }

        }


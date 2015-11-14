package com.example.shreyabatra.coffe_app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by shreya batra on 31-10-2015.
 */
public class Splash extends Activity {
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final Context con = this;
        ourSong=MediaPlayer.create(Splash.this, R.raw.love_story);
        ourSong.start();
        Log.d("vivz", "oncreate called");
        final Thread t = new Thread() {

            public void run() {
                super.run();
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                } finally {
                    Intent c = new Intent(con, Menu.class);
                    startActivity(c);
                }
            }
        };

        t.start();


    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSong.release();
        finish();
    }
}





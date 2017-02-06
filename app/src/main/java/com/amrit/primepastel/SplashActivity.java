package com.amrit.primepastel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;



/**
 * Created by prabesh subedi on 07/10/2016.
 */
public class SplashActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH=1000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable(){

            @Override

            public void run()
            {
             {

                    Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();
                }

            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}

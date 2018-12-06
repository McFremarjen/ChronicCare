package com.fremarjentechnologies.mark.chroniccare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView mTextview1;
    private TextView mTextview2;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);




        mTextview1 = (TextView)findViewById(R.id.wtv1);
        mTextview2 = (TextView)findViewById(R.id.wtv2);
        mImageView = (ImageView)findViewById(R.id.wiv1);
        Animation mAnimation = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        mTextview1.startAnimation(mAnimation);
        mImageView.startAnimation(mAnimation);
        mTextview2.startAnimation(mAnimation);
        final Intent i = new Intent(this,start.class);


        Thread timer =new Thread(){
            public void run (){
                try{
                    sleep(9000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {


                    startActivity(i);

                    finish();
                }

            }

        };

        timer.start();




    }
}

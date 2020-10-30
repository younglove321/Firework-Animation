package joo.mp.hw7_animation_firework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        performAnimation();
    }

    private void performAnimation() {
        ImageView iv_firework = findViewById(R.id.firework);
        iv_firework.setImageResource(R.drawable.firework1);
        Animation anim_firework = AnimationUtils.loadAnimation(this,R.anim.firework);
//        anim_firework.setAnimationListener(new FireWork3AnimationListner());
        iv_firework.startAnimation(anim_firework);

        ImageView iv_firework2 = findViewById(R.id.firework2);
        iv_firework2.setImageResource(R.drawable.firework2);
        Animation anim_firework2 = AnimationUtils.loadAnimation(this,R.anim.firework2);
        iv_firework2.startAnimation(anim_firework2);

        ImageView iv_firework3 = findViewById(R.id.firework3);
        iv_firework3.setImageResource(R.drawable.firework3);
        Animation anim_firework3 = AnimationUtils.loadAnimation(this,R.anim.firework3);
        iv_firework3.startAnimation(anim_firework3);



        ImageView iv_flag = findViewById(R.id.flag1);


        AnimationDrawable animationDrawable = new AnimationDrawable();

        BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.small_flag1);
        BitmapDrawable frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.small_flag2);
        BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.small_flag3);
        BitmapDrawable frame4 = (BitmapDrawable) getResources().getDrawable(R.drawable.small_flag4);


        animationDrawable.addFrame(frame1, 200);
        animationDrawable.addFrame(frame2, 200);
        animationDrawable.addFrame(frame3, 200);
        animationDrawable.addFrame(frame4, 200);


        iv_flag.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                ImageView iv_santa = (ImageView)findViewById(R.id.dancing);
                Animation anim_santa = AnimationUtils.loadAnimation(MainActivity.this,R.anim.dancing);

                AnimationDrawable animation_drwable = new AnimationDrawable();
                BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance1);
                BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance2);
                BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance3);
                BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance4);
                BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance5);
                BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance6);
                BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.dance7);


                animation_drwable.addFrame(frame1, 400);
                animation_drwable.addFrame(frame2, 400);
                animation_drwable.addFrame(frame3, 400);
                animation_drwable.addFrame(frame4, 400);
                animation_drwable.addFrame(frame5, 400);
                animation_drwable.addFrame(frame6, 400);

                iv_santa.setBackgroundDrawable(animation_drwable);

                iv_santa.startAnimation(anim_santa);
                animation_drwable.start();
            }
        }, 2000);



    }
}

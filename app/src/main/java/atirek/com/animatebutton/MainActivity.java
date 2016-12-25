package atirek.com.animatebutton;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation anim_translate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        final Animation anim_alpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation anim_scale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation anim_rotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        final Animation anim_bounce = AnimationUtils.loadAnimation(this, R.anim.anim_bounce);
        final BounceInterpolator interpolator = new BounceInterpolator(0.2, 20);

        findViewById(R.id.iv_heart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!isClicked) {
                    ((ImageView) findViewById(R.id.iv_heart)).setImageResource(R.drawable.heart_icon_b);
                    isClicked = true;
                } else {
                    ((ImageView) findViewById(R.id.iv_heart)).setImageResource(R.drawable.heart_icon);
                    isClicked = false;
                }

                anim_bounce.setInterpolator(interpolator);
                view.startAnimation(anim_bounce);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, Main2Activity.class));
                        //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }, 500);

            }
        });

    }

}
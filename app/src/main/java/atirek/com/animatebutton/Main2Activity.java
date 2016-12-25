package atirek.com.animatebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //overridePendingTransition(R.anim.push_down_in, R.anim.push_down_out);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

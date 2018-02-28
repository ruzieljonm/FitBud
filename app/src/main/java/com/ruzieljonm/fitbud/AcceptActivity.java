package com.ruzieljonm.fitbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AcceptActivity extends AppCompatActivity {

    ImageView li,bg;
    TextView samp,chal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept);
        li = (ImageView) findViewById(R.id.imageView3);
        bg = (ImageView) findViewById(R.id.cvb);
        samp = (TextView) findViewById(R.id.textView2);
        chal = (TextView) findViewById(R.id.textView3);
        Bundle b = getIntent().getExtras();
        int resid = b.getInt("resId");
        int backg = b.getInt("bgId");
        li.setImageResource(resid);
        bg.setImageResource(backg);
        String asd = b.getString(ChallengeActivity.SAMPLE_TEXT);
        samp.setText(asd);
        String sad = b.getString(ChallengeActivity.SAMPLE_CHALLENGE);
        chal.setText(sad);
    }
}

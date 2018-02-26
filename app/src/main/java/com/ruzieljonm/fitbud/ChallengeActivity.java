package softeng.fitbud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChallengeActivity extends AppCompatActivity {
    public static final String SAMPLE_TEXT = "softeng.fitbud.SAMPLE_TEXT";
    public static final String SAMPLE_CHALLENGE = "softeng.fitbud.SAMPLE_CHALLENGE";
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        image1 = (ImageView) findViewById(R.id.img_1);
        image2 = (ImageView) findViewById(R.id.img_2);
        image3 = (ImageView) findViewById(R.id.img_3);
        image4 = (ImageView) findViewById(R.id.img_4);
        image5 = (ImageView) findViewById(R.id.img_5);
        image6 = (ImageView) findViewById(R.id.img_6);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity1();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity2();
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity3();
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity4();
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity5();
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptActivity6();
            }
        });
    }
    String text;
    String challenge;
    public void openAcceptActivity1(){
        TextView asd = (TextView) findViewById(R.id.txtNosugar);
        text = asd.getText().toString();
        challenge = "AVOID SWEETS FOR 5 CONSECUTIVE DAYS";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.vbn);
        i.putExtra("bgId",R.mipmap.xcxc);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
    public void openAcceptActivity2(){
        TextView asd = (TextView) findViewById(R.id.txt_8cup);
        text = asd.getText().toString();
        challenge = "DRINK 8 CUPS OF WATER DAILY FOR A WEEK";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.xc);
        i.putExtra("bgId",R.mipmap.it);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
    public void openAcceptActivity3(){
        TextView asd = (TextView) findViewById(R.id.txt_fruitup);
        text = asd.getText().toString();
        challenge = "EAT ANY KIND OF FRUIT AFTER MEALS FOR 4 DAYS";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.lk);
        i.putExtra("bgId",R.mipmap.mnb);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
    public void openAcceptActivity4(){
        TextView asd = (TextView) findViewById(R.id.txt_gogreen);
        text = asd.getText().toString();
        challenge = "EVERY MEAL SHOULD HAVE A VEGETABLE MEAL";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.gh);
        i.putExtra("bgId",R.mipmap.pop);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
    public void openAcceptActivity5(){
        TextView asd = (TextView) findViewById(R.id.txt_nosugar);
        text = asd.getText().toString();
        challenge = "NO SOFTDRINKS OR JUICES FOR 5 DAYS";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.vbn);
        i.putExtra("bgId",R.mipmap.xcxc);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
    public void openAcceptActivity6(){
        TextView asd = (TextView) findViewById(R.id.txt_meditate);
        text = asd.getText().toString();
        challenge = "MEDIDATE FOR 2 HOURS DAILY";
        Intent i = new Intent(this,AcceptActivity.class);
        i.putExtra("resId",R.mipmap.lkj);
        i.putExtra("bgId",R.mipmap.qwe);
        i.putExtra(SAMPLE_TEXT,text);
        i.putExtra(SAMPLE_CHALLENGE,challenge);
        startActivity(i);
    }
}

package com.ruzieljonm.fitbud;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_menu);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){


        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }


       return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();


        if(id==R.id.search){
            Intent intent = new Intent(MainActivity.this,SearchActivity.class);
            startActivity(intent);

        }
        if(id==R.id.weeklyist){
            Intent intent = new Intent(MainActivity.this,WeeklyListActivity.class);
            startActivity(intent);

        }
        if(id==R.id.profile){
            Toast.makeText(this, "This is Profile", Toast.LENGTH_SHORT).show();

        }
        if(id==R.id.foodmonitoring){
            Toast.makeText(this, "This is Food Monitoring", Toast.LENGTH_SHORT).show();

        }

        if(id==R.id.challenges){
            Intent intent = new Intent(MainActivity.this,ChallengeActivity.class);
            startActivity(intent);

        }
        return false;
    }
}

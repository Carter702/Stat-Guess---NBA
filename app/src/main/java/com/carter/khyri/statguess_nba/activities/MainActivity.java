package com.carter.khyri.statguess_nba.activities;

import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.carter.khyri.statguess_nba.R;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = (BottomNavigationView) findViewById(R.id.bottomNavigationView2);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            //Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_games:
                    onNavigationItemSelected(item);
                    return true;
                case R.id.navigation_history:
                    onNavigationItemSelected(item);
                    return true;
                case R.id.navigation_profile:
                    onNavigationItemSelected(item);
                    return true;
            }

            return false;
        }
    };
}

package com.carter.khyri.statguess_nba.activities;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.AdapterView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.fragments.GamesFragment;
import com.carter.khyri.statguess_nba.fragments.HistoryFragment;
import com.carter.khyri.statguess_nba.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = findViewById(R.id.bottomNavigationView2);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment(new GamesFragment());
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_games:
                    Log.d("DEBUG", "onNavigationItemSelected: GAMES SELECTED");
                    fragment = new GamesFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_history:
                    Log.d("DEBUG", "onNavigationItemSelected: HISTORY SELECTED");
                    //fragment = new HistoryFragment();
                    loadFragment(new HistoryFragment());
                    return true;
                case R.id.navigation_profile:
                    Log.d("DEBUG", "onNavigationItemSelected: PROFILE SELECTED");
                    //fragment = new ProfileFragment();
                    loadFragment(new ProfileFragment());
                    return true;
            }

            return false;
        }
    };

    private void loadFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

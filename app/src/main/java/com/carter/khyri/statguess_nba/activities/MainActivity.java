package com.carter.khyri.statguess_nba.activities;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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

    final Fragment gameFrag = new GamesFragment();
    final Fragment profileFrag = new ProfileFragment();
    final Fragment historyFrag = new HistoryFragment();

    final FragmentManager fm = getSupportFragmentManager();

    Fragment active = gameFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottomNavigationView2);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragment();
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_games:
                    fm.beginTransaction().hide(active).show(gameFrag).commit();
                    active = gameFrag;
                    return true;
                case R.id.navigation_history:
                    fm.beginTransaction().hide(active).show(historyFrag).commit();
                    active = historyFrag;
                    return true;
                case R.id.navigation_profile:
                    fm.beginTransaction().hide(active).show(profileFrag).commit();
                    active = profileFrag;
                    return true;
            }

            return false;
        }
    };

    private void loadFragment() {

        /*
         FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);

        transaction.commit();
        */
        fm.beginTransaction().add(R.id.container, profileFrag, "3").hide(profileFrag).commit();
        fm.beginTransaction().add(R.id.container, historyFrag, "2").hide(historyFrag).commit();
        fm.beginTransaction().add(R.id.container,gameFrag, "1").commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


    }
}

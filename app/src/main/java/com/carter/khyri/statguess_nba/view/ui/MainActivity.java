package com.carter.khyri.statguess_nba.view.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.carter.khyri.statguess_nba.R;

public class MainActivity extends AppCompatActivity {

    final Fragment gameFrag = new GameInfoFragment();
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
        fm.beginTransaction().add(R.id.container, profileFrag, "3").hide(profileFrag).commit();
        fm.beginTransaction().add(R.id.container, historyFrag, "2").hide(historyFrag).commit();
        fm.beginTransaction().add(R.id.container,gameFrag, "1").commit();
    }

    @Override
    public void onBackPressed() {
        if(gameFrag.getChildFragmentManager().getBackStackEntryCount() > 0 && !gameFrag.isHidden() ) {
            gameFrag.getChildFragmentManager().popBackStackImmediate();
            Log.i("DEBUG", "onBackPressed: POPPED IT");
        } else {
            super.onBackPressed();
        }
    }

}

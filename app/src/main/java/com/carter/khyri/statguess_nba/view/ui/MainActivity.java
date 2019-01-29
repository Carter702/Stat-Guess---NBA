package com.carter.khyri.statguess_nba.view.ui;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

        BottomNavigationView navigation = findViewById(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        loadFragments();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_games:
                    gameFrag.getChildFragmentManager().popBackStackImmediate();
                    fm.beginTransaction().hide(active).show(gameFrag).commit();
                    active = gameFrag;
                    //gamesPressed()
                    return true;
                case R.id.navigation_history:
                    fm.beginTransaction().hide(active).show(historyFrag).commit();
                    active = historyFrag;
                    //historyPressed()
                    return true;
                case R.id.navigation_profile:
                    fm.beginTransaction().hide(active).show(profileFrag).commit();
                    active = profileFrag;
                    //profilePressed()
                    return true;
            }

            return false;
        }
    };

    private void loadFragments() {
        fm.beginTransaction().add(R.id.container, profileFrag, "3").hide(profileFrag).commit();
        fm.beginTransaction().add(R.id.container, historyFrag, "2").hide(historyFrag).commit();
        fm.beginTransaction().add(R.id.container,gameFrag, "1").commit();
    }

    @Override
    public void onBackPressed() {
        if(!gameFrag.isHidden() && gameFrag.getChildFragmentManager().getBackStackEntryCount() > 0) {
            gameFrag.getChildFragmentManager().popBackStackImmediate();
        } else {
            super.onBackPressed();
        }
    }

}

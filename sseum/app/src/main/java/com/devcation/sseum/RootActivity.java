package com.devcation.sseum;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.devcation.sseum.view.box.BoxFragment;
import com.devcation.sseum.view.home.HomeFragment;
import com.devcation.sseum.view.matter.MatterFragment;
import com.devcation.sseum.view.my_write.MyWtfragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RootActivity extends AppCompatActivity {

    Fragment fragmentHome;
    Fragment fragmentMatter;
    Fragment fragmentMyWrite;
    Fragment fragmentBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        fragmentHome = new HomeFragment();
        fragmentMatter = new MatterFragment();
        fragmentMyWrite = new MyWtfragment();
        fragmentBox = new BoxFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragmentHome).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.home:
                        fragment = fragmentHome;
                        break;

                    case R.id.matter:
                        fragment = fragmentMatter;
                        break;

                    case R.id.my_write:
                        fragment = fragmentMyWrite;
                        break;

                    case R.id.box:
                        fragment = fragmentBox;
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
                return true;
            }
        });






    }
}
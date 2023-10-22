package com.conghoan812.musicplayer.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.conghoan812.musicplayer.Adapter.MainViewPagerAdapter;
import com.conghoan812.musicplayer.Fragment.Fragment_Tim_Kiem;
import com.conghoan812.musicplayer.Fragment.Fragment_Trang_Chu;
import com.conghoan812.musicplayer.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }

    private void init() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(this);
        mainViewPagerAdapter.addFragment(new Fragment_Trang_Chu(), "Trang Chu");
        mainViewPagerAdapter.addFragment(new Fragment_Tim_Kiem(), "Tim Kiem");
        viewPager2.setAdapter(mainViewPagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText("Trang Chủ");
                        tab.setIcon(R.drawable.icon_home);
                    } else if (position == 1) {
                        tab.setText("Tìm Kiếm");
                        tab.setIcon(R.drawable.icon_search);
                    }
                }).attach();
    }

    private void anhxa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager2 = findViewById(R.id.myViewPager);
    }
}

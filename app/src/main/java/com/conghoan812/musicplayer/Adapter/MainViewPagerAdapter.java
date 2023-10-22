package com.conghoan812.musicplayer.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MainViewPagerAdapter extends FragmentStateAdapter {

    private final ArrayList<Fragment> arrayFragment = new ArrayList<>();
    private final ArrayList<String> arraytitle = new ArrayList<>();

    public MainViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return arrayFragment.get(position);
    }

    @Override
    public int getItemCount() {
        return arrayFragment.size();
    }

    public void addFragment(Fragment fragment, String title){
        arrayFragment.add(fragment);
        arraytitle.add(title);
    }

}

package com.conghoan812.musicplayer.Fragment;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.conghoan812.musicplayer.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment_Dia_Nhac extends Fragment {
    View view;
    CircleImageView circleImageView;
    ObjectAnimator objectAnimator;
    float currentRotation = 0f; //lưu góc xoay của imageviewcircle


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_dia_nhac, container, false);
        circleImageView = view.findViewById(R.id.imageviewcircle);
        objectAnimator = objectAnimator.ofFloat(circleImageView, "rotation", 0f, 360f);
        objectAnimator.setDuration(10000);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
        objectAnimator.setInterpolator(new LinearInterpolator());

        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                currentRotation = (float) animation.getAnimatedValue();
            }
        });

        objectAnimator.start();
        return view;
    }

    public void PlayNhac(String hinhanh) {
        Picasso.with(getContext()).load(hinhanh).into(circleImageView);
    }
    public void toggleRotation(boolean isPlaying) {
        if (objectAnimator != null) {
            if (isPlaying) {
                // Nếu đang phát, tiếp tục xoay hình ảnh
                if (!objectAnimator.isRunning()) {
                    objectAnimator.setFloatValues(currentRotation, currentRotation + 360f);
                    objectAnimator.start();
                }
            } else {
                // Nếu không phát, tạm dừng xoay hình ảnh
                if (objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
            }
        }
    }
}

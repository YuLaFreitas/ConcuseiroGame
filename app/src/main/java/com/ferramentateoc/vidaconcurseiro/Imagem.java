package com.ferramentateoc.vidaconcurseiro;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.transition.Slide;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewAnimator;

import androidx.annotation.RequiresApi;

import java.time.Duration;
import java.util.List;

@SuppressLint("Registered")
public class Imagem extends MainActivity{

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public List<Integer> passarSlide(){

   // ContentValues slide = new ContentValues();


    Slide slide1 = new Slide();

    slide1.getTargetIds().add( R.mipmap.slide1);
    slide1.getTargetIds().add( R.mipmap.slide2);
    slide1.getTargetIds().add( R.mipmap.slide3);
    slide1.getTargetIds().add( R.mipmap.slide4);
    slide1.getTargetIds().add( R.mipmap.slide5);

    slide1.setDuration(1000);
    slide1.getStartDelay();
    return slide1.getTargetIds();
}


}

package com.ferramentateoc.vidaconcurseiro;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class TextoImagem extends FrameLayout {
Cadernos cadernos = new Cadernos();

    @Override
    protected void onCreateContextMenu(ContextMenu menu) {
        super.onCreateContextMenu(menu);

    }


    public void setEsconder(int b){
        this.setVisibility(b);
    }

    public TextoImagem(final Context context) {
        super(context);
    }
}

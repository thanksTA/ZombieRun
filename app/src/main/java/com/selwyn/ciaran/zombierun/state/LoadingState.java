package com.selwyn.ciaran.zombierun.state;

import android.view.MotionEvent;

import com.selwyn.ciaran.zombierun.game.Assets;
import com.selwyn.ciaran.zombierun.utilities.Drawer;

/**
 * Created by Ciaran on 24/05/2017.
 */
public class LoadingState extends State {
    @Override
    public void init() {
        Assets.load();
    }

    @Override
    public void update() {
        setCurrentState(new MenuState());
    }

    @Override
    public void render(Drawer g) {

    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
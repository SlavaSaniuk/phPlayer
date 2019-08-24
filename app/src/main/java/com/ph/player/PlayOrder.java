package com.ph.player;

import java.io.File;
import java.util.LinkedList;

public class PlayOrder implements Playable {

    //Player current play order
    private final LinkedList<File> current_play_order = new LinkedList<>();

    @Override
    public void play() {

    }

    public LinkedList<File> getPlayOrder() {
        return current_play_order;
    }

}

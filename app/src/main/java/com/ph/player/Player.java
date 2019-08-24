package com.ph.player;


public class Player {

    //Class fields
    private static final Player player = new Player();
    private final PlayOrder current_paly_order = new PlayOrder(); //Player current play order


    //"Singleton" pattern
    private Player() {}

    public Player getInstance() {
        return player;
    }

}

package com.pantaleao.manager.entity;

import java.util.Date;

public class Match {

    private final int id;
    private final Date date;

    private Game winningGame;
    private Game losingGame;
    private int winnerId;
    private int loserId;

    public Match(int id) {
        this.id = id;
        this.date = new Date();
    }

    public void setWinner(Game winningGame, int winnerId) {
        this.winningGame = winningGame;
        this.winnerId = winnerId;
    }

    public void setLoser(Game losingGame, int losingId) {
        this.losingGame = losingGame;
        this.loserId = losingId;
    }
}

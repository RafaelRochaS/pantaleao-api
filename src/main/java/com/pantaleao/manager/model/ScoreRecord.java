package com.pantaleao.manager.model;

public class ScoreRecord {
  public Object winnerGame;
  public Object losingGame;
  public int winnerId;
  public int loserId;
  
  public ScoreRecord(Object winnerGame, Object losingGame, int winnerId, int loserId) {
    this.winnerGame = winnerGame;
    this.losingGame = losingGame;
    
    this.winnerId = winnerId;
    this.loserId = loserId;
  }
}
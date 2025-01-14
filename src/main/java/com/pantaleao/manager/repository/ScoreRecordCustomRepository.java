package com.pantaleao.manager.repository;

import com.pantaleao.manager.model.ScoreRecord;

public interface ScoreRecordCustomRepository {
  public ScoreRecord findHighestScore();

  public Integer findAverageScore();
}

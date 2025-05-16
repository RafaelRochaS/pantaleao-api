package com.pantaleao.manager.repository;

import com.pantaleao.manager.model.ScoreRecord;

public interface ScoreRecordCustomRepository {
  ScoreRecord findHighestScore();

  Integer findAverageScore();
}

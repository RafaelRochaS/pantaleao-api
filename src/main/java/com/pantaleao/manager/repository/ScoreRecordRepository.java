package com.pantaleao.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pantaleao.manager.model.ScoreRecord;

public interface ScoreRecordRepository extends JpaRepository<ScoreRecord, Integer>, ScoreRecordCustomRepository {
}

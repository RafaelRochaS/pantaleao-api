package com.pantaleao.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pantaleao.manager.model.ScoreRecord;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/score-records")
public class ScoreRecordController {

  private List<ScoreRecord> scoreRecords = new ArrayList<>();
  private int nextId = 1;

  @GetMapping
  public List<ScoreRecord> getAllScoreRecords() {
    return scoreRecords;
  }

  @PostMapping
  public ResponseEntity<ScoreRecord> addScoreRecord(@Valid @RequestBody ScoreRecord scoreRecord) {
    ScoreRecord finalScore = new ScoreRecord(nextId++, ...scoreRecord);
    scoreRecords.add(scoreRecord);
    return ResponseEntity.status(HttpStatus.CREATED).body(scoreRecord);
  }

}

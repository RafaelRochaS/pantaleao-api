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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/score-records")
public class ScoreRecordController {

  private List<ScoreRecord> scoreRecords = new ArrayList<>();
  private int nextId = 0;

  @GetMapping
  public List<ScoreRecord> getAllScoreRecords() {
    return scoreRecords;
  }

  @PostMapping
  public ResponseEntity<ScoreRecord> addScoreRecord(@Valid @RequestBody ScoreRecord scoreRecord) {
    scoreRecord.setScoreId(nextId++);
    scoreRecords.add(scoreRecord);
    return ResponseEntity.status(HttpStatus.CREATED).body(scoreRecord);
  }

  @PutMapping("/{id}")
  public ResponseEntity<ScoreRecord> updateScoreRecord(@PathVariable int id,
      @Valid @RequestBody ScoreRecord updatedScoreRecord) {

    try {
      scoreRecords.set(id, updatedScoreRecord);
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(updatedScoreRecord);
    } catch (IndexOutOfBoundsException e) {
      return ResponseEntity.notFound().build();
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().build();
    } catch (Exception e) {
      return ResponseEntity.internalServerError().build();
    }
  }
}

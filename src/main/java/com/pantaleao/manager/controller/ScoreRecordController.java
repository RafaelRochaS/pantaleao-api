package com.pantaleao.manager.controller;

import java.util.Map;
import java.util.Optional;
import java.util.Date;
import java.util.HashMap;

import com.pantaleao.manager.entity.Game;
import com.pantaleao.manager.entity.GameFactory;
import com.pantaleao.manager.entity.Match;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pantaleao.manager.model.ScoreRecord;
import com.pantaleao.manager.repository.PlayerRepository;
import com.pantaleao.manager.repository.MatchRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/score-record")
public class ScoreRecordController {
  
  private static final Logger logger = LoggerFactory.getLogger(ScoreRecordController.class);
  private final MatchRepository matchRepository;
  private final PlayerRepository playerRepository;
  
  public ScoreRecordController(MatchRepository matchRepository, PlayerRepository playerRepository) {
    this.matchRepository = matchRepository;
    this.playerRepository = playerRepository;
  }
  
  @GetMapping("/statistics/{game}")
  public Map<String, Object> getStatistics(String game) {
    logger.info("Getting games statistics: {}", game);
    
    Map<String, Object> stats = new HashMap<>();
    stats.put("totalGames", matchRepository.count());
    stats.put("averageScore", matchRepository.findAverageScore());
    ScoreRecord highestScore = matchRepository.findHighestScore();
    stats.put("highestScore", highestScore.getTotalScore());
    stats.put("highestScoreBy", playerRepository.findPlayerNameById(highestScore.getWinnerId()));
    
    return stats;
  }
  
  @GetMapping
  public Page<ScoreRecord> getAllScoreRecords(Pageable pageable) {
    return matchRepository.findAll(pageable);
  }
  
  @PostMapping("/{game}")
  public ResponseEntity<ScoreRecord> addScoreRecord(@RequestBody @Valid ScoreRecord scoreRecord, String game) {
    Game winnerGame = new GameFactory()
        .create(game)
        .validateInput(scoreRecord.winnerGame);
    Game losingGame = new GameFactory()
        .create(game)
        .validateInput(scoreRecord.losingGame);
    
    Match match = new Match(1);
    match.setLoser(losingGame, scoreRecord.loserId);
    match.setWinner(winnerGame, scoreRecord.winnerId);
    
    matchRepository.save(match);
    return ResponseEntity.status(HttpStatus.CREATED).body(scoreRecord);
  }
  
  @PutMapping("/{id}")
  public ResponseEntity<ScoreRecord> updateScoreRecord(@PathVariable int id,
                                                       @RequestBody Map<String, Object> updates) {
    
    Optional<ScoreRecord> currentRecord = matchRepository.findById(id);
    
    if (currentRecord.isEmpty()) {
      logger.info("Score record with id {} not found", id);
      return ResponseEntity.notFound().build();
    }
    
    try {
      ScoreRecord updatedScoreRecord = updateScoreObject(currentRecord.get(), updates);
      matchRepository.save(updatedScoreRecord);
      
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(updatedScoreRecord);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().build();
    } catch (Exception e) {
      logger.error("Unknown error:", e);
      return ResponseEntity.internalServerError().build();
    }
  }
  
  @org.jetbrains.annotations.Contract("_, _ -> param1")
  private ScoreRecord updateScoreObject(ScoreRecord record, Map<String, Object> updates) {
    updates.forEach((key, value) -> {
      switch (key) {
        case "date":
          record.setDate((Date) value);
          break;
        case "winnerId":
          record.setWinnerId((int) value);
          break;
        case "loserId":
          record.setLoserId((int) value);
          break;
        case "blueScore":
          record.setBlueScore((int) value);
          break;
        case "greenScore":
          record.setGreenScore((int) value);
          break;
        case "yellowScore":
          record.setYellowScore((int) value);
          break;
        case "templeScore":
          record.setTempleScore((int) value);
          break;
        case "godScore":
          record.setGodScore((int) value);
          break;
        case "monumentScore":
          record.setMonumentScore((int) value);
          break;
        case "chipScore":
          record.setChipScore((int) value);
          break;
        case "moneyScore":
          record.setMoneyScore((int) value);
          break;
        case "militaryScore":
          record.setMilitaryScore((int) value);
          break;
        case "senateScore":
          record.setSenateScore((int) value);
          break;
        case "totalScore":
          record.setTotalScore((int) value);
          break;
        case "isScientificVictory":
          record.setScientificVictory((boolean) value);
          break;
        case "isMilitaryVictory":
          record.setMilitaryVictory((boolean) value);
          break;
        case "isPoliticalVictory":
          record.setPoliticalVictory((boolean) value);
          break;
        default:
          throw new IllegalArgumentException("Invalid field: " + key);
      }
    });
    
    return record;
  }
}

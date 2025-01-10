package com.pantaleao.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.pantaleao.manager.model.Player;
import com.pantaleao.manager.repository.PlayerRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {

  private final PlayerRepository playerRepository;

  public PlayerController(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @GetMapping
  public List<Player> getAllPlayers() {
    return playerRepository.findAll();
  }

  @PostMapping
  public ResponseEntity<Player> addPlayer(@Valid @RequestBody Player player) {
    playerRepository.save(player);
    return ResponseEntity.status(HttpStatus.CREATED).body(player);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePlayer(@PathVariable int id) {
    if (!playerRepository.existsById(id)) {
      return ResponseEntity.notFound().build();
    }
    playerRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}

package com.pantaleao.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.pantaleao.manager.model.Player;

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

  private List<Player> players = new ArrayList<>();
  private int nextId = 0;

  @GetMapping
  public List<Player> getAllPlayers() {
    return players;
  }

  @PostMapping
  public ResponseEntity<Player> addPlayer(@Valid @RequestBody Player player) {
    player.setId(nextId++);
    players.add(player);
    return ResponseEntity.status(HttpStatus.CREATED).body(player);
  }

  @DeleteMapping("/{id}")
  public String deletePlayer(@PathVariable int id) {
    players.removeIf(player -> player.getId() == id);
    return "Player deleted successfully";
  }
}

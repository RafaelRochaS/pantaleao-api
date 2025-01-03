package com.pantaleao.manager.model;

import jakarta.validation.constraints.*;

public class Player {
  private int id;

  @NotBlank(message = "Name is mandatory")
  @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
  private String name;

  @Min(value = 0, message = "Score must be greater than or equal to 0")
  @Max(value = 100, message = "Score must be less than or equal to 100")
  private int score;

  public Player() {
  }

  public Player(int id, String name, int score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}

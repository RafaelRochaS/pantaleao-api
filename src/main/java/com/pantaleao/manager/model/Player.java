package com.pantaleao.manager.model;

import jakarta.validation.constraints.*;

public class Player {
  private int id;

  @NotBlank(message = "Name is mandatory")
  @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
  private String name;

  public Player() {
  }

  public Player(int id, String name, int score) {
    this.id = id;
    this.name = name;
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
}

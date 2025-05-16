package com.pantaleao.manager.entity;

import com.pantaleao.manager.exceptions.UnknownGameException;
import org.jetbrains.annotations.NotNull;

public class GameFactory {
  public Game create(String game) {
    switch (game) {
      case "pantaleao":
        return new Pantaleao();
      default:
        throw new UnknownGameException(game);
    }
  }
}

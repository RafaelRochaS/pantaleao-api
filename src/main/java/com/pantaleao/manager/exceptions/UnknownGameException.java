package com.pantaleao.manager.exceptions;

public class UnknownGameException extends Error {
  public UnknownGameException(String game) {
    super(String.format("Unknown game '%s' received, please check your request and try again", game));
  }
}

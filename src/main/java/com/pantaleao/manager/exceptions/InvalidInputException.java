package com.pantaleao.manager.exceptions;

public class InvalidInputException extends Error {
  public InvalidInputException() {
    super("Invalid input for selected game, please check your request and try again");
  }
}

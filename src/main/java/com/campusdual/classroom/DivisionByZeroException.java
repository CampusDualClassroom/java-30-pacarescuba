package com.campusdual.classroom;

public class DivisionByZeroException extends RuntimeException {
  public DivisionByZeroException() {
    super();
  }

  public DivisionByZeroException(String message) {
    super(message);
  }
}

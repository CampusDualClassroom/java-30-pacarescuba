package com.campusdual.classroom;

public class Exercise30 {

  public static int divisionWithCustomException(int dividend, int divisor) {
    try {
      int result = dividend / divisor;
      return result;
    } catch (ArithmeticException e) {
      throw new DivisionByZeroException("ERROR: No se puede dividir por cero");
    }
  }

  public static void main(String[] args) {
    try {
      divisionWithCustomException(45, 0);
    } catch (DivisionByZeroException e) {
      System.out.println("Error en la ejecución: " + e);
    }
  }
}

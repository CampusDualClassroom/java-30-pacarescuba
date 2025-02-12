package com.campusdual.classroom;

public class Exercise30 {

  public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
    if (divisor == 0) {
      throw new DivisionByZeroException("ERROR: No se puede dividir por cero");
    } else {
      return dividend / divisor;
    }
  }

  public static void main(String[] args) {
    try {
      divisionWithCustomException(1, 0);
    } catch (DivisionByZeroException e) {
      System.out.println("Error en la ejecución: " + e);
      e.printStackTrace();
    } finally {
      System.out.println("Programa finalizado.");
    }
  }
}

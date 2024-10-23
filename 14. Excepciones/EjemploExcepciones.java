public class EjemploExcepciones {
  public static void main(String[] args) {
    //   int resultado = dividir(10, 0);
    //   System.out.println("Resultado: " + resultado);
    try {
      int resultado = dividir(10, 10);
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Bloque finally: Liberando recursos.");
    }

    System.out.println("Programa continúa ejecutándose...");
  }

  public static int dividir(int dividendo, int divisor) {
    // if (divisor == 0) {
    //   throw new ArithmeticException("No se puede dividir por cero");
    // }
    return dividendo / divisor;
  }
}
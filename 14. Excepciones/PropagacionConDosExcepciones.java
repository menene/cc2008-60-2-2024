class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class PropagacionConDosExcepciones {

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido.");
        } catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally: Se ejecuta siempre.");
        }

        System.out.println("Programa continúa ejecutándose...");
    }

    public static void metodoA() throws NumberFormatException, MiExcepcion {
        metodoB(); 
    }

    public static void metodoB() throws NumberFormatException, MiExcepcion {
        metodoC();
    }

    public static void metodoC() throws NumberFormatException, MiExcepcion {
        String numeroInvalido = "abc";
        
        if (false) {
            Integer.parseInt(numeroInvalido);
        }

        if (true) {
            throw new MiExcepcion("Esta es una excepción personalizada.");
        }
    }
}
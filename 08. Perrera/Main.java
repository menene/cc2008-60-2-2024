import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Familia f1 = new Familia("Perez");

        String nombre, raza;
        int edad;

        String opcion = "";
        while (!opcion.equals("1")) {

            System.out.println("¿Quieres continuar? (2 para si / 1 para no)");
            opcion = sc.nextLine();

            if (opcion.equals("2")) {
                System.out.println("Nombre del perro:");
                nombre = sc.nextLine();
                System.out.println("Raza del perro:");
                raza = sc.nextLine();
                System.out.println("Edad del perro:");
                edad = sc.nextInt();
                sc.nextLine();

                Perro p = new Perro(nombre, raza, edad);

                if (f1.adoptar(p)) {
                    System.out.println("Perro adoptado correctamente");
                } else {
                    System.out.println("Perro ingresado a la perrera");
                }
            }
        }

        System.out.println(f1);
    }
}
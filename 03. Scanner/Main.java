import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();

        // System.out.println();
        System.out.println("\nHola " + nombre + " de " + edad + " años");

        sc.close();
    }
}
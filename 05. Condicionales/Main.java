import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int numero = 6;

        if (numero < 10)
            System.out.println("El numero es menor a 10"); // solo esto es parte del if
            System.out.println("El numero es muy pequeño"); // esto siempre se ejecuta, no es parte del if

        if (numero < 10) {
            System.out.println("El numero es menor a 10");
            System.out.println("El numero es muy pequeño");
        }

        if (numero < 10) System.out.println("El numero es menor a 10");

        int num1 = 10;
        int num2 = 20;

        if (num1 < num2 && num2 < 30) {
            System.out.println("Cumple :)");
        } else {
            System.out.println("No cumple :(");
        }

        if (num1 < num2 || num2 < 30) {
            System.out.println("Cumple :)");
        } else {
            System.out.println("No cumple :(");
        }

        int num3 = 30;
        int num4 = 1;

        int larger = (num3 > num4) ? num3 : num4;

        larger = 0;
        if (num3 > num4) {
            larger = num3;
        } else {
            larger = num4;
        }

        System.out.println(larger);

        int num5 = 100;
        int num6 = 1;
        String mensaje = (num5 < 200 && num6 > 0) ? (num5 < 100 ? "Es menor a 100" : "Esta entre 100 y 200") : "Es mayor que 200";

        System.out.println(mensaje);

        char letra1 = 'a';
        char letra2 = 'A';

        if (letra1 < letra2) {
            System.out.println("a es menor que A");
        } else {
            System.out.println("a es mayor que A");
        }

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        if (nombre.equals("Erick")) {
            System.out.println("Hola profe");
        } else {
            System.out.println("Hola " + nombre);
        }

        String cadena = "Hola";
        String alias = cadena;

        if (cadena == alias) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

        char letter = 'F';
        switch (letter) {
            case 'A':
                System.out.println("La letra es A");
                break;
            case 'E':
                System.out.println("La letra es E");
                break;
            case 'I':
                System.out.println("La letra es I");
                break;
            case 'O':
                System.out.println("La letra es O");
                break;
            case 'U':
                System.out.println("La letra es U");
                break;
            default:
                System.out.println("La letra no es una vocal");
        }
    }
}
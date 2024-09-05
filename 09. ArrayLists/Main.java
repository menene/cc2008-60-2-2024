import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Watermelon");
        frutas.add("Orange");
        frutas.add("Lime");

        System.out.println(frutas.size());
        System.out.println(frutas);

        boolean deleted = frutas.remove("Orange");

        System.out.println(frutas.size());
        System.out.println(frutas);

        // ---------------------------------------------------

        // int[] masfrutas = new int[10];
        // int[] masfrutas = {-1, -1, -1, -1, -1};
        // masfrutas[0] = 10;
        // masfrutas[1] = 20;

        // int indice_disponible = -1;
        // for (int i = 0; i < masfrutas.length; i++) {
        //     if (masfrutas[i] == -1) {
        //         indice_disponible = i;
        //     }
        // }

        // masfrutas[indice_disponible] = 30;

        // System.out.println(indice_disponible);

        // for (int i = 0; i < masfrutas.length; i++) {
        //     System.out.println(masfrutas[i]);
        // }

        // for (int numero: masfrutas) {
        //     System.out.println(numero);
        // }

        // System.out.println(masfrutas);
    }
}
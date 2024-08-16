class Main
{
    public static void main(String[] args)
    {
        int[] scores = new int[10];

        scores[0] = 79;
        scores[1] = 87;
        scores[2] = 94;
        scores[3] = 82;
        scores[4] = 67;
        scores[5] = 98;
        scores[6] = 87;
        scores[7] = 81;
        scores[8] = 74;
        scores[9] = 91;

        System.out.println(scores[0]);

        int first = 0;

        System.out.println(scores[first]);

        scores[first] = scores[first] + 5;

        System.out.println(scores[first]);

        // -----------------------------------------------

        boolean[] flags;
        // boolean flags[]; // equivalente a la línea anterior

        flags = new boolean[5];

        // -----------------------------------------------
        // recorrer un array usando el ciclo for
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println(scores[i]);
        }

        // -----------------------------------------------
        // recorrer un array usando iterador foreach
        System.out.println();
        System.out.println();

        for(int n: scores) {
            System.out.println(n);
        }

        // -----------------------------------------------
        // recorrer un array usando un for y length
        System.out.println();
        System.out.println();

        // no se puede cambiar el tamaño de un array
        // flags.length = 100;

        for (int i = 0; i < (flags.length); i++) {
            System.out.println(flags[i]);
        }

        // -----------------------------------------------
        // listas de inicializacion
        System.out.println();
        System.out.println();

        int[] units = {147, 323, 89, 933, 540, 269, 97, 114, 298, 476};

        System.out.println(units.length);
        System.out.println(units[3]);

        // -----------------------------------------------
        // arrays de objetos
        System.out.println();
        System.out.println();

        String[] words = new String[5];

        for(String str: words) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println(words[0]);

        String[] words2 = {"friendship","loyalty","honor","",""};
        System.out.println();
        for(String str: words2) {
            System.out.println(str);
        }

        // -----------------------------------------------
        // matrices

        int[][] matrix = new int[10][10];

        // dimension variable
        int[][] m = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4},
            {1, 2, 3},
            {1, 2},
            {1},
        };
    }
} 
import java.util.Scanner;

class Minesweeper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Board game = new Board(10, 10, 10);

        boolean go = true;

        while (go) {
            game.printBoard();

            System.out.println("Ingrese la fila:");
            int row = sc.nextInt();

            System.out.println("Ingrese la columna:");
            int col = sc.nextInt();

            if (game.isMine(row, col)) {
                System.out.println("PERDISTE!!! 😭");
                go = false;
            } else {
                game.reveal(row, col);
            }

            if (game.isFinished()) {
                System.out.println("Ganaste!!! 🤟🏽");
                go = false;
            }
        }

        game.revealBoard();
    }
}
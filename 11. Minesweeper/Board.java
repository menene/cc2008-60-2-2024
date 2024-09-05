import java.util.Random;

class Board
{
    private int rows, columns, mines;
    private Cell[][] grid;

    public Board(int rows, int columns, int mines)
    {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;

        this.grid = new Cell[rows][columns];

        this.initializeBoard();
        this.placeMines();
        this.calculateAdjacentMines();
    }

    private void initializeBoard()
    {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.grid[i][j] = new Cell();
            }
        }
    }

    private void placeMines()
    {
        Random rand = new Random();

        int placedMines = 0;
        while (placedMines < this.mines) {
            int i = rand.nextInt(this.rows);
            int j = rand.nextInt(this.columns);

            if (!this.grid[i][j].isMine()) {
                this.grid[i][j].setMine();

                placedMines++;
            }
        }
    }

    private void calculateAdjacentMines()
    {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (!this.grid[i][j].isMine()) {
                    this.grid[i][j].setAdjacentMines(
                        this.countAdjacentMines(i, j)
                    );
                }

            }
        }
    }

    private int countAdjacentMines(int row, int column)
    {
        int mines = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j ++) {
                int r = row + i;
                int c = column + j;

                if (r >= 0 && r < this.rows && c >= 0 && c < this.columns && this.grid[r][c].isMine()) {
                    mines++;
                }
            }
        }

        return mines;
    }

    public void printBoard()
    {
        System.out.println();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.grid[i][j].isRevealed()) {
                    if (this.grid[i][j].isMine()) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" " + this.grid[i][j].getAdjecentMines() + " ");
                    }
                } else {
                    System.out.print(" ? ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    public void revealBoard()
    {
        System.out.println();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (this.grid[i][j].isMine()) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + this.grid[i][j].getAdjecentMines() + " ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    public boolean isMine(int row, int column)
    {
        try {
            return this.grid[row][column].isMine();
        } catch (Exception e) {
            return false;
        }
    }

    public void reveal(int row, int column)
    {
        try {
            this.grid[row][column].reveal();
        } catch(Exception e) {}
    }

    public boolean isFinished() {
        int notRevealed = 0;

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (!this.grid[i][j].isRevealed()) {
                    notRevealed++;
                }
            }
        }

        return notRevealed == this.mines;
    }
}
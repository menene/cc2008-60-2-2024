class Cell
{
    private boolean mine, revealed;
    private int adjacentMines;

    public Cell()
    {
        this.mine = false;
        this.revealed = false;
        this.adjacentMines = 0;
    }

    public boolean isMine()
    {
        return this.mine;
    }

    public void setMine()
    {
        this.mine = true;
    }

    public int getAdjecentMines()
    {
        return this.adjacentMines;
    }

    public void setAdjacentMines(int mines)
    {
        this.adjacentMines = mines;
    }

    public boolean isRevealed()
    {
        return this.revealed;
    }

    public void reveal()
    {
        this.revealed = true;
    }
}
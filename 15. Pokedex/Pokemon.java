abstract class Pokemon
{
    protected String nombre;
    protected int hp;

    public Pokemon(String nombre, int hp)
    {
        this.nombre = nombre;
        this.hp = hp;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public abstract String showStatus();
}
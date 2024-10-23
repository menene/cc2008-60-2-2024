class Squirtle extends Pokemon implements IWaterAttacks
{
    public Squirtle(String nombre, int hp)
    {
        super(nombre, hp);
    }

    @Override
    public String showStatus()
    {
        return "Mi nombre es: " + this.nombre + " y tengo de vida: " + this.hp;
    }

    @Override
    public String surf()
    {
        return this.nombre + " surfea!";
    }

    @Override
    public String waterCannon()
    {
        return this.nombre + " cañonea!";
    }
}
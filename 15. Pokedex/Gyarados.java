class Gyarados extends Pokemon implements IWaterAttacks, IFlyingAttacks
{
    public Gyarados(String nombre, int hp)
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

    @Override
    public String wingFlap()
    {
        return this.nombre + " aletea!";
    }

    @Override
    public String hurricane()
    {
        return this.nombre + " huracanea!";
    }
}
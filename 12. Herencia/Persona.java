class Persona
{
    protected String nombre, cui;

    public Persona(String nombre, String cui)
    {
        this.nombre = nombre;
        this.cui = cui;
    }

    protected String getCui()
    {
        return this.cui;
    }

    protected String getNombre()
    {
        return this.nombre;
    }

    protected String hablar()
    {
        return "La persona habla";
    }
}
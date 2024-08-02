class Persona
{
    private String nombre, secreto;
    private int edad;

    public Persona(String name, int age)
    {
        this.nombre = name;
        this.edad = age;
        this.secreto = "shhhhhh";
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(int age)
    {
        this.edad = age;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    private String getSecreto()
    {
        return this.secreto;
    }

    public String confesar()
    {
        return this.getSecreto();
    }
}
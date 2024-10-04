class Universitario extends Estudiante
{
    private String universidad;

    public Universitario(String nombre, String cui, String carrera, int carnet, String universidad)
    {
        super(nombre, cui, carrera, carnet);
        this.universidad = universidad;
    }

    @Override
    protected String hablar()
    {
        return "El universitario habla mucho mejor";
    }
}
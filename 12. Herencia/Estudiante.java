class Estudiante extends Persona
{
    private String carrera;
    private int carnet;

    public Estudiante(String nombre, String cui, String carrera, int carnet)
    {
        super(nombre, cui);

        this.carrera = carrera;
        this.carnet = carnet;
    }

    @Override
    protected String hablar()
    {
        return "El estudiante habla mejor";
    }
}
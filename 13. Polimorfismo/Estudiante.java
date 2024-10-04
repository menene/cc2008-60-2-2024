class Estudiante extends Persona
{
    private String carnet, carrera;

    public Estudiante(String nombre, String cui, String carnet, String carrera)
    {
        super(nombre, cui);

        this.carnet = carnet;
        this.carrera = carrera;
    }

    //  public String getCarnet() {
    //     return this.carnet;
    // }

    // public String getCarrera() {
    //     return this.carrera;
    // }

    @Override
    public String toString()
    {
        return this.nombre + " " + this.cui + " " + this.carnet + " " + this.carrera;
    }
}
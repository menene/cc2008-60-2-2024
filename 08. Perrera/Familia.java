class Familia
{
    private String apellido;
    private Perro[] perros;

    public Familia(String apellido)
    {
        this.apellido = apellido;
        this.perros = new Perro[2];
    }

    public int getPerros()
    {
        int perros = 0;
        for (int i = 0; i < this.perros.length; i++) {
            if (this.perros[i] != null) {
                perros++;
            }
        }

        return perros;
    }

    public boolean adoptar(Perro p)
    {
        int indice = this.getPerros();

        if (indice < 4) {
            this.perros[indice] = p;

            return true;
        }

        return false;
    }

    public String toString()
    {
        String mensaje =  "Familia " + this.apellido + " ha adoptado los siguientes perros: \n";

        for (Perro p: this.perros) {
            if (p != null) {
                mensaje += p.getNombre() + "\n";
            }
        }

        return mensaje;
    }
}
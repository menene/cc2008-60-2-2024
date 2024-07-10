class Main
{
    public static void main(String[] args)
    {
        // Perro zeus = new Perro();
        // zeus.nombre = "Odin";

        // zeus.setNombre("Zeus");
        // System.out.println(zeus.getNombre());
        // zeus.ladrar();

        Perro suri = new Perro("Suri", "Labrador");
        System.out.println(suri.getNombre());
        System.out.println(suri.getRaza());

        Perro zeus = new Perro("Zeus", "Frenchie");
        System.out.println(zeus.getNombre());
        System.out.println(zeus.getRaza());

    }
}
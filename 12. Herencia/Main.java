import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        // Estudiante est = new Estudiante("Erick", "988765450101","Computación", 12345);
        // est.setCui("123");
        // String cui = est.getCui();
        // System.out.println(cui);

        Universitario persona1 = new Universitario("Erick", "988765450101","Computación", 12345, "UVG");
        // System.out.println(uvg.getNombre());
        // System.out.println(uvg.hablar());

        Estudiante persona2 = new Estudiante("Erick", "988765450101","Computación", 12345);

        Persona persona3 = new Persona("Erick", "988765450101");

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        System.out.println(personas);

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(persona1);
        estudiantes.add(persona2);
        // estudiantes.add(persona3);
        System.out.println(estudiantes);
    }
}
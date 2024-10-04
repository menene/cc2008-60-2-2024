import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Persona person = new Persona("Erick Marroquin", "1232312312310101");
        // System.out.println(person.getNombre() + " " + person.getCui());

        Estudiante student = new Estudiante("Guillermo Tornoe", "287634412120102", "240001", "Data Science");
        // System.out.println(student.getNombre() + " " + student.getCui() + " " + student.getCarnet() + " " + student.getCarrera());

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(person);
        personas.add(student);

        for (Persona per: personas) {
            // if (per instanceof Estudiante) {
            //     Estudiante e = (Estudiante) per;
            //     System.out.println(e.getNombre() + " " + e.getCui() + " " + e.getCarnet() + " " + e.getCarrera());
            // } else {
            //     System.out.println(per.getNombre() + " " + per.getCui());
            // }
            System.out.println(per);
        }
    }
}
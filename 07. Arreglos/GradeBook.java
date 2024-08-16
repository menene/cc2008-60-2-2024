class GradeBook
{
    public static void main(String[] args)
    {

        Student st1 = new Student(123456, "Estudiante Genérico");
        
        System.out.println("Notas originales");
        for(int grade: st1.getGrades()) {
            System.out.println(grade);
        }

        System.out.println();
        System.out.println();
        st1.setScore(1, 100);
        st1.setScore(2, 95);
        st1.setScore(3, 99);
        st1.setScore(100, 100); // no fallo porque lo manejamos en el setScore

        System.out.println("Luego de asignación de notas");
        for(int grade: st1.getGrades()) {
            System.out.println(grade);
        }

        System.out.println();
        System.out.println();
        st1.setScore(4, 89);
        st1.setScore(5, 100);

        System.out.println("Promedio:");
        System.out.println(st1.getFinalGrade());
    }
}
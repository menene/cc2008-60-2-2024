class GradeBookPro
{
    public static void main(String[] args)
    {
        // forma 1: no tan eficiente
        // Student[] students = new Student[3];
        // Student pedro = new Student(123, "Pedro Pérez");
        // Student maria = new Student(456, "María Guzman");
        // Student ana = new Student(789, "Ana Román");
        // students[0] = pedro;
        // students[1] = maria;
        // students[2] = ana;

        // forma 2: mejor pero algo largo
        // Student[] students = new Student[3];
        // students[0] = new Student(123, "Pedro Pérez");
        // students[1] = new Student(456, "María Guzman");
        // students[2] = new Student(789, "Ana Román");

        // forma 3: en una sola linea
        Student[] students = {
            new Student(123, "Pedro Pérez"), 
            new Student(456, "María Guzman"), 
            new Student(789, "Ana Román")
        };

        students[0].setGrades(70, 80, 90, 95, 100);
        students[1].setGrades(100, 90, 100, 0, 95);
        students[2].setGrades(60, 70, 50, 0, 0);

        double sum = 0;
        double fg;
        for(Student s: students) {
            fg = s.getFinalGrade();
            System.out.println(s.getName() + " - Promedio: " + fg);

            sum += fg;
        }

        double mean = (sum / students.length);

        System.out.println("\nPromedio general: " + mean);
    }
}
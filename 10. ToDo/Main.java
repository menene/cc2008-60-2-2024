import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ToDo list = new ToDo();

        User usr01 = new User("Erick Marroquin");
        User usr02 = new User("Maria Andrade");

        Task t1 = new Task(
            "Actualizar repo de POO", 
            "Hay cambios y material nuevo de ArrayLists. Recordar sección de Augusto", 
            usr01
        );

        Task t2 = new Task(
            "Practicar ArrayLists", 
            "Hay hoja de ejercicio el viernes!!!", 
            usr02
        );

        list.addTask(t1);
        list.addTask(t2);

        ArrayList<Task> currentTasks = list.getTasks();
        for (Task t: currentTasks) {
            System.out.println(t);
            System.out.println();
        }
    }
}
import java.util.ArrayList;

class ToDo
{
    private ArrayList<Task> tasks;

    public ToDo()
    {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task t) 
    {
        this.tasks.add(t);
    }

    public void removeTask(Task t)
    {
        // borrar una tarea
    }

    public void completeTask(Task t)
    {
        // marcarla como completa
    }

    public ArrayList<Task> getTasks()
    {
        return this.tasks;
    }
}
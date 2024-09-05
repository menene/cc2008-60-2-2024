class Task
{
    private String title, description;
    private boolean done;
    private User createdBy;

    public Task(String title, String description, User creator)
    {
        this.title = title;
        this.description = description;
        this.done = false;
        this.createdBy = creator;
    }

    @Override
    public String toString()
    {
        return this.title + "\n" + this.description + "\n by: " + this.createdBy.getName() + "\n";
    }
}
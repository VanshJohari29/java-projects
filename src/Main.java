public class Main {
    public static void main (String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask(1, "Buy groceries", "Shopping", "High", "Pending", "10-04-2026");
        tm.addTask(2,"To study","Studies","High","Pending","11-04-2026");
        tm.addTask(3,"To revise","Revision","Mid","Pending","09-04-2026");
        tm.addTask(4,"To apply","Job Applying","High","Pending","01-04-2026");

        tm.viewAllTasks();

        tm.markAsDone(1);
        tm.deleteCompletedTasks();

        tm.viewAllTasks();


    }

}

public class Main {
    public static void main (String[] args) {
        //ShoppingTaskManager tm = new ShoppingTaskManager();
        TaskOperations tm = new ShoppingTaskManager();
        tm.addTask("Buy groceries", "Shopping", "High", "Pending", "10-04-2026");
        tm.addTask("To study","Studies","High","Pending","11-04-2026");
        tm.addTask("To revise","Revision","Mid","Pending","09-04-2026");
        tm.addTask("To apply","Job Applying","High","Pending","01-04-2026");

        tm.viewAllTasks();

        tm.markAsDone(1);

        tm.deleteCompletedTasks();
        


        tm.viewCompletedTasks();

        System.out.println();


        tm.viewDeletedTasks();

        ShoppingOperations shopping = (ShoppingOperations) tm;
        shopping.addBudget(500);
        shopping.doubleBudget();


    }

}

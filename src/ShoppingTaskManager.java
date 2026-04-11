public class ShoppingTaskManager extends TaskManager implements ShoppingOperations{
    private double budget;

    public void addBudget(double budget) {
        this.budget = budget;
    }

    public void doubleBudget() {
        this.budget = budget * 2;
        System.out.println("Budget doubled to: " + this.budget);
    }
}

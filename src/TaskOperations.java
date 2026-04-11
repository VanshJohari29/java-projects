public interface TaskOperations {
    void addTask(int id, String title, String category, String priority, String status, String createdDate);
    void viewAllTasks();
    void deleteTask(int id);
    void markAsDone(int id);
    void deleteCompletedTasks();
    void viewCompletedTasks();
    void viewByCategory(String category);
}

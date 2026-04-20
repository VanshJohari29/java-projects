public interface TaskOperations {
    void addTask(String title, String category, String priority, String status, String createdDate);
    void viewAllTasks();
    void deleteTask(int id);
    void markAsDone(int id);
    void deleteCompletedTasks();
    void viewDeletedTasks();
    void viewCompletedTasks();
    void viewByCategory(String category);
}

import java.util.*;
public abstract class TaskManager implements TaskOperations {
    private  ArrayList<Task> tasks;
    private ArrayList<Task> completedTasks;
    private ArrayList<Task> deletdTasks;
    private int counter_id = 1;
    public TaskManager(){
        tasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
        deletdTasks = new ArrayList<>();
    }
    public void addTask(String title ,String category , String priority , String status , String createdDate){
        Task t = new Task(counter_id,title,category,priority,status,createdDate);
        tasks.add(t);
        counter_id ++;
    }
    public void viewAllTasks(){
        for(Task i : tasks ){
            System.out.println(i);
        }
    }

    public void markAsDone(int id){
        for(Task i : tasks){
            if(i.getId() == id){
                i.setStatus("Done");
            }
        }
    }
    public void deleteTask(int id){
        Task tasktodelete = null;
        for(Task i : tasks){
            if(i.getId() == id){
                tasktodelete = i;
                break;
            }
        }
        if(tasktodelete != null) {
            deletdTasks.add(tasktodelete);
            tasks.remove(tasktodelete);
        }
    }
    public void deleteCompletedTasks(){
        Iterator<Task> it = tasks.iterator();
        while(it.hasNext()){
            Task i = it.next();
            if(i.getStatus().equals("Done")){
                completedTasks.add(i);
                it.remove();
            }
        }
    }
    public void viewByCategory(String category){
        for(Task i : tasks ){
            if(i.getCategory().equals(category)){
                System.out.println(i);
            }
        }
    }
    public void viewCompletedTasks(){
        for(Task i : completedTasks){
            System.out.println(i);
        }
    }
    public void viewDeletedTasks(){
        for(Task i : deletdTasks){
            System.out.println(i);
        }
    }

}

import java.util.*;
public class TaskManager {
    private  ArrayList<Task> tasks;
    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask(int id , String title ,String category , String priority , String status , String createdDate){
        Task t = new Task(id,title,category,priority,status,createdDate);
        tasks.add(t);
    }
    public void viewAllTasks(){
        for(Task i : tasks ){
            System.out.println(i);
            System.out.println();
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
            tasks.remove(tasktodelete);
        }
    }
    public void deleteCompletedTasks(){
        Iterator<Task> it = tasks.iterator();
        while(it.hasNext()){
            Task i = it.next();
            if(i.getStatus().equals("Done")){
                it.remove();
            }
        }
    }
    public void viewByCategory(String category){
        for(Task i : tasks ){
            if(i.getCategory().equals(category)){
                System.out.println(i);
                System.out.println();
            }
        }
    }
}

public class Task {
    private int id;
    private String title;
    private String category;
    private String priority;
    private String status;
    private String createdDate;
    public Task(int id , String title ,String category , String priority , String status , String createdDate){
        this.id = id;
        this.category = category;
        this.priority = priority;
        this.title = title;
        this.status = status;
        this.createdDate = createdDate;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getPriority(){
        return priority;
    }
    public String getStatus(){
        return status;
    }
    public String getCreatedDate(){
        return  createdDate;
    }
    @Override
    public String toString(){
        return "TASK[id=" + id + ", title=" + title + ", category=" + category + ", priority=" + priority + ", status=" + status + ", createdDate=" + createdDate + "]";
    }
}

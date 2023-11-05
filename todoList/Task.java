package todoList;


import java.util.ArrayList;

public class Task {

    public String task;
    public boolean taskStatus;
    public String dueDate;
    public String priority;

    public void setPriority() {
        this.priority = "*";
    }



    public Task(String task, String dueDate) {
        this.task = task;
        this.taskStatus = false;
        this.dueDate = dueDate;
    }



    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(", Task: ").append(task).append(", Task Status: ").append(taskStatus).append(", Due Date: ").append(dueDate);
        if(priority != null){
            sb.append(" ").append(priority);
        }
        return sb.toString();
    }
}

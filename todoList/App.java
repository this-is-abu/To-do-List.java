package todoList;
import java.util.*;

public class App {


    public int getNumber(){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the task number");
        number=sc.nextInt();
        return number;
    }
    public void print(){
        System.out.println("1. ADD TASK");
        System.out.println("2. REMOVE TASK");
        System.out.println("3. EDIT TASK");
        System.out.println("4. MARK AS COMPLETE");
        System.out.println("5. SHOW TASKS");
        System.out.println("6. SET PRIORITY");
        System.out.println("7. EXIT");
    }
    public void editTask(ArrayList<Task> tasks){
        int checkNum=getNumber();
        for (Task obj : tasks) {
            if (tasks.indexOf(obj) == checkNum) {
                EditTask.editTask(obj);
            }
        }
    }

    public void remove(ArrayList<Task> tasks){
        int choice = getNumber();
        choice-=1;
        tasks.remove(choice);
    }

    public void markComplete(ArrayList<Task> tasks){
        int checkNum=getNumber();
        for (Task obj: tasks) {
            if(tasks.indexOf(obj)==checkNum){
                obj.setTaskStatus(true);
            }
        }
    }

    public void printTasks(ArrayList<Task> tasks){
        for (Task obj : tasks) {
            int index=tasks.indexOf(obj);
            System.out.print("Task Number: "+ (index+1));
            System.out.print(obj);
            System.out.println();
        }
    }

    public void setPriority(ArrayList<Task> tasks){
        int checkNum=getNumber();
        for (Task obj: tasks) {
            if(tasks.indexOf(obj)==checkNum){
                obj.setPriority();
            }
        }
    }
    public void execute() {
        String input ;
        Scanner sc=new Scanner(System.in);
        ArrayList<Task> tasks=new ArrayList<>();
        boolean check=true;

        while(check){
            print();
            input= sc.next();
            switch(input){
                case "1":

                    tasks.add(CreateTask.createTask());
                    break;

                case "2": {

                    remove(tasks);
                    break;
                }

                case "3": {
                    editTask(tasks);
                    break;
                }

                case "4":{
                    markComplete(tasks);
                    break;
                }


                case "5": {
                    printTasks(tasks);
                    break;
                }

                case "6":{
                    setPriority(tasks);
                    break;
                }

                case "7": {
                    check = false;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        App obj=new App();
        obj.execute();
    }
}

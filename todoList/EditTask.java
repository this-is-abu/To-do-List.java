package todoList;

import java.util.Scanner;

public class EditTask {
    public static void editTask(Task obj){
        Scanner sc= new Scanner(System.in);
        String newTask;
        String newDue;
        System.out.println("Enter new task:");
        newTask=sc.nextLine();
        obj.setTask(newTask);
        System.out.println("Enter new due date:");
        newDue= sc.nextLine();
        obj.setDueDate(newDue);
    }
}

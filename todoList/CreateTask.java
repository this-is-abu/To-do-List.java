package todoList;


import java.time.LocalDate;

import java.util.Scanner;

public class CreateTask {




    public static Task createTask(){
        Scanner sc=new Scanner(System.in);
        String task;
        String taskDue;
        boolean check=true;
        String taskDueCorrect="";
        LocalDate date=LocalDate.now();


        System.out.println("Task:");
        task=sc.nextLine();
        System.out.println("Task Due Date (yyyy-mm-dd) : ");


        while(check){
            taskDue= sc.nextLine();
            if(!CheckFormat.checkDateFormat(taskDue)){
                System.out.println("Invalid date format - Enter in format (yyyy-mm-dd)");
            }else if(!CheckFormat.checkDate(taskDue)){
                System.out.println("Enter a date after "+ date );
            }else{
                taskDueCorrect+=taskDue;
                check=false;
            }

        }


        return new Task(task,taskDueCorrect);

    }
}

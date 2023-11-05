package todoList;
import java.time.LocalDate;
public class CheckFormat {
    public static boolean checkDateFormat(String dueDate){
        String[] dueDateArr=dueDate.split("-");
        int i=0;
        if(dueDateArr[i].length()!=4){
            return false;
        }else if(dueDateArr[i+1].length()!=2){
            return false;
        } else if (dueDateArr[i+2].length()!=2) {
            return false;
        }
        for (String s:dueDateArr) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)<'0' && s.charAt(j)>'9'){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkDate(String dueDate){
        String[] dueDateArr=dueDate.split("-");
        LocalDate date=LocalDate.now();
        String currentDate=date.toString();
        String[] currentDateArr=currentDate.split("-");
        for (int i = 0; i < 3; i++) {
            if(Integer.parseInt(dueDateArr[i])<Integer.parseInt(currentDateArr[i])){
                return false;
            }else if(Integer.parseInt(dueDateArr[i])>Integer.parseInt(currentDateArr[i])){
               return true;
            }
        }

        return true;

    }
}
//else if(currentDateArr[i].equalsIgnoreCase(dueDateArr[i])){
//        continue;
//        }
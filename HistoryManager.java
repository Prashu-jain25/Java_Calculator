import java.util.ArrayList;

public class HistoryManager {
    // list to store history of operations
    private static ArrayList<String> history = new ArrayList<>(); 

    // method to add new record into list
    public static void addRecord(String record) {
        history.add(record);
    }

    // method to print all performed operations
    public static void printHistory() {
        if(history.isEmpty()) {
            System.out.println("No operation performed.");
        }
        else {
            for(String op : history) {
                System.out.println(op);
            }
        }
    }
   
}

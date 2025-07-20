public class Division {
    // // method to divide numbers
    public static double divide(int num1, int num2) {
        // Handle if second no. is 0 
        if(num2 == 0) {
            System.out.println("Can\'t divide by zero");
        }
        return ((double) num1 / num2);
    }
}

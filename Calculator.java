import java.util.Scanner;

// Main class for the calculator
public class Calculator {
    public static void main(String[] args) {
        // scanner object to take input from user
        Scanner input = new Scanner(System.in); 
        char choice = 'y'; // variable to control loop

        // do-while loop to perform repeated calculation
        do{
            // take first no. from user
            System.out.println("Enter first number : ");
            int num1 = input.nextInt();

            // take second no. from user
            System.out.println("Enter Second number : ");
            int num2 = input.nextInt();

            // ask user to choose operation
            System.out.println("Choose operation : +, -, *, /");
            char operator = input.next().charAt(0);

            String record = ""; // to store operation history

            // switch-case to handle operations
            switch(operator) {
                case '+' : {
                    int sum = Addition.add(num1, num2); // call Addition class method to add numbers
                    record = num1 + " + " + num2 + " = " + sum;
                    System.out.println("Result : " + sum);
                    break;
            
                }
                    
                case '-' : {
                    int diff = Subtraction.subtract(num1, num2);// call Subtraction class method to substract numbers
                    record = num1 + " - " + num2 + " = " + diff;
                    System.out.println("Result : " + diff);
                    break;
                }
                    

                case '*' : {
                    // call Multiplication class method to multiply numbers
                    int multiplication = Multiplication.multiply(num1, num2); 
                    record = num1 + " * " + num2 + " = " + multiplication;
                    System.out.println("Result : " + multiplication);
                    break;
                }
                    

                case '/' : {
                    // call Division class method to divide numbers
                    double divide = Division.divide(num1, num2);
                    record = num1 + " / " + num2 + " = " + divide;
                    System.out.println("Result : " + divide);
                    break;
                }
                    

                default: {
                    // handle invalid operator
                    System.out.println("Invalid operator");
                    continue; // skip remaining part of loop and ask user again
                }   
            }

            // call addRecord method from HistoryManager class to record history
            HistoryManager.addRecord(record);

            // ask if user wants to perform another operation
            System.out.println("Do you want to perform another operation? (y/n)");
            choice = input.next().charAt(0);

        } while(choice == 'y' || choice == 'Y'); // loop continues if user enters 'y'

        // ask if user want to see the history
        System.out.println("Do you want to print Operation History? (y/n)");
        char print = input.next().charAt(0);

        if(print == 'y' || print == 'Y') {
            HistoryManager.printHistory(); // print history
        }
        
        // close scanner to free
        input.close();
    }

}

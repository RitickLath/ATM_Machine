import java.util.Scanner;

public class Atm{
    private int PIN = 6209;
    private int balance = 56700;
    private String UserName = "Ritick";
    private int birthDate = 18;
    private int attempts = 3;
    // getter for PIN with some validations
    private void getPIN(){
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two digit number");
        int inp = s.nextInt();

        // Basic human question
        if(inp > 9 && inp<100){
            // name check
            System.out.println("Enter Yourn Name");
            String Value = s.next();

            // birth date check
            System.out.println("Enter your Birth date");
            int date = s.nextInt();
            if(Value.equals(UserName) && date == birthDate){
                System.out.println("PIN: " + PIN);
            }
            else{
                System.out.println("Not Matching with Actual Details, Try again!");
                // adding 3 attempts functionalities
                if(attempts > 0){
                    attempts--;
                    System.out.println(attempts + " Attempts Left");
                    getPIN();
                    
                }
                else{
                    System.out.println("Too many attempts. Try after 24hrs");
                    attempts = 3;
                }
            }  
        }
        else{
            System.out.println("OOPS!! Invalid Entry try Again");
        }
        s.close();
    }

    // withdraw money
    private void WithdrawMoney(int amo){
            if (amo < balance && amo%100 == 0) {
                balance = balance - amo;

            }
            else if(amo < balance && amo%100 != 0){
                System.out.println("Enter ammount in multiple of 100");
            }
            else if(amo - balance < 100){
                System.out.println("Insufficient balance or Unable to proceed request");
            }
            System.err.println("");
            System.out.println("1. Check Balance");
            System.out.println("2. Main Menu");
            System.out.println("Any Number. Exit");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if(n == 1){
                System.out.println("Balance: " + balance);
            }
            else if(n ==2){
                menu();
            }
            else{
                System.out.println("Visit Again!!");
            }
            s.close();
        }
    
    // Check Balance
    private void checkBalance(){
        System.out.println("Account Balance: " + balance);
            System.out.println("");
            System.out.println("Choose the Option");
            System.out.println("1. Main Menu");
            System.out.println("Any Number. Exit");
            
            System.out.println("Enter Number: ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if (n == 1) {
                menu();
            }
            else{
                System.out.println("Visit Again!!");
            }
            s.close();
    }

    // Deposit Money
    private void DepositMoney(int dep){
        
        if (dep % 100 == 0) {
            balance = balance + dep;
        }
        else{
            System.out.println("Invalid Request, Try Again!!");
        }
        System.err.println("");
            System.out.println("1. Check Balance");
            System.out.println("2. Main Menu");
            System.out.println("Any Number. Exit");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if(n == 1){
                System.out.println("Balance: " + balance);
            }
            else if(n ==2){
                menu();
            }
            else{
                System.out.println("Visit Again!!");
            }
            s.close();
        
    }

    // user interface -> 1: entering pass, 2: forget password 
    public void UI(){
        // Greeting
        System.out.println("Hello welcome to Java Bank");

        Scanner s = new Scanner(System.in);

        System.out.println("Press 1 to Enter Password");
        System.out.println("Press 2 to forget Password");
        System.out.println("");
        // taking input1

        System.out.print("Enter Number: ");
        int option = s.nextInt();

        // Entering password is chosen by user
        if(option == 1){
            System.out.print("Enter Password: ");
            int PasswordEntered = s.nextInt();
            if(PasswordEntered == PIN){
                menu();
            }
            else{
                System.out.println("Incorrect password");
                UI();
            }
        }

        // Forget password is chosen by user

        else if(option == 2){
            getPIN();
        }

        // Invalid Entry
        else{
            System.out.println("Invalid Entry");
        }
        s.close();
    }

    // showing menu for ATM features
    private void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose From Below Option");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        // User Input
        System.out.print("Enter Number: ");
        int inp = s.nextInt();

        // Check Balance
        if(inp == 1){
            checkBalance();
        }

        // Withdraw Money
        else if(inp == 2){
            System.out.print("Enter the amount in multiples of 100: ");
            int amo = s.nextInt();
            WithdrawMoney(amo);
        }
        
        // Deposit Money
        else if(inp == 3){
            System.out.print("Enter the amount in multiples of 100: ");
            int dep = s.nextInt();
            DepositMoney(dep);
        }
        
        // Exit 
        else if(inp == 4){
            System.out.println("Visit Again! Have a Nice day");

        }
        
        // Invalid Entry
        else{
            System.out.println("Invalid Entry, Try Again!");
        }
        s.close();
    }

}

class test{
    public static void main(String[] args) {
        Atm a = new Atm();
        a.UI();
    }
}
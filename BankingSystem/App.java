package BankingSystem;

// importing library to take input
import java.util.Scanner;

public class App {

    //menu function
    public static void showMenu(){
        System.out.println("======================");
        System.out.println(" WELCOME TO THE BANK  ");
        System.out.println("======================");
        System.out.println("Press 1. Register");
        System.out.println("Press 2. Login");
        System.out.println("Press 3. Exit");
    }
    public static void main(String[] args){
    
    // Creating new object for scanner
    Scanner sc = new Scanner(System.in);

    //running a loop to show menu again and again
    while(true){

        showMenu();

        System.out.println("Choose your option");
        int choice = sc.nextInt();

        //lets run a switch loop to take choice

        switch (choice) {
            case 1:
            System.out.println("Registering (Coming soon)");
            break;

            case 2:
            System.out.println("Logging in (Coming soon)");
            break;

            case 3:
            System.out.println("Existing (Coming soon)");
            break;
        
            default:
            System.out.println("Wrong Input");
            break;
        }

        //To print output all the time in next line
        System.out.println();

        //To stop leakage
        


    }









    
}

}

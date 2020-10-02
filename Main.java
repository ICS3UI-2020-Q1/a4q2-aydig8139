import java.util.Scanner;

/**
 * A program to prompt the user to enter positive integers
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    //declare the variable
    int usersNum;
    //create do while loop 
    do{
      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      usersNum = input.nextInt();

    }while(usersNum >= 0);

    System.out.println("All done!");
    
  }
}

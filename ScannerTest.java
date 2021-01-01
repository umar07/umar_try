import java.util.Scanner;

public class ScannerTest{
  public static void main(String args[]){

    // scanner gets its input from the console.
    Scanner sc = new Scanner(System.in);
    String name;

    // Get the user's name.
    System.out.print("Your name, adventurer? >");
    name = sc.next();
    System.out.println();

    // Print their name in a a message.
    System.out.println("Welcome, " + name + " to  Javaland!");
  }
}

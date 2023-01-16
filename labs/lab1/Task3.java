import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    System.out.println(
      "What is capital of Hungary?\n1.Vienna\n2.Budapest\n3.Brussels"
    );
    int correct = 2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ur choice: ");
    int userChoice = sc.nextInt();
    if (userChoice == correct) System.out.println(
      "Correct answer!!!!!"
    ); else System.out.println("Wrong answer better luck next time!!!!");
  }
}

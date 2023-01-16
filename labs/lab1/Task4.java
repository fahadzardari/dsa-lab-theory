import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of hours of work per week: ");
    int hours = sc.nextInt();
    System.out.print("Hourly salary: ");
    int hourlySalary = sc.nextInt();
    System.out.print("Absent Weeks: ");
    int weeksAbsent = sc.nextInt();
    int weeks = 52 - weeksAbsent;

    System.out.println(
      "Your Yearly salary is : " + ((hours * weeks) * hourlySalary)
    );
  }
}

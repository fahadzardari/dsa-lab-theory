import java.util.Scanner;

class Input {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your Name: ");
                String name;
                System.out.println("Enter Your Roll: ");
                String rollNo;
                name = sc.nextLine();
                rollNo = sc.nextLine();
                System.out.println(name + " " + rollNo);
        }

}
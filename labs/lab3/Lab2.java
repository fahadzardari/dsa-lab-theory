import java.util.Scanner;

public class Lab2 {

  int[] globalArray;
  int size = 0;
  public Scanner sc = new Scanner(System.in);

  int[] input() {
    System.out.print("Enter size of array: ");
    size = sc.nextInt();
    globalArray = new int[size];
    for (int i = 0; i < globalArray.length; i++) {
      System.out.print("Enter value at index " + i + " :");
      globalArray[i] = sc.nextInt();
    }
    display();
    return globalArray;
  }

  void display() {
    for (int i : globalArray) {
      System.out.print(i + ",");
    }
    System.out.println("");
  }

  int search() {
        System.out.println("Enter Target: ");
    int target = sc.nextInt();
    for (int i = 0; i < globalArray.length; i++) {
      if (globalArray[i] == target) {
        return i;
      }
    }

    return -1;
  }

  void update() {
    System.out.println("update");
  }

  void insert() {
    System.out.println("insert");
  }

  void delete() {
    System.out.println("delete");
  }

  void exit() {
    System.exit(0);
  }

  public void menu() {
    int opr = -1;
    while (opr != 7) {
      System.out.println("1- Input Array/Create Array");
      System.out.println("2- Display Array");
      System.out.println("3- Search");
      System.out.println("4- Update");
      System.out.println("5- Insertion");
      System.out.println("6- Deletion");
      System.out.println("7- Exit");
      System.out.print("Enter ur option:");
      opr = sc.nextInt();

      switch (opr) {
        case 1:
          input();
          break;
        case 2:
          display();
          break;
        case 3:
          int res = search();
          if (res == -1) {
            System.out.println("Target doesn't exist");
          } else {
            System.out.println("Target is at index = " + res);
          }
          break;
        case 4:
          update();
          break;
        case 5:
          insert();
          break;
        case 6:
          delete();
          break;
        case 7:
          exit();
          break;
        default:
          System.out.println("Invalid Output");
          break;
      }
    }
  }
}

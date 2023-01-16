package Task1;

class Employee{
    int age;
    boolean isAManager;
    double yearsOfService;
    int baseSalary;
    int overtimePayment;
    int totalPayment;
    double firstBonus;
    double secondBonus;
    double thirdBonus;
}
class Demo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.age = 29;
        System.out.println("age: " + e1.age);
        e1.isAManager = true;
        System.out.println("Is manager : " + e1.isAManager);
        e1.yearsOfService = 2.5;
        System.out.println("Years of service: " + e1.yearsOfService);
        e1.baseSalary = 3000;
        e1.overtimePayment = 40;
        e1.totalPayment = e1.baseSalary + e1.overtimePayment;
        System.out.println("Total salary: " + e1.totalPayment);
        e1.firstBonus = 10.00; 
        e1.secondBonus = 22.00; 
        e1.thirdBonus = 35.00;
        System.out.println("Bonus: " +( e1.firstBonus + e1.secondBonus + e1.thirdBonus));
    }

}

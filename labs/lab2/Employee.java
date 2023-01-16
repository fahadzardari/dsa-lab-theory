public class Employee {
        String first_name;
        String last_name;
        int salary;
        public String getFirstName() {
                return first_name;
        }
        public void setFirstName(String first_name) {
                this.first_name = first_name;
        }
        public String getLastName() {
                return last_name;
        }
        public void setLastName(String last_name) {
                this.last_name = last_name;
        }
        public int getSalary() {
                return salary;
        }
        public void setSalary(int salary) {
                if(salary > 0){
                        this.salary = salary;
                }else{
                        this.salary = 0;
                }
        }
        public void increaseSalary(int percentage){
                this.salary +=  this.salary*percentage/100;
        }
        
}
class Demo{
        public static void main(String[] args) {
                Employee e1 = new Employee();
                e1.setFirstName("Fahad");
                e1.setLastName("Hussain");
                e1.setSalary(100000);
                System.out.println("Employee 1 yearly salary: " + e1.getSalary() * 12);
                e1.increaseSalary(10);
                System.out.println("Employee 1 yearly salary after 10% increase: " + e1.getSalary() * 12);
                Employee e2 = new Employee();
                e2.setFirstName("Ali");
                e2.setLastName("Muhammed");
                e2.setSalary(1000);
                System.out.println("Employee 2 yearly salary: " + e2.getSalary() * 12);
                e2.increaseSalary(10);
                System.out.println("Employee 2 yearly salary after 10% increase: " + e2.getSalary() * 12);

        }
}

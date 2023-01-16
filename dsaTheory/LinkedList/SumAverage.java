
import java.util.Random;

public class SumAverage {
        static Random rand = new Random();
        public static void main(String[] args) {
                Node start = new Node(rand.nextInt(1000));
                Node p = start;
                for(int i = 0 ; i < 9 ; i++){
                        p.next = new Node(rand.nextInt(1000));
                        p = p.next;
                }
                
                System.out.println("Average = " + average(start));
                System.out.println("Sum = " + sum(start));

        }       

        public static int sum(Node n){
                int sum = 0;
                for(Node p = n ; p != null; p = p.next){
                        sum += p.data;
                }
               return sum;
        }

        public static int average(Node n){
                int counter = 0;
                for(Node p = n ; p != null; p = p.next){
                        counter++;
                }
                System.out.println(counter);
                return sum(n)/counter;
        }

        public static void traverse(Node n){
                for(Node p = n ; p != null; p = p.next){
                        System.out.println(p.data);
                }
        }
}

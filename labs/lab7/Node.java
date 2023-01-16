public class Node {
       Node next;
       String data;
       
       public Node(String s){
        this.data = s;
       }
       public Node(String s , Node n){
        this.data = s;
        this.next = n;
       }
}

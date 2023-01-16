public class Demo {
        public static void main(String[] args) {
                LinkedList l = new LinkedList("fourth");
                l.insertAtFirst("third");
                l.insertAtFirst("second");
                l.insertAtFirst("first");s
                LinkedList copy = l.copy();
                l.traverse();
                System.out.println("copy");
                copy.traverse();
                System.out.println(l.size());
                System.out.println(copy.size());
        }       
}

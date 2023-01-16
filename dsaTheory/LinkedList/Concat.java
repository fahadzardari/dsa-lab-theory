public class Concat {
        public static void main(String[] args) {
                Node first = new Node(0);
                Node p = first;
                for (int i = 1; i < 11; i++) {
                  p.next = new Node(i);
                  p = p.next;
                }
                Node second = new Node(11);
                p = second;
                for (int i = 12; i < 21; i++) {
                  p.next = new Node(i);
                  p = p.next;
                }
                first = Node.concat(first, second);
                Node.traverse(first);
        }
}

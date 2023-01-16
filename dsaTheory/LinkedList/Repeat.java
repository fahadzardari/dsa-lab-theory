public class Repeat{
        public static void main(String[] args) {
                Node start = new Node(0);
                Node p = start;
                for (int i = 1; i < 11; i++) {
                  p.next = new Node(i);
                  p = p.next;
                }
                p = Node.copy(start);
                Node c = Node.copy(start);
                start = Node.concat(start, p);
                start = Node.concat(start, c);

                Node.traverse(start);
        }

}

public class Replace {
        public static void main(String[] args) {
                Node start = new Node(0);
                Node p = start;
                for (int i = 1; i < 11; i++) {
                  p.next = new Node(i);
                  p = p.next;
                }
                start = Node.replace(start, 12, -33);
                Node.traverse(start);
        }
        
}

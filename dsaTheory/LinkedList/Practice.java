public class Practice {
        public static void main(String[] args) {
                Node start = new Node(0);
                Node p = start;
                for(int i = 1 ; i < 11 ; i++){
                        p.next = new Node(i * 2);
                        p = p.next;
                }
                start =  Node.insert(start, 1);



                Node.traverse(start);
        }   
            
}

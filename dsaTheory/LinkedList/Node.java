
public class Node{
        public int data;
        public Node next;
        

        public Node(int data){
                this.data = data;
        }
        public Node(int data , Node next){
                this.data = data;
                this.next = next;
        }
        public static Node insert(Node start , int x){
                if(start.data > x) return new Node(x , start);
                Node p = start;
                while(p.next != null){
                        if(p.next.data > x) break;
                        p = p.next;
                }

                p.next = new Node(x, p.next);


                return start;
        }
        public static Node replace(Node start , int position , int target){
                if(position > Node.size(start)) return start;
                Node p = start;
                for(int i = 1 ; i < position; i++){
                        p = p.next;
                }
                p.data = target;

                return start;
        }
        public static int size(Node start){
                int size =0;
                for(Node p = start; p != null; p = p.next){
                        size++;
                }
                return size;
        }
        public static Node concat(Node first , Node second){
                Node p = null;
                for(p = first; p.next != null; p=p.next){
                }
                p.next = second;
                return first;
        }
        public static Node copy(Node start){
                Node p = new Node(start.data , start.next);
                
                Node i = p;
                for(Node s = start.next; s != null ;s = s.next){
                        i.next = new Node(s.data);
                        i = i.next;
                }
                return p;
        }
        public static void traverse(Node n){
                for(Node p = n ; p != null; p = p.next){
                        System.out.println(p.data);
                }
        }
}
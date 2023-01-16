public class LinkedList {
        Node head;
        int size;
        public LinkedList(){

                head = null;
                
        }
        public LinkedList(int x){
                this.head = new Node(x);
                size++;
        }

        public void insertAtFirst(int x){
                Node n = new Node(x);
                n.next = head;
                head = n; 
                size++;
        }
        public void insertAtPosition(int data, int position) {
                Node newNode = new Node(data);
                if (position == 0) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }
                Node temp = head;
                for (int i = 1; i < position - 1 && temp != null; i++) {
                    temp = temp.next;
                }
                   newNode.next = temp.next;
                    temp.next = newNode;
                
        }
        public int linearSearch(int target){
                int counter = 1;
                for(Node p = head; p != null ; p = p.next){
                        if(p.data == target) return counter;
                        counter++;
                }
                return -1;
        }

        public void deleteAtPosition(int pos){
                int counter = 1;

                Node p = head;
                
                while( p != null ){
                        if(counter == pos - 1) break;
                        counter++;
                        p=p.next;
                }
                p.next = p.next.next;
        }


        public void traverse(){
                for(Node s = head; s != null ; s = s.next){
                        System.out.println(s.data);
                }
        }


        public int size(){
                return size;
        }
}

class Demo{
        public static void main(String[] args) {
                LinkedList l1 = new LinkedList(1);
                l1.insertAtFirst(2);
                l1.insertAtFirst(3);
                l1.insertAtFirst(4);
                l1.insertAtFirst(5);
                 l1.deleteAtPosition(5);
                l1.insertAtPosition(-234, 5);
                l1.traverse();
                // System.out.println(l1.linearSearch(1));
        }
}

public class NodeString{
        public String data;
        public NodeString next;

        public NodeString(String data){
                this.data = data;
        }
        public NodeString(String data , NodeString next){
                this.data = data;
                this.next = next;
        }

        public static void traverse(NodeString n){
                for(NodeString p = n ; p != null; p = p.next){
                        System.out.print(p.data + " ");
                }
                System.out.println(" ");
        }
}
public class Reverse {
  public static void main(String[] args) {
    Node start = new Node(0);
    Node p = start;
    for (int i = 1; i < 11; i++) {
      p.next = new Node(i);
      p = p.next;
    }
    int[] arr = nodeToArray(start);
    Node reverseStart = new Node(arr[arr.length-1]);
    p = reverseStart;
    for(int i = (arr.length - 2); i>=0; i--){
        p.next = new Node(arr[i]);
        p=p.next;
    }
    Node.traverse(reverseStart);


  }

  public static int[] nodeToArray(Node start) {
    int[] arr = new int[Node.size(start)];
    int index = 0;
    for (Node p = start; p != null; p = p.next) {
      arr[index] = p.data;
      index++;
    }

    return arr;
  }
}

public class LinkedList {

  Node head;
  int size;

  public LinkedList() {}

  public LinkedList(String d) {
    head = new Node(d);
    size++;
  }

  public void insertAtFirst(String s) {
    head = new Node(s, head);
    size++;
  }

  public void insertAtPosition(String s, int pos) {
    if (pos > size || pos < 1) {
      System.out.println("Invalid position");
      return;
    }
    if(pos == 1) {
        insertAtFirst(s);
        return;
    }

    Node p = head;
    for(int i = 1 ; i < pos - 1; i++){
        p = p.next;
    }
    p.next = new Node(s, p.next);
    size++;
  }
  public void insertAtLast(String s){
        if(size == 0){
                insertAtFirst(s);
        }
        Node p = head;
        while(p.next!=null){
                p=p.next;
        }
        p.next = new Node(s);
        size++;
  }

  public void deleteFirst(){
        head = head.next;
        size--;
  }
  public void deleteAtPosition(int pos) {
        if(pos == 1){
                deleteFirst();
                return;
        }
        if(pos > size || pos < 0){
                System.out.println("Invalid position");
                return;
        }
        Node p = head;
        for(int i = 1; i < pos -1; i++){

        }
        p.next = p.next.next;
        size--;
  }
  public LinkedList copy(){
          if(size == 0) return new LinkedList();
        LinkedList l = new LinkedList(head.data);
        Node p = head.next;
        while(p != null){
                l.insertAtLast(p.data);
                p = p.next;
        }

        return l;
  }

  public void traverse() {
    for (Node s = head; s != null; s = s.next) {
      System.out.println(s.data);
    }
  }

  public int size() {
    return size;
  }
}

class Para {

  public static void main(String[] args) {
    String para =
      "I love my university. I have been in this university for the last 12 months, and these 12 months have been best of my life, the university has provided a platform to enlighten myself and prepare me for future challenges, I will keep loving my university for the rest of my life";
    para = para.replace(",", "");
    para = para.replace(".", "");
    String[] words = para.split(" ");
    NodeString list = new NodeString(words[0]);
    NodeString p = list;
    //creating linkedList containing words
    for (int i = 1; i < words.length; i++) {
      p.next = new NodeString(words[i]);
      p = p.next;
    }
    NodeString.traverse(list);


    //find number of repetitions of a word
    NodeRepetitions repetitions = findRepetitions(list);
    NodeRepetitions.traverse(repetitions);

  }

  //this function will find and store how many times a word is repeated in paragraph
  public static NodeRepetitions findRepetitions(NodeString list){
    NodeRepetitions start  = new NodeRepetitions(list.data);
    for(NodeString p= list.next; p != null ; p = p.next ){
        NodeRepetitions j = start;
        boolean found = false;
        while(j.next != null && !found ){
            if(j.data.equals(p.data)){
                j.repetitions++;
                found = true;
            }
            j = j.next;

        }
        if(!found){
            j.next = new NodeRepetitions(p.data);
        }
    }
    return start;
  }

  
}
//this class will store each word of paragraph and it's number of occurences
class NodeRepetitions {

  public String data;
  public int repetitions;
  public NodeRepetitions next;

  public NodeRepetitions(String data) {
    this.data = data;
    repetitions = 1;
  }
  public static void traverse(NodeRepetitions repetitions){

      for(NodeRepetitions s = repetitions ; s != null ; s = s.next){
        System.out.println(s.data + " : " + s.repetitions);
    
      }
  }

}


public class ArrayStack implements Stack {
  int size;
  Object[] a;
  public ArrayStack(int x){
      a = new Object[x];
  }
  public Object peak(){
      return a[size -1];
  }

  public Object pop(){
    Object temp = a[size - 1];
    a[--size] = null;
    return temp;
  }

  public void push(Object o) {
      if(size > a.length * 0.5){
        resize();
      }
      a[size++] = o;
  }

  public int size() {
    return size;
  }
  public boolean isEmpty(){
        return (size > 0) ? false : true;
  }
  public String toString(){
      String s = "";
      for(int j = size - 1; j >= 0 ; j--){
          s += String.valueOf( a[j] );
      }

      return s;

  }
  public boolean equals(ArrayStack b){
      if(b.size() != this.size) return false;

      for(int i = 0 ; i < size; i++){
            if(String.valueOf(a[i])  != String.valueOf(b.a[i])) return false;
      }



      return true;
  }
  public void resize(){
    Object[] temp = new Object[size] ;
    System.arraycopy(a, 0, temp, 0, size);
    a = new Object[a.length*2];
    System.arraycopy(temp, 0, a, 0, size);
  }
  
}

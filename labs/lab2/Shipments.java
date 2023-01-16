public class Shipments {
  public static void main(String[] args) {
    double lg = 1.8; double med = 1; double sm = 0.6;
    int lgCount = 0; int mdCount = 0; int smCount = 0;
    double total = 0;
    int order = 27;
    System.out.println("Number of bags :" + order);
    while (order % 5 != 0) {
      order++;
    }
    while (order > 0) {
      if (order >= 20) {
        lgCount++;
        order -= 20;
      } else if (order >= 10) {
        mdCount++;
        order -= 10;
      } else if (order >= 5) {
        smCount++;
        order -= 5;
      }
    }
    total += lgCount * lg;
    total += mdCount * med;
    total += smCount * sm;
    System.out.println("Large boxes : " + lgCount);
    System.out.println("Medium boxes : " + mdCount);
    System.out.println("Small boxes : " + smCount);
    System.out.println("The total price = " + total);
  }
}

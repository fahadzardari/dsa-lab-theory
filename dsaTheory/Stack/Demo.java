public class Demo {
        public static void main(String[] args) {
                ArrayStack s = new ArrayStack(2);
                System.out.println("size " + s.size);
                s.push("fahad");
                s.push(45);

                ArrayStack b = new ArrayStack(2);
                b.push("fahad");
                b.push(45);

                System.out.println(s.equals(b));


                System.out.println(s.toString());
                System.out.println("size " + s.size);
                System.out.println(s.peak());
        }
}

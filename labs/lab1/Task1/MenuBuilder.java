package Task1;
import java.util.ArrayList;

class MenuBuilder{
    String menuTitle;
    ArrayList<String> menu = new ArrayList<>();
}

class MenuBuilder1 {
    public static void main(String[] args) {
        MenuBuilder m1 = new MenuBuilder();
        m1.menuTitle = "My Dream Menu: ";
        System.out.println(m1.menuTitle);
        String starter = "salad";
        m1.menu.add(starter);
        String mainCourse = "Biryani";
        m1.menu.add(mainCourse);
        String dessert = "Pudding";
        m1.menu.add(dessert);
        System.out.println(m1.menu.toString());

    }

}

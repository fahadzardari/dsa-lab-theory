import java.util.Arrays;

public class ContactApp {
  private String[][] contacts;
  public ContactApp(int size) {
    contacts = new String[size][2];
  }
  public void displayAllContacts() {
    for (String[] contact : contacts) {
      System.out.println(contact[0] + ": " + contact[1]);
    }
  }
  public String searchContact(String name) {
    for (String[] contact : contacts) {
      if (contact[0].equals(name)) {
        return contact[1];
      }
    }
    return null;
  }
  public void addContact(String name, String number, int pos) {
    contacts[pos][0] = name;
    contacts[pos][1] = number;
  }
  public void updateContact(String name1, String name2) {
    for (String[] contact : contacts) {
      if (contact[0].equals(name1)) {
        contact[0] = name2;
        break;
      }
    }
  }
  public void deleteContact(String name) {
    for (String[] contact : contacts) {
      if (contact[0].equals(name)) {
        contact[0] = null;
        contact[1] = null;
        break;
      }
    }
  }
}

class Demo {

  public static void main(String[] args) {
    ContactApp app = new ContactApp(3);
    app.addContact("Ali Muhaamad", "92142423", 0);
    app.addContact("Daniyal", "92352123", 1);
    app.addContact("Faraz", "92134145", 2);
    app.displayAllContacts();
    String number = app.searchContact("Faraz");
    System.out.println(number);
    app.updateContact("Faraz", "Azhar Hussin");
    app.deleteContact("Daniyal");
  }
}

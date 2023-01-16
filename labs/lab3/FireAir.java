public class FireAir {
  private String[] songs;
  private int size;
  public FireAir(int maxSize) {
    songs = new String[maxSize];
    size = 0;
  }
  public void printSongs() {
    for (int i = 0; i < size; i++) {
      System.out.println(i + ": " + songs[i]);
    }
  }
  public void addSong(String song) {
    if (size == songs.length) {
      System.out.println("Error: No more room to add songs.");
      return;
    }
    songs[size] = song;
    size++;
  }
  public void deleteSong(int index) {
    if (index < 0 || index >= size) {
      System.out.println("Error: Invalid index.");
      return;
    }
    for (int i = index; i < size - 1; i++) {
      songs[i] = songs[i + 1];
    }
    size--;
  }
  public void searchSong(int index) {
    if (index < 0 || index >= size) {
      System.out.println("Error: Invalid index.");
      return;
    }
    System.out.println(songs[index]);
  }
  public void searchSong(String name) {
    for (int i = 0; i < size; i++) {
      if (songs[i].equals(name)) {
        System.out.println(i + ": " + name);
        return;
      }
    }
    System.out.println("Error: Song not found.");
  }
  public void updateSong(int index, String value) {
    if (index < 0 || index >= size) {
      System.out.println("Error: Invalid index.");
      return;
    }
    songs[index] = value;
  }
  public static void main(String[] args) {
        FireAir f = new FireAir(5);
        f.addSong("Someday");
        f.addSong("Suffer");
        f.addSong("Friends");
        f.addSong("Watermelon Sugar");
        f.printSongs();
        f.deleteSong(2);
        f.addSong("Pillow Talk");
        f.printSongs();

  }
}
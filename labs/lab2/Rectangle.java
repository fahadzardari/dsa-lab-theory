public class Rectangle {
  float length;
  float width;
  public void setLength(float l) {
    if (l < 0 || l > 20) {
      this.length = 1;
    } else {
      this.length = l;
    }
  }
  public void setWidth(float w) {
    if (w < 0 || w > 20) {
      this.width = 1;
    } else {
      this.width = w;
    }
  }
  public float getWidth() {
    return width;
  }

  public float getLength() {
    return length;
  }

  public float area() {
    return length * width;
  }

  public float perimeter() {
    return length * 2 + width * 2;
  }
}

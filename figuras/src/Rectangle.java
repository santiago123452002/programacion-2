public class Rectangle extends Shape {
  private int height;
  private int width;

  public Rectangle(int newWidth, int newHeight) {
      setWidth(newWidth);
      setHeight(newHeight);
  }

  public int getHeight() {
      return height;
  }

  public void setHeight(int newHeight) {
      height = newHeight;
  }

  public int getWidth() {
      return width;
  }

  public void setWidth(int newWidth) {
      width = newWidth;
  }

  @Override
  public float getArea() {
      return height * width;
  }

  @Override
  public float getPerimeter() {
      return 2 * (height + width);
  }
}

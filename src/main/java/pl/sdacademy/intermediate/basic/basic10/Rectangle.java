package pl.sdacademy.intermediate.basic.basic10;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void updateWidth(int newWidth) {
        if (newWidth >= 0) {
            this.width = newWidth;
        }
    }

    public void updateHeight(int newHeight) {
        if (newHeight >= 0) {
            this.height = newHeight;
        }
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * height + 2 * width;
    }
}

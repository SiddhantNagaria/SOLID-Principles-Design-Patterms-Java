package cloneable;

public abstract class Shape implements Cloneable {

    private int width;
    private int height;
    private String color;

    // getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e); // can't happen, we implement Cloneable
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + width + " " + height + " " + color;
    }


}


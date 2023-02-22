package model;

public class TreeType {

    private Type value;
    private int high;
    private int width;
    private String color;

    public TreeType(Type value, int high, int width, String color) {
        this.value = value;
        this.high = high;
        this.width = width;
        this.color = color;
    }

    public Type getValue() {
        return value;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public enum Type{ORNAMENTAL, FLORAL, FRUTAL};


}

package model;

public class Tree {

    private int height;
    private int width;

    private String color;
    private TreeType name;


    public Tree(TreeType name) {
        this.name = name;
        this.height = name.getHigh();
        this.width = name.getWidth();
        this.color = name.getColor();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public TreeType getName() {
        return name;
    }

}

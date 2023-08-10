package ClassFolder;

public enum PaintColor {
    RED(1, "red"),
    BLUE(2, "blue"),
    GREEN(3, "green"),
    PURPLE(4, "purple"),
    WHITE(5, "white"),
    YELLOW(6, "yellow"),
    PINK(7, "pink"),
    GRAY(8, "gray");

    private int index;
    private String color;

    PaintColor(int index, String color) {
        this.index = index;
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public String getColor() {
        return color;
    }
}

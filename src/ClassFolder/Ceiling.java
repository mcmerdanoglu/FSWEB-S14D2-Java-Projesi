package ClassFolder;

public class Ceiling {

    private int height;

    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create(){
        System.out.println(getHeight() + " " + paintedColor);
    }

    @Override
    public String toString() {
        return "Ceiling=> " + "height: " + getHeight() + " painted color: " + getPaintedColor();
    }
}

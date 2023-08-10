package ClassFolder;

public class Bed {
    private int pillows, height, sheets, quilt;

    private String style;

    public Bed(int pillows, int height, int sheets, int quilt, String style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
        this.style = style;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilt;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Bed=> " + "pillows: " + getPillows() + " height: " + getHeight() +
                " sheet: " + getSheets() + " quilts: " + getQuilts() + " style: " + getStyle();
    }
}

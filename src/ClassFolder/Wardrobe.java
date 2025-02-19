package ClassFolder;

public class Wardrobe {
    private int width, height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        return "Wardrobe=> " + " width: " + getWidth() + " height: " +
                getHeight() + " weight: " + getWeight();
    }
}

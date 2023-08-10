package ClassFolder;

public enum LampType {
    FLORASAN(1,"florasan"),
    TUBE(2, "tube"),
    LED(3, "led"),
    DIMMER(4,"dimmer");
private int index;
private String material;

    LampType(int index, String material) {
        this.index = index;
        this.material = material;
    }
    public int getIndex() {
        return index;
    }

    public String getMaterial() {
        return material;
    }
}

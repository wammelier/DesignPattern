public class Guitar {

    private String serialNumber;
    private GuitarSpec spec;
    private double price;

    public Guitar(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

}

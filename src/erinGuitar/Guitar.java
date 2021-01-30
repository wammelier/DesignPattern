package erinGuitar;

public class Guitar extends Instrument {

//    private String serialNumber;
    private GuitarSpec spec;
//    private double price;

//    public Guitar(String serialNumber,
//                  double price, GuitarSpec spec) {
//        this.serialNumber = serialNumber;
//        this.price = price;
//        this.spec = spec;
//    }

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
        this.spec = spec;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

//    public String getSerialNumber() {
//        return serialNumber;
//    }

//    public double getPrice() {
//        return price;
//    }
//    public void setPrice(float newPrice) {
//        this.price = newPrice;
//    }

}

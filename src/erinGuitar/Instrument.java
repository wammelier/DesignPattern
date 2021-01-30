package erinGuitar;

public abstract class Instrument {

    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument (String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
    public void setSerialNumber (String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
         this.price = price;
    }

}

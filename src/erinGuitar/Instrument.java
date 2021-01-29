package erinGuitar;

public class Instrument {

    private String serialNumber;
    private double price;

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

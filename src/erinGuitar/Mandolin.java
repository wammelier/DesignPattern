package erinGuitar;

public class Mandolin extends Instrument {

    private MandolinSpec spec;

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec);
        this.spec = spec;
    }

    public MandolinSpec getSpec() {
        return spec;
    }




}

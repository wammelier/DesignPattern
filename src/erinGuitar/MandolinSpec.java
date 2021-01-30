package erinGuitar;


public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof MandolinSpec))
            return false;
        MandolinSpec spec = (MandolinSpec)otherSpec;
        if (!style.equals(spec.style))
            return false;
        return true;
    }

//    public Builder getBuilder() {
//        return builder;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public Type getType() {
//        return type;
//    }

//    public Wood getBackWood() {
//        return backWood;
//    }
//
//    public Wood getTopWood() {
//        return topWood;
//    }

}

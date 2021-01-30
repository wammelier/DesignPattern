package erinGuitar;

public class GuitarSpec extends InstrumentSpec {

//    private Type type;
//    private String model;
//    private Wood backWood;
//    private Wood topWood;
//    private Builder builder;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood, int numStrings) {
//        this.builder = builder;
//        this.type = type;
//        this.model = model;
//        this.backWood = backWood;
//        this.topWood = topWood;
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumString() {
        return numStrings;
    }

    public boolean marches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        GuitarSpec spec = (GuitarSpec)otherSpec;
        if(numStrings != spec.numStrings)
            return false;
        return true;
    }

//    public boolean matches(GuitarSpec otherSpec) {
//        if (builder != otherSpec.builder)
//            return false;
//        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
//            return false;
//        if (type != otherSpec.type)
//            return false;
//        if (numStrings != otherSpec.numStrings)
//            return false;
//        if (backWood != otherSpec.backWood)
//            return false;
//        if (topWood != otherSpec.topWood)
//            return false;
//
//        return true;
//    }

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
//
//    public Wood getBackWood() {
//        return backWood;
//    }
//
//    public Wood getTopWood() {
//        return topWood;
//    }


}

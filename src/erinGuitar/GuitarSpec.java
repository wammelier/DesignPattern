package erinGuitar;

public class GuitarSpec {

    private Type type;
    private String model;
    private Wood backWood;
    private Wood topWood;
    private Builder builder;
    private int numString;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (numString != otherSpec.numString)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;

        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }

}

public class GuitarSpec {

    private Type type;
    private String model;
    private Wood backWood;
    private Wood topWood;
    private Builder builder;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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

}

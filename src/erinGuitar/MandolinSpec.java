package erinGuitar;


public class MandolinSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Style style;
    private Wood backWood;
    private Wood topWood;

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Style getStyle() {
        return style;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(MandolinSpec spec) {
        return false;
    }

}

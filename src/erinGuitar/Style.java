package erinGuitar;

public enum Style {
    MANDOLIN;

    public String toString() {
        switch (this) {
            case MANDOLIN: return "Mandolin";
        }
        return null;
    }

}

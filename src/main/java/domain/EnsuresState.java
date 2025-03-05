package domain;

public class EnsuresState {

    private boolean ensures;

    public EnsuresState(boolean ensures) {
        this.ensures = ensures;
    }

    public boolean getValue() {
        return ensures;
    }

    @Override
    public String toString() {
        return ensures? "ensures = TRUE" : "ensures = FALSE";
    }
}

package au.com.friedbanana.raidin;

import java.util.Arrays;

public class Specification {
    private String characterClass;
    private String[] specs;

    public Specification(String characterClass, String[] specs) {
        this.characterClass = characterClass;
        this.specs = specs;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String[] getSpecs() {
        return specs;
    }

    public void setSpecs(String[] specs) {
        this.specs = specs;
    }

    @Override
    public String toString() {
        return "Specification [characterClass=" + characterClass + ", specs=" + Arrays.toString(specs) + "]";
    }

}

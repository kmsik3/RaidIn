package au.com.friedbanana.raidin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guild {
    @JsonProperty("name")
    private String name;

    public Guild() {

    }

    public Guild(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guild [name=" + name + "]";
    }

}

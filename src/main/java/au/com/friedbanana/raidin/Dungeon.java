package au.com.friedbanana.raidin;

public class Dungeon {
    private String name;

    public Dungeon() {

    }

    public Dungeon(String name) {
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
        return "Dungeon [name=" + name + "]";
    }

}

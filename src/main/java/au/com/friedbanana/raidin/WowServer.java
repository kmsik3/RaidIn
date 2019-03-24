package au.com.friedbanana.raidin;

public class WowServer {
    private String name;
    private String faction;

    public WowServer() {

    }

    public WowServer(String name, String faction) {
        this.name = name;
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    @Override
    public String toString() {
        return "WowServer [name=" + name + ", faction=" + faction + "]";
    }

}

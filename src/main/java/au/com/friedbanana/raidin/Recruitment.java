package au.com.friedbanana.raidin;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Collection;
import org.springframework.data.annotation.Id;

@Document(collection = "recruitment")
public class Recruitment {
    @Id
    private int id;
    private WowServer server;
    private Guild guild;
    private Dungeon dungeon;
    private Specification[] specs;
    private String[] days;
    private Hour hours;
    private String comment;
    private String errorMsg;

    public Recruitment(WowServer server, Guild guild, Dungeon dungeon, Specification[] specs, String[] days, Hour hours,
            String comment) {

        this.server = server;
        this.guild = guild;
        this.dungeon = dungeon;
        this.specs = specs;
        this.days = days;
        this.hours = hours;
        this.comment = comment;
    }

    public Recruitment(String errorMsg) {

        this.errorMsg = errorMsg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WowServer getServer() {
        return server;
    }

    public void setServer(WowServer server) {
        this.server = server;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public Specification[] getSpecs() {
        return specs;
    }

    public void setSpecs(Specification[] specs) {
        this.specs = specs;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public Hour getHours() {
        return hours;
    }

    public void setHours(Hour hours) {
        this.hours = hours;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Recruitment [id=" + id + ", server=" + server + ", guildId=" + guild + ", dungeonId=" + dungeon
                + ", specs=" + Arrays.toString(specs) + ", days=" + Arrays.toString(days) + ", hours=" + hours
                + ", comment=" + comment + "]";
    }

}

package au.com.friedbanana.raidin;

public class Hour {
    private String start;
    private String end;

    public Hour(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Hour [start=" + start + ", end=" + end + "]";
    }

}

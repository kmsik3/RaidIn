package au.com.friedbanana.raidin;

public interface SequenceRepository {
    int getNextSequenceId(String key) throws SequenceException;

}

package au.com.friedbanana.raidin;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentRepository extends MongoRepository<Recruitment, Long> {

    public ArrayList<Recruitment> findFirstById(int id);

    public Recruitment save(Recruitment recruitment);

}

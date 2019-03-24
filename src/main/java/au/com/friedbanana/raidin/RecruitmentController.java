package au.com.friedbanana.raidin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mongodb.MongoException;

@Controller
public class RecruitmentController {

    private static final String RECRUITMENT_SEQ_KEY = "recruitment";
    @Autowired
    private RecruitmentRepository recruitmentRepository;
    @Autowired
    private SequenceRepository sequenceRepository;
    
    
    @RequestMapping(value = "/findRecruitment", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Recruitment> findRecruitment(@RequestBody Recruitment rm) throws JSONException {
        
        ArrayList<Recruitment> recruitList; 
        recruitList = recruitmentRepository.findFirstById(rm.getId());
        JSONObject jObject = new JSONObject();
        for(int i=0; i<recruitList.size(); i++) {
            jObject.put("id", recruitList.get(i).getId());
            jObject.put("Guild", recruitList.get(i).getGuild());
            jObject.put("Specification", recruitList.get(i).getSpecs());
        }
        System.out.println(jObject);
        return recruitList;

    }
    
    //@CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(value = "/recruitment", method = RequestMethod.POST)
    public @ResponseBody Recruitment addRecruitment(@RequestBody Recruitment rm) {
        try {
            rm.setId(sequenceRepository.getNextSequenceId(RECRUITMENT_SEQ_KEY));
            recruitmentRepository.save(rm);
        } catch (MongoException e) {
            Recruitment recruitment = new Recruitment(e.toString());
            return recruitment;
        }

        return recruitmentRepository.save(rm);
    }

}

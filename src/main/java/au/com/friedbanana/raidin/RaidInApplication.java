package au.com.friedbanana.raidin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RaidInApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaidInApplication.class, args);

    }

    @Bean
    CommandLineRunner init(RecruitmentRepository recruitmentRepository) {

        return args -> {

        };

    }
}

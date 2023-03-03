package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("springdemo")
@PropertySource("classpath:sport.properties")

public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public  FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our volleyball coach and inject dependency

    @Bean
    public Coach volleyballCoach() {
        return new VolleyballCoach(sadFortuneService());
    }


}

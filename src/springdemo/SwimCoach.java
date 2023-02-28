package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService ;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Swim Coach : Inside the setFortuneService() method");
        this.fortuneService = fortuneService;
    }

    @Value("${team.email}")
    private String email;
    @Value("${team.teamName}")
    private String teamName;

    public SwimCoach() {
        System.out.println("Swim Coach : Inside default constructor");
    }

    public String getEmail() {
        return email;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice swimming for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

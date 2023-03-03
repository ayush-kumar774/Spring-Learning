package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class VolleyballCoach implements Coach{

    @Value("${team.email}")
    public String team;

    @Value("${team.teamName}")
    public String email;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private FortuneService fortuneService;

    public VolleyballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService ;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice daily for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

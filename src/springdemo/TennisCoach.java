package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService ;

    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("Tennis Coach : Calling doMyStartUpStuff() method");
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("Tennis Coach : Calling doMyCleanUpStuff() method");
    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }

    // define a default constructor
    public TennisCoach () {
        System.out.println("Tennis Coach : Inside default constructor");
    }

    // define a setter method
    //@Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println("Tennis Coach : Inside the setFortuneService() method");
//        fortuneService = theFortuneService ;
//    }

//    @Autowired
//    public void initFortuneService(FortuneService theFortuneService) {
//        System.out.println("Tennis Coach : Inside the initFortuneService() method");
//        fortuneService = theFortuneService ;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley" ;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

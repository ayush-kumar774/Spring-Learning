package springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
//    public RESTFortuneService() {
//        System.out.println("RESTFortuneService : Inside the default constructor");
//    }
    @Override
    public String getFortune() {
        return null;
    }
}

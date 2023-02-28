package springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
//    public DatabaseFortuneService() {
//        System.out.println("DatabaseFortuneService : Inside the default constructor");
//    }
    @Override
    public String getFortune() {
        return null;
    }
}

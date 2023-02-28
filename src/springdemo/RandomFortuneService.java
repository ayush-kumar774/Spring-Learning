package springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

//    public RandomFortuneService() {
//        System.out.println("RandomFortuneService : Inside the default constructor");
//    }

    // Create an array of string
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };
//    @Value("${random.fortune}")
//    private String[] data;

    // create a random number generator

    private Random random = new Random();

    @Override
    public String getFortune() {
        // Pick a random string from array.
        int index = random.nextInt(data.length);
        return data[index];
    }
}

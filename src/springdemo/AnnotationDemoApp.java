package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container

//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
//        Coach theCoach = context.getBean("tennisCoach" , Coach.class);
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call method to print the string
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeamName());

        // close the container
        context.close();

    }
}

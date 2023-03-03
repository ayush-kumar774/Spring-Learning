package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VolleyballJavaConfigDemoApp {
    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        VolleyballCoach theCoach = context.getBean("volleyballCoach", VolleyballCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // calling to test properties file
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());


        // close the container
        context.close();

    }
}

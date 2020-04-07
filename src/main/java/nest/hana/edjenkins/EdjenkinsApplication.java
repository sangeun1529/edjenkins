package nest.hana.edjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdjenkinsApplication {

    public static void main(String[] args) {


        System.out.println("jenkins test messege");


        SpringApplication.run(EdjenkinsApplication.class, args);
    }

}

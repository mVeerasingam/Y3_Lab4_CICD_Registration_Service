package ie.atu.y3_lab4_cicd_part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Y3Lab4CicdPart2Application {

    public static void main(String[] args) {
        SpringApplication.run(Y3Lab4CicdPart2Application.class, args);
    }

}

package ie.atu.y3_lab4_cicd_part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private NotificationServiceClient notificationServiceClient;
    @Autowired
    public RegistrationController(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    public String registrationRequest(@RequestBody UserDetails userDetails){
        String confirmationMsg = notificationServiceClient.someDetails(userDetails);
        return confirmationMsg;
    }
}

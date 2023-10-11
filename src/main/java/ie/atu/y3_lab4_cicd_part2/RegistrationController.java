package ie.atu.y3_lab4_cicd_part2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController {

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    public String registrationRequest(@RequestBody UserDetails userDetails){
        String confirmationMsg = String.format("Recieved details for %s with Email %s",
                userDetails.getName(), userDetails.getEmail());
        return confirmationMsg;
    }

//    @PostMapping("/confirm-and-register")
//    public Map<String, String> confirmAndRegister(@RequestBody UserDetails userDetails){
//        String confirm = registrationServiceClient.someDetails(userDetails);
//        Map<String, String> responseMessage = new HashMap<>();
//        responseMessage.put("message",confirm);
//        return responseMessage;
//    }
}

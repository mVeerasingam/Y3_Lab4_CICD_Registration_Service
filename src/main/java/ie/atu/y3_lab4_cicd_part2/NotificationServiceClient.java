package ie.atu.y3_lab4_cicd_part2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name="Notification-service", url="http://localhost:8083")
public interface NotificationServiceClient {
    @PostMapping("/confirm-notification")
    String someDetails(@RequestBody UserDetails userDetails);
}

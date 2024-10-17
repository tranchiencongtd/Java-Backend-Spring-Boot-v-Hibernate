package dev.congtc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    /* Field Injection */
    /* Not recommend to use */
    @Autowired
    private IMessage email;

//    @Autowired
//    public NotificationController(EmailService emailService) {
//        this.email = emailService;
//    }
//
//    @Autowired
//    public void setEmail(EmailService email) {
//        this.email = email;
//    }



    @GetMapping("/send-email")
    public String sendEmail() {
        return this.email.sendMessage();
    }
}

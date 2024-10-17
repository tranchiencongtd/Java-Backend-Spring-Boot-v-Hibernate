package dev.congtc;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements IMessage{
    @Override
    public String sendMessage() {
        return "Send Email .....";
    }
}

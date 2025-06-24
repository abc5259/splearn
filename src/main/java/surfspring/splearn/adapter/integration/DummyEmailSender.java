package surfspring.splearn.adapter.integration;

import org.springframework.context.annotation.Fallback;
import org.springframework.stereotype.Component;
import surfspring.splearn.application.required.EmailSender;
import surfspring.splearn.domain.Email;

@Component
@Fallback
public class DummyEmailSender implements EmailSender {
    @Override
    public void send(Email email, String subject, String body) {
        System.out.println("DummyEmailSender sending email: " + email);
    }
}

package surfspring.splearn;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import surfspring.splearn.application.required.EmailSender;
import surfspring.splearn.domain.MemberFixture;
import surfspring.splearn.domain.PasswordEncoder;

@TestConfiguration
public class SplearnTestConfiguration {
    @Bean
    public static EmailSender emailSender() {
        return (email, subject, body) -> System.out.println("Sending email: " + email);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return MemberFixture.createPasswordEncoder();
    }
}

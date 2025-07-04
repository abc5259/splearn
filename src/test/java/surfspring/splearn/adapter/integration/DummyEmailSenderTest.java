package surfspring.splearn.adapter.integration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.StdIo;
import org.junitpioneer.jupiter.StdOut;
import surfspring.splearn.domain.Email;

class DummyEmailSenderTest {
    @Test
    @StdIo
    void dummyEmailSender(StdOut out) {
        DummyEmailSender dummyEmailSender = new DummyEmailSender();

        dummyEmailSender.send(new Email("toby@splearn.app"), "subject", "body");

        assertThat(out.capturedLines()[0])
                .isEqualTo("DummyEmailSender sending email: Email[address=toby@splearn.app]");
    }
}

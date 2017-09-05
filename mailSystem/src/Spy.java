import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {

    Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail instanceof MailMessage) {
                MailMessage m = (MailMessage) mail;
                if ((m.getTo()=="Austin Powers")||(m.getFrom()=="Austin Powers")) {
                    logger.log(Level.WARNING, "Detected target mail correspondence: from " + m.getFrom() +" to " + m.getTo() + " \"" + m.getMessage() + "\"");
                }
                else logger.log(Level.INFO, "Usual correspondence: from " + m.getFrom() + " to " + m.getTo());
            }

        }
        return mail;
    }
}

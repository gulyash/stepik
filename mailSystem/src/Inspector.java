public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mp = (MailPackage) mail;
            if ((mp.getContent().getContent().contains("weapons")) ||
                    (mp.getContent().getContent().contains("banned substance"))) {
                throw new IllegalPackageException();
            }
            if (mp.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}

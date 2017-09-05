public class Thief implements MailService{

    private final int minPrice;
    private int stolenValue;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
        this.stolenValue=0;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage aPackage = (MailPackage) mail;
            if (aPackage.getContent().getPrice()>= minPrice){
                stolenValue+=aPackage.getContent().getPrice();
                return new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of " + aPackage.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}

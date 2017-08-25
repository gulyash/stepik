import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = ClassA.logger;
        logger1.setLevel(Level.ALL);

        Logger logger2 = ClassB.logger;
        logger2.setLevel(Level.WARNING);

        Logger logger3 = Logger.getLogger("org.stepic.java");
        logger3.setLevel(Level.ALL);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        logger3.addHandler(handler);
        logger3.setUseParentHandlers(false);
    }
}

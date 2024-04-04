package chain_of_res;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ChainOfResponsibilityExample {
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityExample.class.getName());

    public static void main(String[] args) {
        // level to log at
        logger.setLevel(Level.FINER);

        // create a handler
        ConsoleHandler handler = new ConsoleHandler();

        // level to publish at
        handler.setLevel(Level.FINEST);
        logger.addHandler(handler);

        logger.finest("Finest message"); // this one won't be logged
        logger.finer("Finer message");
        logger.fine("Fine message");
    }
}

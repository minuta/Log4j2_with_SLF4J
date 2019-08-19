import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static {

        // String workingDirectory = System.getProperty("user.dir");
        // System.out.println("Working dir: " + workingDirectory);
        //
        // System.setProperty("log4j.configurationFile", "./log4j2.xml");
        // System.setProperty("log4j2.debug", "");

    }

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private void logStuff() {

        final String CONFIG_FILE_PROPERTY = "log4j.configurationFile";
        System.out.println("Config file property: " + System.getProperty(CONFIG_FILE_PROPERTY));

        LOG.debug("XXXXXXXXXXXXXXX Debug log message");
        LOG.info("XXXXXXXXXXXXXXX Info log message");
        LOG.warn("XXXXXXXXXXXXXXX Warn log message");
        LOG.error("XXXXXXXXXXXXXXX Error log message");

        try {
            throw new ArithmeticException("math exception thrown...");
        } catch (Exception e) {
            LOG.error("Exception log", e);
        }
    }

    public static void main(final String[] args) {
        new Main().logStuff();
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    protected int num = 1;
    private static Logger logger = null;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(new Date()) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }


    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
package Creational.Singleton;

public class Logger {
    private static Logger logs = null;
    private String log;

    //constructor must be private so no one else can make another instance
    private Logger() {
        System.out.println("Created instance");
        log = "START";
    }

    public String getLog() {
        return log;
    }

    public void append(String s) {
        log += s;
    }


    public static Logger getInstance() {
        if (logs != null) {
            return logs;
        }

        logs = new Logger();
        return logs;
    }
}

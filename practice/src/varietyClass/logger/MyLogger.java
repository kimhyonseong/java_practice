package varietyClass.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    Logger logger = Logger.getLogger("mylogger");
    private static MyLogger instance = new MyLogger();

    public static final String errorLog = "log.txt";
    public static final String waringLog = "warning.txt";
    public static final String fineLog = "fine.txt";

    private FileHandler logFile = null;
    private FileHandler warningFile = null;
    private FileHandler fineFile = null;

    private MyLogger() {
        try {
            logFile = new FileHandler(errorLog,true);
            warningFile = new FileHandler(waringLog,true);
            fineFile = new FileHandler(fineLog,true);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        logFile.setFormatter(new SimpleFormatter());
        warningFile.setFormatter(new SimpleFormatter());
        fineFile.setFormatter(new SimpleFormatter());

        // 로그 레벨 지정 - 더 높은 걸따라간다?
        logger.setLevel(Level.ALL);  // 아래것도 INFO부터 기록됨
        fineFile.setLevel(Level.FINE);
        warningFile.setLevel(Level.WARNING);

        logger.addHandler(logFile);
        logger.addHandler(warningFile);
        logger.addHandler(fineFile);
    }

    // 싱글톤
    public static MyLogger getLogger(){
        return instance;
    }

    public void log(String msg) {
        logger.finest(msg);
        logger.finer(msg);
        logger.fine(msg);
        logger.config(msg);
        logger.info(msg);
        logger.warning(msg);
        logger.severe(msg);
    }

    public void fine(String msg) {
        logger.fine(msg);
    }

    public void warning(String msg) {
        logger.warning(msg);
    }
}

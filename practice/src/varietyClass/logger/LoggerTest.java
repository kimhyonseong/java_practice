package varietyClass.logger;

public class LoggerTest {
    public static void main(String[] args) {
        // 싱글톤
        MyLogger logger = MyLogger.getLogger();
        logger.log("log test");
    }
}

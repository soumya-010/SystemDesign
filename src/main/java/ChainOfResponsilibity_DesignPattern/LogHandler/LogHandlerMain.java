package ChainOfResponsilibity_DesignPattern.LogHandler;

public class LogHandlerMain {
    public static void main(String args[]) {
        LogProcessor ErrorLogHandler = new ErrorLogProcessor(LogType.ERROR, null);
        LogProcessor DebugLogHandler = new DebugLogProcessor(LogType.DEBUG, ErrorLogHandler);
        LogProcessor LogHandler = new InfoLogProcessor(LogType.INFO, DebugLogHandler);

        LogHandler.log(LogType.INFO, "Generic Info Print");
        LogHandler.log(LogType.DEBUG, "Generic DEBUG Print");
        LogHandler.log(LogType.ERROR, "Generic ERROR Print");
    }
}

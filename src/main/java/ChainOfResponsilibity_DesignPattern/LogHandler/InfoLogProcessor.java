package ChainOfResponsilibity_DesignPattern.LogHandler;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor (LogType logLevel, LogProcessor nextLogProcessor) {
        super(logLevel, nextLogProcessor);
    }
    @Override
    public void write(String message) {
        System.out.println("INFO: " + message);
    }
}
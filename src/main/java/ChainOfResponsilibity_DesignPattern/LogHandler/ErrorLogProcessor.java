package ChainOfResponsilibity_DesignPattern.LogHandler;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor (LogType logLevel, LogProcessor nextLogProcessor) {
        super(logLevel, nextLogProcessor);
    }
    @Override
    public void write(String message) {
        System.out.println("ERROR: " + message);
    }
}

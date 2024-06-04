package ChainOfResponsilibity_DesignPattern.LogHandler;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor (LogType logLevel, LogProcessor nextLogProcessor) {
        super(logLevel, nextLogProcessor);
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
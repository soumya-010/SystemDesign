package ChainOfResponsilibity_DesignPattern.LogHandler;

public abstract class LogProcessor {
    private LogType logLevel;
    public LogProcessor nextLogProcessor;

    public LogProcessor(LogType logLevel, LogProcessor nextLogProcessor) {
        this.logLevel = logLevel;
        this.nextLogProcessor = nextLogProcessor;
    }

    public void setNextLogProcessor(LogProcessor nextProcessor)
    {
        this.nextLogProcessor = nextProcessor;
    }

    public void log (LogType level, String message)
    {
        if (this.logLevel == level) {
            write(message);
        } else {
            if (this.nextLogProcessor != null) {
                this.nextLogProcessor.log(level, message);
            }
        }
    }

    public abstract void write(String message);
}


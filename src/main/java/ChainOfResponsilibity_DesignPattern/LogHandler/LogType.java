package ChainOfResponsilibity_DesignPattern.LogHandler;

public enum LogType {

    INFO(1),
    DEBUG(2),
    ERROR(3);
    private int value;
    LogType(int value) {
        this.value = value;
    }
}

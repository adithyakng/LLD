package LLDChainResponsibilityPrincipleDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, "This is error message");
        logProcessor.log(LogProcessor.INFO, "This is info message");
        logProcessor.log(LogProcessor.DEBUG, "This is debug message");
    }
}

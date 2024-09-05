package LLDChainResponsibilityPrincipleDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
    LogProcessor nextLogProcessor;

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level, String message) {
        if(level == ERROR){
            System.out.println("Error:" + message);
        }
        super.log(level, message);
    }
}

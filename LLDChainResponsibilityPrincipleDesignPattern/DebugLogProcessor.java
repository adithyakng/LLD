package LLDChainResponsibilityPrincipleDesignPattern;

public class DebugLogProcessor extends LogProcessor {
    LogProcessor nextLogProcessor;

    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level, String message){
        if(level == DEBUG){
            System.out.println("DEBUG: "+message);
        }
        super.log(level, message);
    }
}

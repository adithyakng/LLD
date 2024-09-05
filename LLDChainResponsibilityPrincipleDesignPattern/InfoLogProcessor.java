package LLDChainResponsibilityPrincipleDesignPattern;

public class InfoLogProcessor extends LogProcessor {
    LogProcessor nextLogProcessor;

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int level, String message) {
        if(level == INFO){
            System.out.println("Info:" +message);
        }
        super.log(level, message);
    }
}

package LLDChainResponsibilityPrincipleDesignPattern;

class LogProcessor{
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor nextProcessor;

    LogProcessor(LogProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public void log(int level, String message){
        if(nextProcessor != null){
            nextProcessor.log(level, message);
        }
    }
}
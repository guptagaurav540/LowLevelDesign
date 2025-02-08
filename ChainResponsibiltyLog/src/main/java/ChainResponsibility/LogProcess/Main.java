package ChainResponsibility.LogProcess;

public class Main {


    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR,"Error Occur");
        logObject.log(LogProcessor.DEBUG,"Need to debug this ");
        logObject.log(LogProcessor.INFO,"Just For info");
    } 

}

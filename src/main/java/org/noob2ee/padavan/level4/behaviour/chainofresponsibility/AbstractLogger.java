package org.noob2ee.padavan.level4.behaviour.chainofresponsibility;

public abstract class AbstractLogger {

    public static int ERROR = 0;
    public static int INFO = 1;
    public static int DEBUG = 2;

    protected int level;

    //next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    //in fact this method is template method
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}

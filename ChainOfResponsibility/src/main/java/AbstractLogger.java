/**
 * @author:ax1an9
 * @date: 8/4/2023
 * @time: 11:04 PM
 */
public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    protected int level;
    protected AbstractLogger nextLogger;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void logMsg(int level, String msg){
        if(this.level<=level){
            this.writeMsg(msg);
        }
        if(nextLogger!=null){
            nextLogger.logMsg(level,msg);
        }
    }
    public abstract void writeMsg(String msg);

}

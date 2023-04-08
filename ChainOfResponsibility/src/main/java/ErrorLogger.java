/**
 * @author:ax1an9
 * @date: 8/4/2023
 * @time: 11:08 PM
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("Error::Logger: "+msg);
    }
}

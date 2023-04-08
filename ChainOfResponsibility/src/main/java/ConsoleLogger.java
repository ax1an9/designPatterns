/**
 * @author:ax1an9
 * @date: 8/4/2023
 * @time: 11:12 PM
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level=level;
    }
    @Override
    public void writeMsg(String msg) {
        System.out.println("Console::Logger: "+msg);
    }
}

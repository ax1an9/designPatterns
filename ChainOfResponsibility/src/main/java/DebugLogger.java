/**
 * @author:ax1an9
 * @date: 8/4/2023
 * @time: 11:12 PM
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level=level;
    }

    @Override
    public void writeMsg(String msg) {
        System.out.println("Debug::Logger: "+msg);
    }
}

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author:ax1an9
 * @date: 8/4/2023
 * @time: 11:18 PM
 */
class AbstractLoggerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loggerProcessing() {
        final AbstractLogger debugLogger = new DebugLogger(2);
        final AbstractLogger consoleLogger = new ConsoleLogger(1);
        final AbstractLogger errorLogger = new ErrorLogger(3);
        // 绑定更高级的logger 作为后续处理者
        consoleLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        consoleLogger.logMsg(1,"1-Simple msg!");
        consoleLogger.logMsg(2,"2-Debug msg!");
        consoleLogger.logMsg(3,"3-Error msg!");
    }
}
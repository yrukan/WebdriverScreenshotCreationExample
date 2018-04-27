package by.htp.test.testexample;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{private static Logger logger = LogManager.getLogger();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
		logger.info("This is an info message");
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");
    }
}

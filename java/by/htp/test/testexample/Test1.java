package by.htp.test.testexample;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import org.junit.Assert;

import java.util.List;

@Test
public class Test1 {
	private static Logger logger = LogManager.getLogger();
	//private static Logger logger = LogManager.getRootLogger();

	public void test1() {
		List<String> list = null;
		
		logger.info("This is an info message");
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");
		logger.warn("This is a warn message");
		logger.error("This is a error message");

		Assert.assertNotNull(list);
	}
}

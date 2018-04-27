package by.htp.test.testexample.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class DriverSingletone {
    private static WebDriver driver;

    private DriverSingletone() {}

    public static WebDriver getWebDriverInstance() {
        if (null == driver) {
            System.setProperty("webdriver.chrome.driver", "D:\\students\\yuliya\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeWebBrowser(){
        if (null != driver){
            driver.quit();
        }
        driver = null;
    }
}
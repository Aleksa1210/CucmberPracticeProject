package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //Creating a private constructor, we are closing access to the
    // object of the class from outside the class
    private Driver(){}

    // We make Webdriver private, because we want to close access from outside of class
    //We make it static, because we will use it inside static method


  //  private static WebDriver driver; // default value driver null
    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();


    public static WebDriver getDriver(){
        // it will check if driver is null, if it is we will set up browser inside if statment
        // if you already set up driver and using it again for following line of code, it will return to same driver
        if (driverPool.get() == null){ // single degisn pedder
            // We read browser type from Configuration.properties with help of ConfigurationReader class getProperty() method
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;
            }
        }
        return driverPool.get();

    }

    public static void closeDriver(){
        if (driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
            //= null; // this line will termonate the existing driver session, with using this driver will not be use
        }

    }



}

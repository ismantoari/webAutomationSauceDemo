package com.ari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class BestUtil {
    public static WebDriver driver;

    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}



//    public static void startDriver() {
//        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//    }

//
//  //  public WebDriver driver = WebDriverManager.chromiumdriver().create();
//
//    public WebDriver driver = new ChromiumDriver();



//    protected static WebDriver driver;

//    protected void getDriver() {
////    ChromeOptions options = new ChromeOptions();
////    options.addArguments("--headless");
////    WebDriverManager.chromedriver().setup();
////    driver = new ChromeDriver(options);
//
//        driver = WebDriverManager.chromiumdriver().setup();

//    }



//}

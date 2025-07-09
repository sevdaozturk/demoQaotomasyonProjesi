package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            // Tarayıcının tam ekran açılması için öneri:
            options.addArguments("--start-maximized");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            driver = new ChromeDriver(options);
        }
        return driver;
    }
}



package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureLogger;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BaseTest {
    private static WebDriver driver;
    protected final AllureLogger LOG;

    public BaseTest(AllureLogger log) {
        LOG = log;
    }

    @BeforeEach
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public BaseTest() {
        LOG = new AllureLogger(LoggerFactory.getLogger(this.getClass()));  // Инициализация экземпляра в конструкторе
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

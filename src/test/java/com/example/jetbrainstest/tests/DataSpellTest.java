package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.DataSpellPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataSpellTest {

    private WebDriver driver;
    private DataSpellPage dt;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "D:\\Папка Оли\\тестировщик\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jetbrains.com/dataspell/");

        dt = new DataSpellPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Проверка перехода на страницу NEW-UI")
    public void newUITest() {
        dt.clickNewUI();
        assertEquals("https://www.jetbrains.com/dataspell/new-ui/", driver.getCurrentUrl(), "Адреса не совпадают");
    }

    @Test
    @DisplayName("Открытие выпадающего списка для скачивания и переход на страницу скачивания .exe")
    public void clickdownMacOS() {
        dt.clickdownLoadExe();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'.dmg (macOS Intel)')]")),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'.dmg (macOS Intel)')]"))));

        dt.clickMacOs();
        assertEquals("https://www.jetbrains.com/dataspell/download/download-thanks.html?platform=mac", driver.getCurrentUrl(), "Не открылась страница для скачивания");
    }

}


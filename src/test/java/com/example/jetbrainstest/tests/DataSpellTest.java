package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureAttachmentsManager;
import com.example.jetbrainstest.pages.dataspellpages.DataSpellHelpResourcesPage;
import com.example.jetbrainstest.pages.dataspellpages.DataSpellPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DataSpellTest extends BaseTest {
    private WebDriver driver;
    private DataSpellPage dt;
    private DataSpellHelpResourcesPage dthr;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/dataspell/");

        dt = new DataSpellPage(getDriver());
        dthr = new DataSpellHelpResourcesPage(getDriver());
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

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        //wait.until(ExpectedConditions.and(
                //ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'.dmg (macOS Intel)')]")),
               // ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'.dmg (macOS Intel)')]"))));
        //((JavascriptExecutor)driver).executeScript("arguments[0].click();", masOcIntel);

        dt.clickMacOs();
        assertEquals("https://www.jetbrains.com/dataspell/download/download-thanks.html?platform=mac", driver.getCurrentUrl(), "Не открылась страница для скачивания");
    }

    @Test
    @DisplayName("Блок с информацией Features")
    public void featuresTest(){
        dt.featuresElement();
        assertTrue(driver.findElement(By.cssSelector("h2#features")).isDisplayed(), "Нет нужного текста");
    }

    @Test
    @DisplayName("Открытие страницы Help Resources и Onboarding Tour")
    public void helpResourcesOnboardingTourTest(){
        dt.helpResourcesElement();
        dthr.clickGetStarted();
        dthr.clickfFirstSteps();
        dthr.clickOnboardingTour();

        assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Before you start')]")).isDisplayed(), "Нет нужного текста");

    }



}


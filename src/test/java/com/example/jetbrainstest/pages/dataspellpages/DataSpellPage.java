package com.example.jetbrainstest.pages.dataspellpages;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.tests.DataSpellTest;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class DataSpellPage {
    WebDriver driver;

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DataSpellPage.class));

    @FindBy(xpath = "//a[contains(text(),'New UI')]")
    private WebElement newUILink;

    @FindBy(css = "button[data-test='dropdown-trigger']")
    private WebElement downLoadExe;

    @FindBy (xpath = "//span[contains(text(),'.dmg (macOS Intel)')]")
    private WebElement masOcIntel;

    @FindBy(css = "h2#features")
    private WebElement features;

    @FindBy(xpath = "//a[contains(text(),'Help resources')]")
    private WebElement helpResources;



    public void clickNewUI() {
        newUILink.click();
        LOG.info("Переход на страницу New UI");
    }


    public void clickdownLoadExe() {
        downLoadExe.click();
        LOG.info("Открытие выпадающего списка для скачивания.exe");
    }


    public void clickMacOs() {
        masOcIntel.click();
        LOG.info("Переход на страницу Thank You");
    }


    public void featuresElement() {
        features.isDisplayed();
        LOG.info("Отображается блок Features");
    }


    public void helpResourcesElement() {
        helpResources.click();
        LOG.info("Отображается блок Help Resources");
    }


    public DataSpellPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
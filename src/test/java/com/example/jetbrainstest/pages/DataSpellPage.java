package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.tests.DataSpellTest;
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

    private final Logger LOG = LoggerFactory.getLogger(DataSpellTest.class);

    @FindBy(xpath = "//a[contains(text(),'New UI')]")
    private WebElement newUILink;

    @FindBy(css = "path[d=\'M19.004 9h-14l7 8 7-8z\']")
    private WebElement downLoadExe;

    @FindBy (xpath = "//span[contains(text(),'.dmg (macOS Intel)')]")
    private WebElement masOcIntel;

    @FindBy(css = "h2#features")
    private WebElement features;

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

    public DataSpellPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
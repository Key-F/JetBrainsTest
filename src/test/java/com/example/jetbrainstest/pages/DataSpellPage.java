package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DataSpellPage {
    @FindBy(xpath = "//a[contains(text(),'New UI')]")
    private WebElement newUILink;

    public void clickNewUI() {
        newUILink.click();
        System.out.println("Переход на страницу New UI");
    }

    @FindBy(css = "path[d=\'M19.004 9h-14l7 8 7-8z\']")
    private WebElement downLoadExe;

    @FindBy (xpath = "//span[contains(text(),'.dmg (macOS Intel)')]")
    private WebElement masOcIntel;

    @FindBy(css = "h2#features")
    private WebElement features;

    public void clickdownLoadExe() {
        downLoadExe.click();
        System.out.println("Открытие выпадающего списка для скачивания .exe");
    }

    public void clickMacOs() {
        masOcIntel.click();
        System.out.println("Переход на страницу Thank You");
    }

    public void featuresElement() {
        features.isDisplayed();
        System.out.println("Отображается блок Features");
    }

    public DataSpellPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
package com.example.jetbrainstest.pages.scalapages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class ScalaPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ScalaPage.class));
    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[contains(text(),'Get')]")
    private WebElement getButton;
    @FindBy(xpath = "//*[contains(text(),'Versions')]")
    private WebElement versions;
    @FindBy(xpath = "//*[contains(text(),'Show More')]")
    private WebElement showMore;
    @FindBy(xpath = "//*[contains(text(),'nightly')]")
    private WebElement nightly;
    @FindBy(xpath = "//*[contains(text(),'eap')]")
    private WebElement eap;
    @FindBy(css = "div.text-capitalize")
    private WebElement stable;



    public boolean checkIfGetButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки загрузки");
        wait.until(ExpectedConditions.visibilityOfAllElements(getButton));
        return getButton.isEnabled();
    }

    public boolean findButtonShowMore() {
        LOG.info("Проверка наличия кнопки 'Show More'");
        versions.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(showMore));
        return showMore.isDisplayed();
    }
    public boolean findButtonNightly (){
        LOG.infoWithScreenshot("Проверка наличия кнопки nightly");
        versions.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(nightly));
        return nightly.isDisplayed();
    }
    public boolean findButtonEap (){
        LOG.infoWithScreenshot("Проверка наличия кнопки EAP");
        versions.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(nightly));
        return eap.isDisplayed();
    }

    public boolean checkStable() {
        LOG.infoWithScreenshot("Проверка наличия кнопки Stable");
        versions.click();
        return stable.isEnabled();
    }

    public ScalaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }
}

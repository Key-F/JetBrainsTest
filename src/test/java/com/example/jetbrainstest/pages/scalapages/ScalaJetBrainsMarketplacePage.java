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
import java.util.ArrayList;
import java.util.List;

public class ScalaJetBrainsMarketplacePage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ScalaJetBrainsMarketplacePage.class));
    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[contains(text(),'Start Selling Plugins')]")
    private WebElement startSellingPlugins;
    @FindBy(xpath = "//*[contains(text(),'Reviews')]")
    private WebElement Reviews;
    @FindBy(xpath = "//*[contains(text(),'Learn more')]")
    private WebElement LearnMore;


    public Boolean clickStartSellingPlugins(){
        Reviews.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(LearnMore));
        LearnMore.click();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.visibilityOfAllElements(startSellingPlugins));
        return startSellingPlugins.isEnabled();
    }


    public ScalaJetBrainsMarketplacePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }
}
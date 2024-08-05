package com.example.jetbrainstest.pages;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RiderFlowPage {

    private final Logger LOG = LoggerFactory.getLogger(RiderFlowPage.class);

    WebDriver driver;
    String message = "clicked";

    @FindBy(css = "div > nav > div:nth-child(1) > button")
    private WebElement riderFlowPage;

    @FindBy(xpath = "//span[contains(text(),'RiderFlow')][last()]")
    private WebElement developerToolsElement;

    @FindBy(xpath = "//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement cookieAcceptButton;

    @FindBy(css = "a[href='/riderflow/download']:first-child")
    private WebElement watchButton;

    @FindBy(xpath = "//h1[contains(text(),'RiderFlow for Unity')]")
    private WebElement contentRiderFlow;

    public String contentRiderFlow() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(contentRiderFlow));
        return contentRiderFlow.getText();

    }

    public void clickElementDeveloperTools() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(riderFlowPage));
        riderFlowPage.click();
        System.out.println("Action of ElementDeveloperTools: " + message);
    }

    public void clickCookieAcceptButton() {
        cookieAcceptButton.click();
      LOG.info("Action of AcceptButton: ");
        System.out.println("Action of AcceptButton: " + message);
    }

    public void clickElementRiderFlow() {
        developerToolsElement.click();
        System.out.println("Action of ElementRiderFlow: " + message);
    }

    public void clickWatchButton() {
        watchButton.click();
        System.out.println("DownloadButton: " + message);
    }

    public RiderFlowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
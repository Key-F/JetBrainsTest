package com.example.jetbrainstest.pages;


import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class RiderFlowPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(RiderFlowPage.class));

    WebDriver driver;
    String message = "clicked";

    @FindBy(css = "div > nav > div:nth-child(1) > button")
    private WebElement riderFlowPage;

    @FindBy(xpath = "//span[contains(text(),'RiderFlow')][last()]")
    private WebElement developerToolsElement;

    @FindBy(xpath = "//button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement cookieAcceptButton;

    @FindBy(css = "a[href='/riderflow/download']:first-child")
    private WebElement downloadButton;

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
        LOG.info("Action of ElementDeveloperTools");
    }


    public void clickCookieAcceptButton() {
        cookieAcceptButton.click();
        LOG.infoWithScreenshot("Action of AcceptButton");
    }


    public void clickElementRiderFlow() {
        developerToolsElement.click();
        LOG.info("Action of ElementRiderFlow");
    }


    public void clickDownloadButton() {
        downloadButton.click();
        LOG.info("DownloadButton");
    }

    public Boolean checkDownloadButton() {
        System.out.println("Проверка кнопки Download");
        return downloadButton.isEnabled();
    }

    public RiderFlowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
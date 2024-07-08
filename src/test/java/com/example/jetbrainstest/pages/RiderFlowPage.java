package com.example.jetbrainstest.pages;

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

    WebDriver driver;
    String message = "clicked";

    @FindBy(css = "div > nav > div:nth-child(1) > button")
    private WebElement riderFlowPage;

    @FindBy(css = "#wt-site-header > div > div > div.wt-row.wt-row_align-items_center.wt-row_size_0 > div.wt-col-auto-fill.wt-col_align-self_stretch._siteHeader__contentPart_pisqy._siteHeader__desktopContentPart_cidj1._siteHeader__desktopContentPart_83ifal > div > nav > div._mainMenuItem_buxog._mainMenuItemActive_ol6e5j._mainMenuItemActive_kegas._mainMenuItemActive_z4ja9._mainMenuItemActive_h9omn._mainMenuItemFirstActive_x76mu > div > div > div > div._mainSubmenu__content_cx5o._mainSubmenu__content_ce97v > div._mainSubmenu__columnsWrapper_ex4h > div:nth-child(2) > div > div:nth-child(6) > a > span > span")
    private WebElement developerToolsElement;

    @FindBy(css = "body > div.jetbrains-cookies-banner-4 > div.jetbrains-cookies-banner-4__body > div:nth-child(2) > div > button.jetbrains-cookies-banner-4-button.jetbrains-cookies-banner-4-button--accent.jetbrains-cookies-banner-4__action\n")
    private WebElement cookieAcceptButton;

    @FindBy(xpath = "//*[@id='riderflow-page']/section[1]/div/div/div[2]/div/a")
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
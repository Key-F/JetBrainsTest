package com.example.jetbrainstest.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriterSidePage {

    private static final Logger LOG = LoggerFactory.getLogger(WriterSidePage.class);
    private WebDriver driver;

    @FindBy(css = "button[data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement acceptCookieButton;

    @FindBy(css = "a[data-test='button'][href='/writerside/download/']")
    private WebElement downloadButton;

    @FindBy(xpath = "//a[@href='/writerside/buy/']")
    public WebElement pricingButton;

    public WriterSidePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Accept Cookies if the button is available")
    public void acceptCookies() {
        try {
            acceptCookieButton.click();
            LOG.info("Cookies accepted");
        } catch (NoSuchElementException e) {
            LOG.info("Accept Cookies button is not available or already handled");
        }
    }
    @Step("Check if the Download button is enabled")
    public boolean isDownloadButtonEnabled() {
        LOG.info("Checking if the Download button is active");
        return downloadButton.isEnabled();
    }
    @Step("Check if the Pricing button is enabled")
    public boolean isPricingButtonEnabled() {
            LOG.info("Checking if the Pricing button is active");
            return pricingButton.isEnabled();
        }
}

package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExposedPage {
    WebDriver driver;

    @FindBy(css = "button.ch2-allow-all-btn.ch2-btn-primary")
    private WebElement acceptCookiesButton;

    @FindBy(css = "a[data-test*='button'][href*='getting-started']")
    private WebElement getStartedButton;

    public Boolean checkIfDownloadButtonIsClickable() {
        System.out.println("Проверка активности кнопки Get Started");
        return getStartedButton.isEnabled();
    }

    public ExposedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        handleCookiePopup();
    }

    private void handleCookiePopup() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(acceptCookiesButton))
                .click();
    }
}

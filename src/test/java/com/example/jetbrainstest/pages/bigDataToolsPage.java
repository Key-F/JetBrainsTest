package com.example.jetbrainstest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class bigDataToolsPage {
    private final Logger LOG = LoggerFactory.getLogger(bigDataToolsPage.class);
    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[contains(text(),'Get')]")
    private WebElement getButton;

    public Boolean checkIfGetButtonIsClickable() {
        LOG.info("Проверка активности кнопки скачивания");
        return getButton.isEnabled();
    }

    public bigDataToolsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}


package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

public class BigDataToolsPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(BigDataToolsPage.class));
    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[contains(text(),'Get')]")
    private WebElement getButton;

    @FindBy(xpath = "//*[contains(text(),'242.19890.14']")
    private WebElement getVersion;

    public Boolean checkIfGetButtonIsClickable() {
        LOG.info("Проверка активности кнопки скачивания");
        return getButton.isEnabled();
    }

    public void clickOnGetButton() {
        LOG.info("Нажимаем на кнопку скачивания");
        getButton.click();
    }

    public void clickOnVersionButton() {
        LOG.info("Нажимаем на скачивание версии 242.19890.14");
        getVersion.click();
    }

    public BigDataToolsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}


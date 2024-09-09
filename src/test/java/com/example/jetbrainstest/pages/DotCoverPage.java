package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.tests.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class DotCoverPage {

    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DotCoverPage.class));

    WebDriver driver;

    @FindBy(css = "a[data-test='button'][href='/dotcover/download/']")
    private WebElement downloadButton;

    public Boolean checkActivityOfDownload() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки загрузки");
        return downloadButton.isEnabled();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/buy/']")
    private WebElement pricingButton;

    public Boolean checkActivityOfPricing() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки цен");
        return pricingButton.isEnabled();
    }

    @FindBy(xpath = "//h1[@class='wt-col-inline rs-hero rs-hero_theme_dark']")
    private WebElement dotCoverEl;

    public Boolean checkDotCoverEl() {
        LOG.infoWithScreenshot("Проверка наличия текста");
        return dotCoverEl.isDisplayed();
    }

    @FindBy(css = "a[data-test='button'][href='/dotcover/features']")
    private WebElement allFeaturesEl;

    public Boolean checkActivityOfAllFeatures() {
        LOG.infoWithScreenshot("Проверка работоспособности кнопки изучения всех особенностей");
        return allFeaturesEl.isEnabled();
    }

    public DotCoverPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
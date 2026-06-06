package com.example.jetbrainstest.pages;

// https://www.jetbrains.com/rider/

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RiderPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(RiderPage.class));
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='rider-download-button__wrapper']//a[@href='/rider/download/']")
    public WebElement secondButtonDownloadRider;

    @FindBy(xpath = "//div//a[@href='/']")
    public WebElement mainPageButton;

    @FindBy(xpath = "//div//a[contains(@href, '/docker-dotnet/')]")
    public WebElement dockerButton;

    @FindBy(xpath = "//a[contains(@class, 'menu-item')]//span[contains(text(), 'Pricing')]")
    public WebElement pricingButton;

    @FindBy(xpath = "//div//a[@href='/rider/nextversion/']")
    public WebElement comingIn2024Button;

    @FindBy(xpath = "//div//a[@href='/rider/whatsnew/' and @target='_self']")
    public WebElement whatsNewButton;

    @FindBy(xpath = "//div//a[@href='/rider/features/']")
    public WebElement featuresButton;

    @FindBy(xpath = "//div//a[@href='/rider/documentation/']")
    public WebElement learnButton;

    @FindBy(xpath = "//div//a[@href='/rider/social/']")
    public WebElement socialButton;

    @FindBy(xpath = "//span[contains(text(), 'Fast-tracked development')]")
    public WebElement fastTrackedButton;

    @FindBy(xpath = "//h3[contains(text(), 'Fast-tracked development')]")
    public WebElement fastTrackedText;

    @FindBy(xpath = "//span[contains(text(), 'Game dev power-up')]")
    public WebElement gameDevButton;

    @FindBy(xpath = "//h3[contains(text(), 'Game dev power-up')]")
    public WebElement gameDevText;

    @FindBy(xpath = "//span[contains(text(), \"Next-level debugging\")]")
    public WebElement nextLevelButton;

    @FindBy(xpath = "//h3[contains(text(), \"Next-level debugging\")]")
    public WebElement nextLevelText;

    @FindBy(xpath = "//h3[contains(text(), 'ReSharper ')]")
    public WebElement reSharperCButton;

    @FindBy(xpath = "//h3[contains(text(), 'dotCover')]")
    public WebElement dotCoverButton;

    @FindBy(xpath = "//h3[contains(text(), 'dotTrace')]")
    public WebElement dotTraceButton;

    @FindBy(xpath = "//h3[contains(text(), 'dotMemory')]")
    public WebElement dotMemoryButton;

    @FindBy(xpath = "//h3[contains(text(), 'dotPeek')]")
    public WebElement dotPeekButton;

    @FindBy(xpath = "//button[contains(@aria-label, 'Team Tools:') and contains(@class, 'mainMenuItem')]")
    public WebElement teamToolsButton;

    @FindBy(xpath = "//button[contains(@aria-label, 'Education') and contains(@class, 'mainMenuItem')]")
    public WebElement educationButton;

    @FindBy(xpath = "//button[contains(@aria-label, 'Support') and contains(@class, 'mainMenuItem')]")
    public WebElement supportButton;

    public Boolean checkIfMainPageButtonIsClickable() {
        LOG.info("Кнопка перехода на главную страницу активна");
        return mainPageButton.isEnabled();
    }

    public void downloadSecondButtonClick() {
        LOG.info("Средняя кнопка Download кликабельна");
        secondButtonDownloadRider.click();
    }

    public void dockerButtonClick() {
        LOG.info("Кнопка Docker кликабельна");
        dockerButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        LOG.infoWithScreenshot("Переключились на новую вкладку с Docker");
    }

    public void pricingButtonClick() {
        LOG.info("Кнопка Pricing кликабельна");
        pricingButton.click();
    }

    public void comingButtonClick() {
        LOG.info("Кнопка Coming in 2024.3 кликабельна");
        comingIn2024Button.click();
    }

    public void whatsNewButtonClick() {
        LOG.info("Кнопка Whats new кликабельна");
        whatsNewButton.click();
    }

    public void featuresButtonClick() {
        LOG.info("Кнопка Features кликабельна");
        featuresButton.click();
    }

    public void learnButtonClick() {
        LOG.info("Кнопка Learn кликабельна");
        learnButton.click();
    }

    public void socialButtonClick() {
        LOG.info("Кнопка Social кликабельна");
        socialButton.click();
    }

    public void fastTrackedButtonClick() {
        LOG.info("Кнопка Fast Tracked кликабельна");
        fastTrackedButton.click();
    }

    public String fastTrackedTextView() {
        LOG.info("Проверка наличия названия Fast Tracked");
        String value = fastTrackedText.getText();
        LOG.info("Получен текст: '" + value + "'");
        return value;
    }

    public void gameDevButtonClick() {
        LOG.info("Кнопка Game Dev кликабельна");
        gameDevButton.click();
    }

    public String gameDevTextView() {
        LOG.info("Проверка наличия названия Game Dev");
        String value = gameDevText.getText();
        LOG.info("Получен текст: '" + value + "'");
        return value;
    }

    public void nextLevelButtonClick() {
        LOG.info("Кнопка Next-Level кликабельна");
        nextLevelButton.click();
    }

    public String nextLevelTextView() {
        LOG.info("Проверка наличия названия Next-Level");
        String value = nextLevelText.getText();
        LOG.info("Получен текст: '" + value + "'");
        return value;
    }

    public void reSharperCButtonClick() {
        LOG.info("Кнопка ReSharper C++ кликабельна");
        reSharperCButton.click();
    }

    public void dotCoverButtonClick() {
        LOG.info("Кнопка dotCover кликабельна");
        dotCoverButton.click();
    }

    public void dotTraceButtonClick() {
        LOG.info("Кнопка dotTrace кликабельна");
        dotTraceButton.click();
    }

    public void dotMemoryButtonClick() {
        LOG.info("Кнопка dotMemory кликабельна");
        dotMemoryButton.click();
    }

    public void dotPeekButtonClick() {
        LOG.info("Кнопка dotPeek кликабельна");
        dotPeekButton.click();
    }

    public Boolean checkTeamToolsButtonIsClickable() {
        LOG.info("Кнопка перехода на страницу Team Tools активна");
        return teamToolsButton.isEnabled();
    }

    public Boolean checkSupportButtonIsClickable() {
        LOG.info("Кнопка перехода на страницу Support активна");
        return supportButton.isEnabled();
    }

    public Boolean checkEducationButtonIsClickable() {
        LOG.info("Кнопка перехода на страницу Education активна");
        return educationButton.isEnabled();
    }

    public RiderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

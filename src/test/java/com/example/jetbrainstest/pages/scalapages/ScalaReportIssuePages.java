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

public class ScalaReportIssuePages {
    private WebDriverWait wait;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ScalaPage.class));
    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),'Report Issue')]")
    private WebElement reportIssueButton;
    @FindBy(xpath = "//*[contains(text(),'Reviews')]")
    private WebElement reviews;
    @FindBy(xpath = "//*[contains(text(),'Learn more')]")
    private WebElement learnMore;

    public Boolean checkIfReportIssueIsClickable() {
        LOG.infoWithScreenshot("Проверка наличия кнопки Report Issue");
        reviews.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(reportIssueButton));
        return reportIssueButton.isDisplayed();
    }

    public void checkYouTrackclickable() {
        LOG.infoWithScreenshot("Проверка открытия страницы You Track, после нажатия кнопки Report Issue");
        reviews.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(reportIssueButton));
        reportIssueButton.click();
    }

    public String getTabUrl() {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return getCurrentUrl();
    }

    public String getCurrentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public boolean learnMoreclick() {
        reviews.click();
        return learnMore.isEnabled();
    }

    public ScalaReportIssuePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(12));

    }

}

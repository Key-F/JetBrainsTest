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
    private WebElement ReportIssueButton;
    @FindBy(xpath = "//*[contains(text(),'Reviews')]")
    private WebElement Reviews;
    @FindBy(xpath = "//*[contains(text(),'Learn more')]")
    private WebElement LearnMore;

    public Boolean checkIfReportIssueIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки Report Issue");
        Reviews.click();
        return ReportIssueButton.isEnabled();
    }
    public void checkYouTrackclickable() {
        LOG.infoWithScreenshot("Проверка открытия страницы You Track, после нажатия кнопки Report Issue");
        Reviews.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(ReportIssueButton));
        ReportIssueButton.click();

    }
    public boolean learnMoreclick(){
        Reviews.click();
        return LearnMore.isEnabled();
    }

    public ScalaReportIssuePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));

    }

}

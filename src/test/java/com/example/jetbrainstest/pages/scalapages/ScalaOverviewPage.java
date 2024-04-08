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

public class ScalaOverviewPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ScalaPage.class));
    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[contains(text(),'Overview')]")
    private WebElement Overview;
    @FindBy(xpath = "//*[contains(text(),'Scala bundle')]")
    private WebElement scalaBundle;
    @FindBy(xpath = "//*[contains(text(),'Report Plugin')]")
    private WebElement reportPlugin;
    @FindBy(xpath = "//*[contains(text(),'Show All Reviews')]")
    private WebElement showAllRevies;
    @FindBy(xpath = "//*[contains(text(),'Blog')]")
    private WebElement blog;
    @FindBy(xpath = "//*[contains(text(),'Twitter')]")
    private WebElement twitter;


    public boolean clickOverview() {
        LOG.infoWithScreenshot("Проверка активности кнопки Overview");
       Overview.click();
        return Overview.isEnabled();
    }
    public boolean clickScalaBundle() {
        LOG.infoWithScreenshot("Проверка активности кнопки Scala Bundle");
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(scalaBundle));
        return scalaBundle.isEnabled();
    }
    public String checkScalaBundleclickable() {
        LOG.infoWithScreenshot("Проверка открытия страницы Scala Bundle, после нажатия кнопки Scala Bundle");
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(scalaBundle));
        scalaBundle.click();
        return driver.getCurrentUrl();
    }

    public boolean clickReportPlugin() {
        LOG.infoWithScreenshot("Проверка активности кнопки Report Plugin");
        Overview.click();
        return reportPlugin.isEnabled();
    }
    public String checkReportPlugineclickable() {
        LOG.infoWithScreenshot("Проверка открытия страницы Log in to Marketplace, после нажатия кнопки Report Plugin");
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(reportPlugin));
        reportPlugin.click();
        return driver.getCurrentUrl();
    }

    public boolean findButtonShowAllReviews() {
        LOG.info("Проверка наличия кнопки 'Show All Reviews'");
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(showAllRevies));
        return showAllRevies.isDisplayed();
    }
    public String clickShowAllReviews() {
        LOG.infoWithScreenshot("Переход на страницу Reviews, после нажатия кнопки Show All Reviews");
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(showAllRevies));
        showAllRevies.click();
        return driver.getCurrentUrl();
    }
    public boolean findUrlBlog(){
        LOG.infoWithScreenshot("Наличие ссылки Blog");
        Overview.click();
        return blog.isDisplayed();
    }
    public void checkBlog(){
        Overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(blog));
        blog.click();
    }
    public boolean findUrlTwitter(){
        LOG.infoWithScreenshot("Наличие ссылки Twitter");
        Overview.click();
        return twitter.isDisplayed();
    }

    public ScalaOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }

}

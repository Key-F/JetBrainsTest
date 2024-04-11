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
    private WebElement overview;
    @FindBy(xpath = "//*[contains(text(),'Scala bundle')]")
    private WebElement scalaBundle;
    @FindBy(xpath = "//*[contains(text(),'Report Plugin')]")
    private WebElement reportPlugin;
    @FindBy(xpath = "//*[contains(text(),'Show All Reviews')]")
    private WebElement showAllRevies;
    @FindBy(css = "a.rs-link_hardness_average.rs-link_mode_clear.rs-link_theme_light")
    private WebElement blog;
    @FindBy(xpath = "//*[contains(text(),'Twitter')]")
    private WebElement twitter;
    @FindBy(xpath = "//*[contains(text(),'Source Code')]")
    private WebElement sourceCode;
    @FindBy(css = "div.wt-col-4")
    private WebElement pluginVersions;

    public boolean clickOverview() {
        LOG.infoWithScreenshot("Проверка наличия кнопки Overview");
        overview.click();
        return overview.isDisplayed();
    }

    public boolean clickPluginVersions() {
        LOG.infoWithScreenshot("Проверка активности кнопки Plugin Versions");
        overview.click();
        return pluginVersions.isDisplayed();
    }

    public boolean clickScalaBundle() {
        LOG.infoWithScreenshot("Проверка наличия кнопки Scala bundle");
        overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(scalaBundle));
        return scalaBundle.isEnabled();
    }

    public String checkScalaBundleclickable() {
        LOG.infoWithScreenshot("Проверка открытия страницы Scala bundle, после нажатия кнопки Scala Bundle");
        overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(scalaBundle));
        scalaBundle.click();
        return driver.getCurrentUrl();
    }

    public boolean clickReportPlugin() {
        LOG.infoWithScreenshot("Проверка активности кнопки Report Plugin");
        overview.click();
        return reportPlugin.isEnabled();
    }


    public boolean findButtonShowAllReviews() {
        LOG.info("Проверка наличия кнопки 'Show All Reviews'");
        overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(showAllRevies));
        return showAllRevies.isDisplayed();
    }

    public String clickShowAllReviews() {
        LOG.infoWithScreenshot("Переход на страницу Reviews, после нажатия кнопки Show All Reviews");
        overview.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(showAllRevies));
        showAllRevies.click();
        return driver.getCurrentUrl();
    }

    public boolean findUrlBlog() {
        LOG.infoWithScreenshot("Наличие кнопки - ссылки Blog");
        overview.click();
        return blog.isDisplayed();
    }

    public boolean findUrlTwitter() {
        LOG.infoWithScreenshot("Наличие кнопки - ссылки Twitter");
        overview.click();
        return twitter.isDisplayed();
    }

    public boolean checkSourceCodeClickable() {
        LOG.infoWithScreenshot("Активность кнопки - ссылки Source Code");
        overview.click();
        return sourceCode.isEnabled();
    }

    public ScalaOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
    }

}

package com.example.jetbrainstest.pages.decompilerpage;


import com.example.jetbrainstest.AllureLoggerCustom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


// page_url = https://www.jetbrains.com/decompiler/
public class DecompilerPage {

    private final AllureLoggerCustom LOG = new AllureLoggerCustom(LoggerFactory.getLogger(DecompilerPage.class));
    WebDriver driver;


    @FindBy(css = ".decompiler-header-section__button.wt-offset-top-32")
    private WebElement upDotPeekButton;

    @FindBy(xpath = "//span[normalize-space()='Download']")
    private WebElement downloadButton;

    @FindBy(xpath = "//a[@href='/decompiler/whatsnew/']")
    private WebElement whatNewButton;

    @FindBy(xpath = "//a[normalize-space()='Features']")
    private WebElement featuresButton;

    @FindBy(xpath = "//a[normalize-space()='Docs & Demos']")
    private WebElement docsDemosButton;

    @FindBy(xpath = "//a[contains(@class, 'rs-link_mode_rock') and contains(@class, 'wt-col-inline')]")
    private WebElement partOfdotUltimateButton;

    @FindBy(xpath = "//a[normalize-space()='More features']")
    private WebElement moreFeaturesButton;

    @FindBy(xpath = "//h3[normalize-space()='ReSharper']")
    private WebElement reSharperButton;

    @FindBy(xpath = "//h3[normalize-space()='Rider']")
    private WebElement riderButton;

    @FindBy(xpath = "//p[normalize-space()='The Visual Studio extension for C++ developers']")
    private WebElement reSharperCButton;

    @FindBy(xpath = "//h3[normalize-space()='dotTrace']")
    private WebElement dotTraceButton;

    @FindBy(xpath = "//h3[normalize-space()='dotMemory']")
    private WebElement dotMemoryButton;

    @FindBy(xpath = "//p[normalize-space()='.NET unit test runner and code coverage tool']")
    private WebElement dotCoverButton;

    @FindBy(xpath = "//*[@id=\"overview-content\"]/section[3]/div/div[2]/a")
    private WebElement downDotPeekButton;

    @FindBy(xpath = "//a[normalize-space()='Learn more']")
    private WebElement learnMoreButton;

    @FindBy(xpath = "//a[normalize-space()='Community forum']")
    private WebElement communityForumButton;

    @FindBy(xpath = "//a[normalize-space()='Bug and issue tracker']")
    private WebElement bugAndIssueTrackerButton;

    @FindBy(xpath = "//a[normalize-space()='.NET Tools blog']")
    private WebElement netToolsBlogButton;

    @FindBy(xpath = "//a[normalize-space()='@dotpeek on X']")
    private WebElement dotpeekOnXButton;

    @FindBy(xpath = "//a[normalize-space()='IntelliJ IDEA']")
    private WebElement intellijIdeaButton;

    @FindBy(xpath = "//a[normalize-space()='Privacy & Security']")
    private WebElement privacyAndSecurityButton;


    public boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки Download");
        return downloadButton.isEnabled();
    }

    public boolean getUpDotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'Get dotPeek'");
        return upDotPeekButton.isEnabled();
    }

    public boolean getWatSNewIsActive() {
        LOG.info("Проверка доступности кнопки 'What's New'");
        return whatNewButton.isEnabled();
    }

    public boolean getFeaturesIsActive() {
        LOG.info("Проверка доступности кнопки 'Features'");
        return featuresButton.isEnabled();
    }

    public boolean getDocsDemosIsActive() {
        LOG.info("Проверка доступности кнопки 'Docs & Demos'");
        return docsDemosButton.isEnabled();
    }

    public boolean getPartOfdotUltimateIsActive() {
        LOG.info("Проверка доступности кнопки 'part of dotUltimate'");
        return partOfdotUltimateButton.isEnabled();
    }

    public boolean getMoreFeaturesIsActive() {
        LOG.info("Проверка доступности кнопки 'MoreFeatures'");
        return moreFeaturesButton.isEnabled();
    }

    public boolean getReSharperIsActive() {
        LOG.info("Проверка доступности кнопки'ReSharper'");
        return reSharperButton.isEnabled();
    }

    public boolean getRiderIsActive() {
        LOG.info("Проверка доступности кнопки'Rider'");
        return riderButton.isEnabled();
    }

    public boolean getReSharperCIsActive() {
        LOG.info("Проверка доступности кнопки'ReSharperC++'");
        return reSharperCButton.isEnabled();
    }

    public boolean getDotTraceIsActive() {
        LOG.info("Проверка доступности кнопки 'dotTrace'");
        return dotTraceButton.isEnabled();
    }

    public boolean getDotMemoryIsActive() {
        LOG.info("Проверка доступности кнопки 'dotMemory'");
        return dotMemoryButton.isEnabled();
    }

    public boolean getDotCoverIsActive() {
        LOG.info("Проверка доступности кнопки 'dotCover'");
        return dotCoverButton.isEnabled();
    }

    public boolean getDownDotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'dotPeek'");
        return downDotPeekButton.isEnabled();
    }

    public boolean getLearnMoreIsActive() {
        LOG.info("Проверка доступности кнопки 'Learn more'");
        return learnMoreButton.isEnabled();
    }

    public boolean getCommunityForumIsActive() {
        LOG.info("Проверка доступности кнопки'Community forum'");
        return communityForumButton.isEnabled();
    }

    public boolean getBugAndIssueTrackerIsActive() {
        LOG.info("Проверка доступности кнопки 'Bug and issue tracker'");
        return bugAndIssueTrackerButton.isEnabled();
    }

    public boolean getNetToolsBlogIsActive() {
        LOG.info("Проверка доступности кнопки '.NET Tools blog'");
        return netToolsBlogButton.isEnabled();
    }

    public boolean getDotpeekOnXIsActive() {
        LOG.info("Проверка доступности кнопки 'Dotpeek on X'");
        return dotpeekOnXButton.isEnabled();
    }

    public boolean getIntellijIdeaIsActive() {
        LOG.info("Проверка доступности кнопки'IntelliJ IDEA'");
        return intellijIdeaButton.isEnabled();
    }

    public boolean getPrivacyAndSecurityIsActive() {
        LOG.info("Проверка доступности кнопки 'Privacy & Security'");
        return privacyAndSecurityButton.isEnabled();
    }

    public String privacyAndSecurityTransition() {
        LOG.info("Переход на страницу privacy-security");
        privacyAndSecurityButton.click();
        return driver.getCurrentUrl();
    }

    public String learnMoreButtonTransition() {
        LOG.info("Переход на страницу dotnet");
        learnMoreButton.click();
        return driver.getCurrentUrl();
    }


    public DecompilerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

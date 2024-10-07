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
    private WebElement DotPeekButton;

    @FindBy(xpath = "//span[normalize-space()='Download']")
    private WebElement downloadButton;

    @FindBy(xpath = "//a[@href='/decompiler/whatsnew/']")
    private WebElement WhatNewButton;

    @FindBy(xpath = "//a[normalize-space()='Features']")
    private WebElement FeaturesButton;

    @FindBy(xpath = "//a[normalize-space()='Docs & Demos']")
    private WebElement DocsDemosButton;

    @FindBy(xpath = "//a[contains(@class, 'rs-link_mode_rock') and contains(@class, 'wt-col-inline')]")
    private WebElement PartOfdotUltimateButton;

    @FindBy(xpath = "//a[normalize-space()='More features']")
    private WebElement MoreFeaturesButton;

    @FindBy(xpath = "//h3[normalize-space()='ReSharper']")
    private WebElement ReSharperButton;

    @FindBy(xpath = "//h3[normalize-space()='Rider']")
    private WebElement RiderButton;

    @FindBy(xpath = "//p[normalize-space()='The Visual Studio extension for C++ developers']")
    private WebElement ReSharperCButton;

    @FindBy(xpath = "//h3[normalize-space()='dotTrace']")
    private WebElement DotTraceButton;

    @FindBy(xpath = "//h3[normalize-space()='dotMemory']")
    private WebElement DotMemoryButton;

    @FindBy(xpath = "//p[normalize-space()='.NET unit test runner and code coverage tool']")
    private WebElement DotCoverButton;

    @FindBy(xpath = "//a[@data-focus-method='mouse']")
    private WebElement dotPeekButton;

    @FindBy(xpath = "//a[normalize-space()='Learn more']")
    private WebElement LearnMoreButton;

    @FindBy(xpath = "//a[normalize-space()='Community forum']")
    private WebElement CommunityForumButton;

    @FindBy(xpath = "//a[normalize-space()='Bug and issue tracker']")
    private WebElement BugAndIssueTrackerButton;

    @FindBy(xpath = "//a[normalize-space()='.NET Tools blog']")
    private WebElement NetToolsBlogButton;

    @FindBy(xpath = "//a[normalize-space()='@dotpeek on X']")
    private WebElement DotpeekOnXButton;

    @FindBy(xpath = "//a[normalize-space()='IntelliJ IDEA']")
    private WebElement IntellijIdeaButton;

    @FindBy(xpath = "//a[normalize-space()='Privacy & Security']")
    private WebElement PrivacyAndSecurityButton;


    public boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки Download");
        return downloadButton.isEnabled();
    }

    public boolean getDotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'Get dotPeek'");
        return DotPeekButton.isEnabled();
    }

    public boolean getWatSNewIsActive() {
        LOG.info("Проверка доступности кнопки 'What's New'");
        return WhatNewButton.isEnabled();
    }

    public boolean getFeaturesIsActive() {
        LOG.info("Проверка доступности кнопки 'Features'");
        return FeaturesButton.isEnabled();
    }

    public boolean getDocsDemosIsActive() {
        LOG.info("Проверка доступности кнопки 'Docs & Demos'");
        return DocsDemosButton.isEnabled();
    }

    public boolean getPartOfdotUltimateIsActive() {
        LOG.info("Проверка доступности кнопки 'part of dotUltimate'");
        return PartOfdotUltimateButton.isEnabled();
    }

    public boolean getMoreFeaturesIsActive() {
        LOG.info("Проверка доступности кнопки 'MoreFeatures'");
        return MoreFeaturesButton.isEnabled();
    }

    public boolean getReSharperIsActive() {
        LOG.info("Проверка доступности кнопки'ReSharper'");
        return ReSharperButton.isEnabled();
    }

    public boolean getRiderIsActive() {
        LOG.info("Проверка доступности кнопки'Rider'");
        return RiderButton.isEnabled();
    }

    public boolean getReSharperCIsActive() {
        LOG.info("Проверка доступности кнопки'ReSharperC++'");
        return ReSharperCButton.isEnabled();
    }

    public boolean getDotTraceIsActive() {
        LOG.info("Проверка доступности кнопки 'dotTrace'");
        return DotTraceButton.isEnabled();
    }

    public boolean getDotMemoryIsActive() {
        LOG.info("Проверка доступности кнопки 'dotMemory'");
        return DotMemoryButton.isEnabled();
    }

    public boolean getDotCoverIsActive() {
        LOG.info("Проверка доступности кнопки 'dotCover'");
        return DotCoverButton.isEnabled();
    }

    public boolean getdotPeekIsActive() {
        LOG.info("Проверка доступности кнопки 'dotPeek'");
        return dotPeekButton.isEnabled();
    }

    public boolean getLearnMoreIsActive() {
        LOG.info("Проверка доступности кнопки 'Learn more'");
        return LearnMoreButton.isEnabled();
    }

    public boolean getCommunityForumIsActive() {
        LOG.info("Проверка доступности кнопки'Community forum'");
        return CommunityForumButton.isEnabled();
    }

    public boolean getBugAndIssueTrackerIsActive() {
        LOG.info("Проверка доступности кнопки 'Bug and issue tracker'");
        return BugAndIssueTrackerButton.isEnabled();
    }

    public boolean getNetToolsBlogIsActive() {
        LOG.info("Проверка доступности кнопки '.NET Tools blog'");
        return NetToolsBlogButton.isEnabled();
    }

    public boolean getDotpeekOnXIsActive() {
        LOG.info("Проверка доступности кнопки 'Dotpeek on X'");
        return DotpeekOnXButton.isEnabled();
    }

    public boolean getIntellijIdeaIsActive() {
        LOG.info("Проверка доступности кнопки'IntelliJ IDEA'");
        return IntellijIdeaButton.isEnabled();
    }

    public boolean getPrivacyAndSecurityIsActive() {
        LOG.info("Проверка доступности кнопки 'Privacy & Security'");
        return PrivacyAndSecurityButton.isEnabled();
    }

    public String PrivacyAndSecurityTransition() {
        LOG.info("Переход на страницу privacy-security");
        PrivacyAndSecurityButton.click();
        return driver.getCurrentUrl();
    }

    public String LearnMoreButtonTransition() {
        LOG.info("Переход на страницу dotnet");
        LearnMoreButton.click();
        return driver.getCurrentUrl();
    }


    public DecompilerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

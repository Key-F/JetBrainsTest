package com.example.jetbrainstest.pages.dataspellpages;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.tests.BaseTest;
import com.example.jetbrainstest.tests.DataSpellTest;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSpellHelpResourcesPage {

    WebDriver driver;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DataSpellHelpResourcesPage.class));

    @FindBy(xpath = "(//li[@data-toc-scroll='Quick_Start_Guide']/a[text()='Get started'])[1]")
    private WebElement getStarted;

    @FindBy(css = "*[data-toc-scroll=\'6595fe77\']")
    private WebElement firstSteps;

    @FindBy(css = "*[data-toc-scroll='Feature_trainer']")
    private WebElement onboardingTour;


    public void clickGetStarted() {
        getStarted.click();
        LOG.infoWithScreenshot("Клик на GetStarted, раскрытие списка");
    }


    public void clickfFirstSteps() {
        firstSteps.click();
        LOG.infoWithScreenshot("Клик на FirstSteps, раскрытие списка");
    }


    public void clickOnboardingTour() {
        onboardingTour.click();
        LOG.infoWithScreenshot("Открытие страницы Onboarding Tour");
    }

    public DataSpellHelpResourcesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

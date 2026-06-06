package com.example.jetbrainstest.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JobsPage {

    private final Logger LOG = LoggerFactory.getLogger(JobsPage.class);

    WebDriver driver;

    @FindBy(css = "a[href='/careers/jobs/']")
    private WebElement findYourDreamJob;

    @Step("Проверка активности кнопки *Find*Your*Dream*Job*")
    public Boolean checkDream() {
        LOG.info("Проверка активности кнопки *Find*Your*Dream*Job*");
        return findYourDreamJob.isEnabled();
    }


    public JobsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

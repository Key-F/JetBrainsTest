package com.example.jetbrainstest.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// https://www.jetbrains.com/decompiler/

public class DotPeekPage {

    private final Logger LOG  = LoggerFactory.getLogger(DotPeekPage.class);

    WebDriver driver;

    @FindBy(css = "a[href='/decompiler/download/']")

    private WebElement downloadButton;

    public DotPeekPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Step("Проверка активности кнопки загрузки")
    public Boolean checkDownloadButtonIsClickable(){
        LOG.info("Проверка активности кнопки загрузки");
        return downloadButton.isEnabled();
    }

}

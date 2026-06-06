package com.example.jetbrainstest.pages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

// https://www.jetbrains.com/decompiler/

public class DotPeekPage {


    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(DotPeekPage.class));

    WebDriver driver;

    @FindBy(css = "a[href='/decompiler/download/']")

    private WebElement downloadButton;

    public DotPeekPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public Boolean checkDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка активности кнопки загрузки");
        return downloadButton.isEnabled();
    }

}

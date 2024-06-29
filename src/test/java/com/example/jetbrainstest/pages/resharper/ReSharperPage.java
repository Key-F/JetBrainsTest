package com.example.jetbrainstest.pages.resharper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://www.jetbrains.com/resharper/

public class ReSharperPage {

    private WebDriver driver;

    @FindBy(css = "a[href=\"/resharper/download/\"]")
    private WebElement downloadLink;

    @FindBy(css = "#consent\\/1472 > div:nth-child(4) > div > div > label > div > div > input")
    private WebElement emailField;

    public Boolean downloadButtonDisplay() {
        System.out.println("Проверка наличия кнопки Download");
        return downloadLink.isDisplayed();
    }

    public String checkEmailFieldPlaceholder() {
        System.out.println("Проверка верного placeholder в поле Email");
        return emailField.getAttribute("placeholder");
    }

    public ReSharperPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

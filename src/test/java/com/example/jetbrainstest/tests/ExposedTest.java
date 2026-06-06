package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.ExposedPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExposedTest extends BaseTest{

    private ExposedPage ExposedPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/exposed/");
        ExposedPage = new ExposedPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки Get Started")
    public void buttonCheck(){
        assertTrue(ExposedPage.checkIfDownloadButtonIsClickable(), "Кнопка Get Started не активна");
    }
}

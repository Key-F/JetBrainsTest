package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AzatsExtension;
import com.example.jetbrainstest.pages.RiderPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AzatsExtension.class)
public class RiderPageTest extends BaseTest {
    private RiderPage rp;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/rider/");
        rp = new RiderPage(getDriver());
    }

    @Test
    @DisplayName("Проверка кликабельности кнопки перехода на главную страницу")
    public void mainPageButtonIsClickable() {
        Assertions.assertTrue(rp.checkIfMainPageButtonIsClickable(), "Кнопка перехода на главную страницу не активна");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Download")
    public void secondDownloadButtonIsClickable() {
        rp.downloadSecondButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/download/#section=windows", currentUrl,
                "После клика на Download открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Docker")
    public void dockerButtonIsClickable() {
        rp.dockerButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/guide/dotnet/tutorials/docker-dotnet/", currentUrl,
                "После клика на Docker открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Pricing")
    public void pricingButtonIsClickable() {
        rp.pricingButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/buy/?section=personal&billing=yearly", currentUrl,
                "После клика на Pricing открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Coming in 2024.3")
    public void comingIn2024ButtonIsClickable() {
        rp.comingButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/nextversion/", currentUrl,
                "После клика на Coming in 2024.3 открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Whats New")
    public void whatsNewButtonIsClickable() {
        rp.whatsNewButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/whatsnew/", currentUrl,
                "После клика на Whats New открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Features")
    public void featuresButtonIsClickable() {
        rp.featuresButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/features/", currentUrl,
                "После клика на Features открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Learn")
    public void learnButtonIsClickable() {
        rp.learnButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/documentation/", currentUrl,
                "После клика на Features открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Social")
    public void socialButtonIsClickable() {
        rp.socialButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/rider/social/", currentUrl,
                "После клика на Features открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Fast Tracked")
    public void fastTrackedButtonIsClickable() {
        rp.fastTrackedButtonClick();
        String expectedText = "Fast-tracked development";
        Assertions.assertEquals(expectedText, rp.fastTrackedTextView(), "Ожидаемый текст не найден на странице");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Game Dev")
    public void gameDevButtonIsClickable() {
        rp.gameDevButtonClick();
        String expectedText = "Game dev power-up";
        Assertions.assertEquals(expectedText, rp.gameDevTextView(), "Ожидаемый текст не найден на странице");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку Next-Level")
    public void nextLevelButtonIsClickable() {
        rp.nextLevelButtonClick();
        String expectedText = "Next-level debugging";
        Assertions.assertEquals(expectedText, rp.nextLevelTextView(), "Ожидаемый текст не найден на странице");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку ReSharper C++")
    public void reSharperCButtonIsClickable() {
        rp.reSharperCButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/resharper-cpp/", currentUrl,
                "После клика на ReSharper C++ открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку dotCover")
    public void dotCoverButtonIsClickable() {
        rp.dotCoverButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/dotcover/", currentUrl,
                "После клика на ReSharper C++ открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку dotMemory")
    public void dotMemoryButtonIsClickable() {
        rp.dotMemoryButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/dotmemory/", currentUrl,
                "После клика на ReSharper C++ открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку dotTrace")
    public void dotTraceButtonIsClickable() {
        rp.dotTraceButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/profiler/", currentUrl,
                "После клика на ReSharper C++ открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка нажатия на кнопку dotPeek")
    public void dotPeekButtonIsClickable() {
        rp.dotPeekButtonClick();
        String currentUrl = getDriver().getCurrentUrl();
        Assertions.assertEquals("https://www.jetbrains.com/decompiler/", currentUrl,
                "После клика на ReSharper C++ открывает не ту страницу");
    }

    @Test
    @DisplayName("Проверка кликабельности кнопки перехода на страницу Team Tools")
    public void teamToolsButtonIsClickable() {
        Assertions.assertTrue(rp.checkTeamToolsButtonIsClickable(), "Кнопка перехода на страницу Team Tools не активна");
    }

    @Test
    @DisplayName("Проверка кликабельности кнопки перехода на страницу Support")
    public void supportButtonIsClickable() {
        Assertions.assertTrue(rp.checkSupportButtonIsClickable(), "Кнопка перехода на страницу Support не активна");
    }

    @Test
    @DisplayName("Проверка кликабельности кнопки перехода на страницу Education")
    public void educationButtonIsClickable() {
        Assertions.assertTrue(rp.checkEducationButtonIsClickable(), "Кнопка перехода на страницу Education не активна");
    }
}

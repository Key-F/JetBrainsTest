package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureLogger;
import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.MetaProgrammingSystemPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class MetaProgrammingSystemTest extends BaseTest {

    private MetaProgrammingSystemPage MetaProgrammingSystem;
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemTest.class));

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/mps/");
        MetaProgrammingSystem = new MetaProgrammingSystemPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка Download активна")
    @Tag("MpsPageButton")
    public void downloadButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfDownloadButtonIsClickable(), "Кнопка Download не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка смены языка активна")
    @Tag("MpsPageButton")
    public void languageButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfLanguageButtonIsClickable(), "Кнопка смены языка не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка EAP Program активна")
    @Tag("MpsPageButton")
    public void EapProgramButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfEapProgramButtonIsClickable(), "Кнопка EAP Program не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Whats New активна")
    @Tag("MpsPageButton")
    public void WhatsNewButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfWhatsNewButtonIsClickable(), "Кнопка Whats New не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка How Its Works активна")
    @Tag("MpsPageButton")
    public void HowItsWorksButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfHowItsWorksButtonIsClickable(), "Кнопка How Its Works не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Learn Mps активна")
    @Tag("MpsPageButton")
    public void LearnMpsButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfLearnMpsButtonIsClickable(), "Кнопка Learn Mps не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Services активна")
    @Tag("MpsPageButton")
    public void ServicesButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfServicesButtonIsClickable(), "Кнопка Services не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Search активна")
    @Tag("MpsPageButton")
    public void SearchButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfSearchButtonIsClickable(), "Кнопка search не активна");
    }

    @Test
    @DisplayName("Проверка поисковой строки")
    @Tag("MpsPageButton")
    public void SearchFieldCheck() {
        MetaProgrammingSystem.checkSendTextIntoSearchField("Selenium");
        String expectedUrl = "https://www.jetbrains.com/mps/?q=Selenium&s=full";
        String actualUrl = MetaProgrammingSystem.getCurentUrlSearchPage();
        assertEquals(expectedUrl, actualUrl, "URL не совпадают");
    }

    @Test
    @DisplayName("Проверка, что кнопка FAQ активна")
    @Tag("MpsDownloadPageButton")
    public void FaqButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfFaqButtonIsClickable(), "Кнопка FAQ не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Profile активна")
    @Tag("MpsDownloadPageButton")
    public void ProfileButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfProfileButtonIsClickable(), "Кнопка Profile не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Migration Guide активна")
    @Tag("MpsDownloadPageButton")
    public void MigrationGuideButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfMigrationGuideButtonIsClickable(), "Кнопка Migration Guide не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Get Started активна")
    @Tag("Another")
    public void GetStartedButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfGetStartedButtonIsClickable(), "Кнопка Get Started не активна");
    }

    @Test
    @DisplayName("Проверка, что кнопка Store активна")
    @Tag("MpsDownloadPageButton")
    public void StoreButtonCheck() {
        assertTrue(MetaProgrammingSystem.checkIfStoreButtonIsClickable(), "Кнопка Store не активна");
    }

    @Test
    @DisplayName("Проверка текста Download MPS")
    @Tag("AnotherCheck")
    public void textOnDownloadPage() {
        String expectedText = "Download MPS";
        String actualText = MetaProgrammingSystem.checkTextOnDownloadPage();
        assertEquals(expectedText, actualText, "Текст не совпадают");
    }

    @Test
    @DisplayName("Проверка текста на главной странице")
    @Tag("AnotherCheck")
    public void textOnMainPage() {
        String expectedText = "Meta Programming System";
        String actualText = MetaProgrammingSystem.checkTextOnMainPage();
        assertEquals(expectedText, actualText, "Текст не совпадают");
    }

    @Test
    @DisplayName("Проверка текста MPS на главной странице")
    @Tag("AnotherCheck")
    public void mpsTextOnMainPage() {
        String expectedText = "MPS";
        String actualText = MetaProgrammingSystem.checkMpsTextOnMainPage();
        assertEquals(expectedText, actualText, "Текст не совпадают");
    }

    @Test
    @DisplayName("Проверка, что перешли на экран загрузки")
    @Tag("AnotherCheck")
    public void trackToDownloadPage() {
        String expectedUrl = "https://www.jetbrains.com/mps/download/#section=windows";
        String actualUrl = MetaProgrammingSystem.getCurentUrlDownloadPage();
        assertEquals(expectedUrl, actualUrl, "URL не совпадают");
    }

    @Test
    @DisplayName("Проверка, что перешли на экран Learn MPS")
    @Tag("AnotherCheck")
    public void trackToLearnMpsPage() {
        String expectedUrl = "https://www.jetbrains.com/mps/learn/";
        String actualUrl = MetaProgrammingSystem.getCurentUrlLearnMpsPage();
        assertEquals(expectedUrl, actualUrl, "URL не совпадают");
    }

    @Test
    @DisplayName("Проверка, что перешли на экран Get Started")
    @Tag("AnotherCheck")
    public void trackGetStartedPage() {
        String expectedUrl = "https://www.jetbrains.com/help/mps/fast-track-to-mps.html";
        String actualUrl = MetaProgrammingSystem.getCurentUrlGetStartedPage();
        assertEquals(expectedUrl, actualUrl, "URL не совпадают");
    }
}
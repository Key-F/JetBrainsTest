package com.example.jetbrainstest.tests;


import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.pages.JetBrainsAiPages.DeveloperEcosystemPage;
import com.example.jetbrainstest.pages.JetBrainsAiPages.JetBrainsAiPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class JetBrainsAiTest extends BaseTest {
    private JetBrainsAiPage JetBrainsAiPage;
    private DeveloperEcosystemPage DeveloperEcosystemPage;

    @BeforeEach
    @Override
    public void setUp(){
        super.setUp();
        getDriver().get("https://www.jetbrains.com/ai/");
        JetBrainsAiPage = new JetBrainsAiPage(getDriver());
        DeveloperEcosystemPage = new DeveloperEcosystemPage(getDriver());
        JetBrainsAiPage.acceptCookiesBanner();
    }

    @ParameterizedTest(name = "#{index} - Проверка перехода на ресурс {0}")
    @CsvSource({"idea", "pycharm", "phpstorm", "resharper", "fleet", "ides"})
    @DisplayName("Проверка перехода по кнопкам в подразделе 'Supported development environments'")
    public void sourceLinkTest(String sourceName){
        JetBrainsAiPage.clickButton(sourceName);
        String sourceLink = "https://www.jetbrains.com/" + sourceName + "/";
        assertEquals(sourceLink, getDriver().getCurrentUrl(), "Ссылки не совпадают");
    }

    @ParameterizedTest(name = "#{index} - Проверка отображения кнопки ресурса {0}")
    @CsvSource({"idea", "pycharm", "phpstorm", "resharper", "fleet", "ides"})
    @DisplayName("Проверка отображения кнопок в подразделе 'Supported development environments'")
    public void sourceLinkClickableTest(String sourceName){
        WebElement button = getDriver().findElement(By.cssSelector(JetBrainsAiPage.getButtonCssSelector(sourceName)));
        assertTrue(button.isEnabled(),  "Кнопка не отображается");
    }

    @Test
    @DisplayName("Проверка ввода адреса электронной почты в поле email")
    public void emailFieldTest(){
        String email = "Test@Test.com";
        JetBrainsAiPage.enterEmail(email);

        assertEquals(email, JetBrainsAiPage.getEmailFieldValue(), "Значения не совпадают");
    }

    @Test
    @DisplayName("Проверка доступности кнопки 'AI' в выпадающем списке на странице Developer Ecosystem")
    public void aiButtonEnableTest(){
        JetBrainsAiPage.developerEcosystemButtonClick();
        DeveloperEcosystemPage.dropdownButtonClick();
        assertTrue(DeveloperEcosystemPage.aiDropdownButtonEnable(), "Кнопка недоступна");
    }
}

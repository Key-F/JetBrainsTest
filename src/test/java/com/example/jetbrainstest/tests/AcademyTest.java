package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.AllureAttachmentsManager;
import com.example.jetbrainstest.pages.AcademyPage;
import com.example.jetbrainstest.pages.spacepages.SpacePage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcademyTest extends BaseTest {
    private AcademyPage academyPage;

    @BeforeEach
    @Override
    @Step("Тест ссылок на странице Академии: ")
    public void setUp(){
        super.setUp();
        driver.get("https://www.jetbrains.com/academy/");
        academyPage = new AcademyPage(driver);
    }

    @Test
    @DisplayName("Проверка перехода на страницу контактов после клика https://www.jetbrains.com/support/sales/#email-sales")
    public void buttonCheck(){
        academyPage.clickContactButton();
        assertEquals("https://www.jetbrains.com/support/sales/#email-sales", academyPage.getCurrUrl(),"Не перешли на https://www.jetbrains.com/support/sales/#email-sales");
    }

    @Test
    @DisplayName("Клик по кнопке Science")
    public void clickScienceButton(){
        academyPage.clickScienceButton();
        assertEquals("https://hyperskill.org/tracks?category=13", academyPage.getCurrUrl(),"Не перешли на https://www.jetbrains.com/support/sales/#email-sales");
    }

}

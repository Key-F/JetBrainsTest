package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.AcademyPage;
import com.example.jetbrainstest.pages.spacepages.SpacePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcademyTest extends BaseTest {
    private AcademyPage academyPage;

    @BeforeEach
    @Override
    public void setUp(){
        super.setUp();
        getDriver().get("https://www.jetbrains.com/academy/");
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
        assertEquals("https://hyperskill.org/tracks?category=13&_gl=1%2a18bev8e%2a_ga%2aMTM4NjU2MjcwMC4xNzA0MDA2MTAx%2a_ga_9J976DJZ68%2aMTcwNTQyMzQ5Ni42LjEuMTcwNTQyMzQ5OS41Ny4wLjA.&_ga=2.244982476.854174962.1705414024-1386562700.1704006101", academyPage.getCurrUrl(),"Не перешли на https://www.jetbrains.com/support/sales/#email-sales");
    }

}

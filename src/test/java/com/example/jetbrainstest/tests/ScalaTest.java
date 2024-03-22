package com.example.jetbrainstest.tests;


import com.example.jetbrainstest.AllureAttachmentsManager;
import com.example.jetbrainstest.MyExtension;

import com.example.jetbrainstest.pages.scalapages.ScalaPage;
import com.example.jetbrainstest.pages.scalapages.ScalaReportIssuePages;
import com.example.jetbrainstest.tests.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class ScalaTest extends BaseTest { private ScalaPage scalaPage;
    private ScalaReportIssuePages scalaReportIssuePages;
    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://plugins.jetbrains.com/plugin/1347-scala");
        scalaPage = new ScalaPage(getDriver());
        scalaReportIssuePages = new ScalaReportIssuePages(getDriver());
    }
    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    public void buttonCheck() {
        AllureAttachmentsManager.screenshot();
        assertTrue(scalaPage.checkIfGetButtonIsClickable(), "Кнопка скачивания не активна");
    }
    @Test
    @DisplayName("Проверка наличия кнопки Show More")
    public void scalaPagefindButtonShowMore() {
        assertTrue(scalaPage.findButtonShowMore(), "кнопка" + "Show More" + "не найдена");
    }
    @Test
    @DisplayName("Проверка,что кнопка Report Issue активна" )
    public void reportIssueCheck(){
        assertTrue(scalaReportIssuePages.checkIfReportIssueIsClickable(), "Кнопка скачивания не активна");
    }
    @Test
    @DisplayName("Проверка открытие страницы You Track после нажатия кнопки Report Issue" )
    public void checkYouTrack(){
        scalaReportIssuePages.checkYouTrackclickable();
        assertEquals("https://youtrack.jetbrains.com/issues/SCL?_ga=2.35819043.281500600.1711354315-2092669425.1710917040&_gl=1*1g9cn5g*_ga*MjA5MjY2OTQyNS4xNzEwOTE3MDQw*_ga_9J976DJZ68*MTcxMTM1NDMxNC4zLjEuMTcxMTM1NjcwNi42MC4wLjA.",
                getDriver().getCurrentUrl(), "Не верная ссылка");
    }
    @Test
    @DisplayName("Проверка,что ссылка Learn More активна")
    public void  checkLearnMore(){
        assertTrue(scalaReportIssuePages.learnMoreclick(), "Кнопка Learn More не активна");
    }
    @Test
    @DisplayName("Наличие кнопки nightly")
    public void scalaPageFindBattonNightly(){
        assertTrue(scalaPage.findButtonNightly(), "кнопка" + "nightly" + "не найдена");

    }
}



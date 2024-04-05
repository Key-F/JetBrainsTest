package com.example.jetbrainstest.tests;


import com.example.jetbrainstest.AllureAttachmentsManager;
import com.example.jetbrainstest.MyExtension;

import com.example.jetbrainstest.pages.scalapages.ScalaJetBrainsMarketplacePage;
import com.example.jetbrainstest.pages.scalapages.ScalaPage;
import com.example.jetbrainstest.pages.scalapages.ScalaReportIssuePages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyExtension.class)
public class ScalaTest extends BaseTest {
    private ScalaPage scalaPage;
    private ScalaReportIssuePages scalaReportIssuePages;
    private ScalaJetBrainsMarketplacePage scalaJetBrainsMarketplacePage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://plugins.jetbrains.com/plugin/1347-scala");
        scalaPage = new ScalaPage(getDriver());
        scalaReportIssuePages = new ScalaReportIssuePages(getDriver());
        scalaJetBrainsMarketplacePage = new ScalaJetBrainsMarketplacePage(getDriver());
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
    @DisplayName("Проверка,что кнопка Report Issue активна")
    public void reportIssueCheck() {
        assertTrue(scalaReportIssuePages.checkIfReportIssueIsClickable(), "Кнопка скачивания не активна");
    }

    @Test
    @DisplayName("Проверка открытие страницы You Track после нажатия кнопки Report Issue")
    public void checkYouTrack() {
        scalaReportIssuePages.checkYouTrackclickable();
        assertTrue(scalaReportIssuePages.getTabUrl(driver).contains("https://youtrack.jetbrains.com/issues/SCL?_gl=1*"), "Не верная ссылка");
    }

    @Test
    @DisplayName("Проверка,что ссылка Learn More активна")
    public void checkLearnMore() {
        assertTrue(scalaReportIssuePages.learnMoreclick(), "Кнопка Learn More не активна");
    }

    @Test
    @DisplayName("Проверка перехода на страницу JetBrains Marketplace при нажатие кнопки Learn More")
    public void openingJetBrainsMarketplace() {
        scalaReportIssuePages.checklearnMoreclick();
        assertTrue(scalaReportIssuePages.getTabUrl(driver).contains("https://plugins.jetbrains.com/docs/marketplace/reviews-policy.html"), "Не верная ссылка");
    }

    @Test
    @DisplayName("Проверка активности кнопки Start Selling Plugins")
    public void checkStartSellingPlugins() {
        assertTrue(scalaJetBrainsMarketplacePage.clickStartSellingPlugins(), "Кнопка Start Selling Plugins не активна");
    }

    @Test
    @DisplayName("Наличие кнопки nightly")
    public void scalaPageFindBattonNightly() {
        assertTrue(scalaPage.findButtonNightly(), "кнопка" + "nightly" + "не найдена");

    }

}



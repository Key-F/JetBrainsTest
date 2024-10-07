package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtensions;
import com.example.jetbrainstest.pages.decompilerpage.DecompilerPage;
import com.example.jetbrainstest.pages.decompilerpage.DecompilerTeamsPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyExtensions.class)
public class DecompilerTest extends BaseTest {

    private DecompilerPage decompilerPage;
    private DecompilerTeamsPage decompilerTeamsPage;

    @BeforeEach
    @Override
    @Step("Переход в раздел dotPeek")
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/decompiler/");
        decompilerPage = new DecompilerPage(getDriver());
        decompilerTeamsPage = new DecompilerTeamsPage(getDriver());
    }

    @Test
    @DisplayName("Проверка активности кнопки Get dotPeek")
    public void DotPeekIsActive() {
        Assertions.assertTrue(decompilerPage.getDotPeekIsActive(), "Get dotPeek кнопка не активна");
    }

    @Test
    @DisplayName("Проверка что кнопка скачивание активвна")
    public void buttonCheck() {
        Assertions.assertTrue(decompilerPage.checkIfDownloadButtonIsClickable(), "Download кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки What's New")
    public void WatSNewIsActive() {
        Assertions.assertTrue(decompilerPage.getWatSNewIsActive(), "What's New кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Features")
    public void FeaturesIsActive() {
        Assertions.assertTrue(decompilerPage.getFeaturesIsActive(), "Features кнопка не активна");

    }

    @Test
    @DisplayName("Проверка активности кнопки Docs & Demos")
    public void DocsDemosIsActive() {
        Assertions.assertTrue(decompilerPage.getDocsDemosIsActive(), "Docs & Demos кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки part of dotUltimate")
    public void PartOfDotUltimateIsActive() {
        Assertions.assertTrue(decompilerPage.getPartOfdotUltimateIsActive(), "part of dotUltimate кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки MoreFeatures")
    public void MoreFeaturesIsActive() {
        Assertions.assertTrue(decompilerPage.getMoreFeaturesIsActive(), "More features кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки ReSharper")
    public void ReSharperIsActive() {
        Assertions.assertTrue(decompilerPage.getReSharperIsActive(), "ReSharper кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Rider")
    public void RiderIsActive() {
        Assertions.assertTrue(decompilerPage.getRiderIsActive(), "Rider кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки ReSharper C++")
    public void ReSharperCsIsActive() {
        Assertions.assertTrue(decompilerPage.getReSharperCIsActive(), "ReSharper C++ кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotTrace")
    public void DotTraceIsActive() {
        Assertions.assertTrue(decompilerPage.getDotTraceIsActive(), "dotTrace кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotMemory")
    public void DotMemoryIsActive() {
        Assertions.assertTrue(decompilerPage.getDotMemoryIsActive(), "dotMemory кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotCover")
    public void DotCoverIsActive() {
        Assertions.assertTrue(decompilerPage.getDotCoverIsActive(), "dotCover кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotPeek")
    public void dotPeekIsActive() {
        Assertions.assertTrue(decompilerPage.getdotPeekIsActive(), "dotPeek кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void LearnMoreIsActive() {
        Assertions.assertTrue(decompilerPage.getLearnMoreIsActive(), "Learn more кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Community forum")
    public void CommunityForumIsActive() {
        Assertions.assertTrue(decompilerPage.getCommunityForumIsActive(), "Community forum кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Bug and issue tracker")
    public void BugAndIssueTrackerIsActive() {
        Assertions.assertTrue(decompilerPage.getBugAndIssueTrackerIsActive(), "Bug and issue tracker кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки .NET Tools blog")
    public void NetToolsBlogIsActive() {
        Assertions.assertTrue(decompilerPage.getNetToolsBlogIsActive(), ".NET Tools blog кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки @dotpeek on X")
    public void DotpeekOnXIsActive() {
        Assertions.assertTrue(decompilerPage.getDotpeekOnXIsActive(), "@dotpeek on X кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки IntelliJ IDEA")
    public void IntelliJIDEAIsActive() {
        Assertions.assertTrue(decompilerPage.getIntellijIdeaIsActive(), "IntelliJ IDEA кнопка не активна");

    }

    @Test
    @DisplayName("Проверка активности кнопки Privacy & Security")
    public void PrivacyAndSecurityIsActive() {
        Assertions.assertTrue(decompilerPage.getPrivacyAndSecurityIsActive(), "Privacy & Security кнопка не активна");
    }

    @Test
    @DisplayName("Открытие страницы Learn more")
    public void LearnMoreTest() {
        String expectedUrl = "https://www.jetbrains.com/dotnet/";
        String actualUrl = decompilerPage.LearnMoreButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел store")
    public void storeTeamTest() {
        String expectedUrl = "https://www.jetbrains.com/store/?section=commercial&billing=yearly";
        decompilerPage.LearnMoreButtonTransition();
        String actualUrl = decompilerTeamsPage.BuyDotUltimateTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Privacy & Security")
    public void PrivacyAndSecurityTest() {
        String expectedUrl = "https://www.jetbrains.com/privacy-security/";
        String actualUrl = decompilerPage.PrivacyAndSecurityTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Our Commitment")
    public void OurCommitmentTest() {
        String expectedUrl = "https://www.jetbrains.com/company/commitment/";
        decompilerPage.PrivacyAndSecurityTransition();
        String actualUrl = decompilerTeamsPage.OurCommitmentTeamTeansition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

}
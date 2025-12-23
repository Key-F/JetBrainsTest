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
    public void upDotPeekIsActive() {
        Assertions.assertTrue(decompilerPage.getUpDotPeekIsActive(), "Get dotPeek кнопка не активна");
    }

    @Test
    @DisplayName("Проверка что кнопка скачивание активвна")
    public void downloadCheck() {
        Assertions.assertTrue(decompilerPage.checkIfDownloadButtonIsClickable(), "Download кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки What's New")
    public void watSNewIsActive() {
        Assertions.assertTrue(decompilerPage.getWatSNewIsActive(), "What's New кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Features")
    public void featuresIsActive() {
        Assertions.assertTrue(decompilerPage.getFeaturesIsActive(), "Features кнопка не активна");

    }

    @Test
    @DisplayName("Проверка активности кнопки Docs & Demos")
    public void docsDemosIsActive() {
        Assertions.assertTrue(decompilerPage.getDocsDemosIsActive(), "Docs & Demos кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки part of dotUltimate")
    public void partOfDotUltimateIsActive() {
        Assertions.assertTrue(decompilerPage.getPartOfdotUltimateIsActive(), "part of dotUltimate кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки MoreFeatures")
    public void moreFeaturesIsActive() {
        Assertions.assertTrue(decompilerPage.getMoreFeaturesIsActive(), "More features кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки ReSharper")
    public void reSharperIsActive() {
        Assertions.assertTrue(decompilerPage.getReSharperIsActive(), "ReSharper кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Rider")
    public void riderIsActive() {
        Assertions.assertTrue(decompilerPage.getRiderIsActive(), "Rider кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки ReSharper C++")
    public void reSharperCsIsActive() {
        Assertions.assertTrue(decompilerPage.getReSharperCIsActive(), "ReSharper C++ кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotTrace")
    public void dotTraceIsActive() {
        Assertions.assertTrue(decompilerPage.getDotTraceIsActive(), "dotTrace кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotMemory")
    public void dotMemoryIsActive() {
        Assertions.assertTrue(decompilerPage.getDotMemoryIsActive(), "dotMemory кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotCover")
    public void dotCoverIsActive() {
        Assertions.assertTrue(decompilerPage.getDotCoverIsActive(), "dotCover кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки dotPeek")
    public void downDotPeekIsActive() {
        Assertions.assertTrue(decompilerPage.getDownDotPeekIsActive(), "dotPeek кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Learn more")
    public void learnMoreIsActive() {
        Assertions.assertTrue(decompilerPage.getLearnMoreIsActive(), "Learn more кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Community forum")
    public void communityForumIsActive() {
        Assertions.assertTrue(decompilerPage.getCommunityForumIsActive(), "Community forum кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки Bug and issue tracker")
    public void bugAndIssueTrackerIsActive() {
        Assertions.assertTrue(decompilerPage.getBugAndIssueTrackerIsActive(), "Bug and issue tracker кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки .NET Tools blog")
    public void netToolsBlogIsActive() {
        Assertions.assertTrue(decompilerPage.getNetToolsBlogIsActive(), ".NET Tools blog кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки @dotpeek on X")
    public void dotpeekOnXIsActive() {
        Assertions.assertTrue(decompilerPage.getDotpeekOnXIsActive(), "@dotpeek on X кнопка не активна");
    }

    @Test
    @DisplayName("Проверка активности кнопки IntelliJ IDEA")
    public void intelliJIDEAIsActive() {
        Assertions.assertTrue(decompilerPage.getIntellijIdeaIsActive(), "IntelliJ IDEA кнопка не активна");

    }

    @Test
    @DisplayName("Проверка активности кнопки Privacy & Security")
    public void privacyAndSecurityIsActive() {
        Assertions.assertTrue(decompilerPage.getPrivacyAndSecurityIsActive(), "Privacy & Security кнопка не активна");
    }

    @Test
    @DisplayName("Открытие страницы Learn more")
    public void learnMoreTest() {
        String expectedUrl = "https://www.jetbrains.com/dotnet/";
        String actualUrl = decompilerPage.learnMoreButtonTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел store")
    public void storeTeamTest() {
        String expectedUrl = "https://www.jetbrains.com/store/?section=commercial&billing=yearly";
        decompilerPage.learnMoreButtonTransition();
        String actualUrl = decompilerTeamsPage.BuyDotUltimateTeamTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Открытие страницы Privacy & Security")
    public void privacyAndSecurityTest() {
        String expectedUrl = "https://www.jetbrains.com/privacy-security/";
        String actualUrl = decompilerPage.privacyAndSecurityTransition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

    @Test
    @DisplayName("Проверка перехода в раздел Our Commitment")
    public void ourCommitmentTest() {
        String expectedUrl = "https://www.jetbrains.com/company/commitment/";
        decompilerPage.privacyAndSecurityTransition();
        String actualUrl = decompilerTeamsPage.OurCommitmentTeamTeansition();
        assertEquals(expectedUrl, actualUrl, "Итоговый URL не соответствует ожидаемому");
    }

}
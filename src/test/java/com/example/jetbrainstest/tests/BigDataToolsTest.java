package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.MyExtension;
import com.example.jetbrainstest.MyOwnExtension;
import com.example.jetbrainstest.pages.BigDataToolsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MyOwnExtension.class)

public class BigDataToolsTest extends BaseTest {
    private BigDataToolsPage BigDataToolsPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://plugins.jetbrains.com/plugin/12494-big-data-tools");
        BigDataToolsPage = new BigDataToolsPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка скачивания активна")
    public void buttonCheck() {
        assertTrue(BigDataToolsPage.checkIfGetButtonIsClickable(), "Кнопка скачивания не активна");
    }

    @Test
    @DisplayName("Проверка скачивания конкретного дистрибьютива")
    public void versionDownload() {
        BigDataToolsPage.clickOnGetButton();
        BigDataToolsPage.clickOnVersionButton();
    }
}

package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.BigDataToolsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
}

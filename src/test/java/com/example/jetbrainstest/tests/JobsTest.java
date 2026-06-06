package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.JobsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JobsTest extends BaseTest {

    private JobsPage JobsPage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/careers/apply/");
        JobsPage = new JobsPage(getDriver());
    }

    @Test
    @DisplayName("Проверка, что кнопка *Find*Your*Dream*Job* активна")
    public void buttonCheck() {
        assertTrue(JobsPage.checkDream(), "Кнопка не активна");
    }
}

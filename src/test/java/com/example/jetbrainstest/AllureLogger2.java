package com.example.jetbrainstest;

import io.qameta.allure.Step;
import org.slf4j.Logger;

public class AllureLogger2 {
    private Logger logger;

    public AllureLogger2(Logger logger) {
        this.logger = logger;
    }

    @Step
    public void info(String logText) {
        logger.info(logText);
    }

}

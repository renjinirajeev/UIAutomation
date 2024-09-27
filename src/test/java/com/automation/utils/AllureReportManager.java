package com.automation.utils;

import io.cucumber.java.sk.Tak;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class AllureReportManager {


    public static void attachScreenShotInAllure() {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenSht = ts.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot", new ByteArrayInputStream(screenSht));
    }

    public static void log(String message) {
        Allure.addAttachment("log", message);
    }
}


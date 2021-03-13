package com.study.rozetka.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.study.rozetka.pages.utils.Waiter;

import java.io.UnsupportedEncodingException;

import static java.nio.charset.StandardCharsets.UTF_8;

public abstract class BasePage {

    protected ChromeDriver driver;
    private String pageUrl;
    private String pageTitle;

    public BasePage(ChromeDriver driver, String pageUrl, String pageTitle) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.pageTitle = pageTitle;
    }

    public void openPageAndCheckValidTitle() throws UnsupportedEncodingException {
        driver.get(pageUrl);
        String title = driver.getTitle();
        byte[] ptext = title.getBytes("ISO_8859_1");
        String value = new String(ptext, UTF_8);
        Assert.assertEquals(value, pageTitle);
    }

    public void clickElement(By by, long timeOutInSeconds) {
        Waiter.wait(driver, timeOutInSeconds);
        findElementBy(by).click();
    }

    public WebElement findElementBy(By by) {
        return driver.findElement(by);
    }
}

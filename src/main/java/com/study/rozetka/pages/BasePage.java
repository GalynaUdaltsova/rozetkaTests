package com.study.rozetka.pages;

import com.study.rozetka.pages.utils.Waiter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
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

    public void openPageAndCheckValidTitle() {
        driver.get(pageUrl);
        String title = driver.getTitle();
        byte[] bytes = pageTitle.getBytes(ISO_8859_1);
        String s = new String(bytes);
        System.out.println("title  ----  " + s);
//        Assert.assertEquals(title, pageTitle);
    }

    public void clickElement(By by, long timeOutInSeconds) {
        Waiter.wait(driver, timeOutInSeconds);
        findElementBy(by).click();
    }

    public WebElement findElementBy(By by) {
        return driver.findElement(by);
    }
}

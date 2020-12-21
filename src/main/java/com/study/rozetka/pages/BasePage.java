package com.study.rozetka.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.study.rozetka.pages.utils.Waiter;

public abstract class BasePage {

    protected ChromeDriver driver;
    private String pageUrl;
    private String pageTitle;

    public BasePage(ChromeDriver driver, String pageUrl, String pageTitle) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.pageTitle = pageTitle;
    }

    public void openPage() {
        driver.get(pageUrl);
    }

    public void isPageTitleValid() {
        String title = driver.getTitle();
        Assert.assertEquals(title, pageTitle);
    }

    public void clickElement(By by, long timeOutInSeconds) {
        Waiter.wait(driver, timeOutInSeconds);
        findElementBy(by).click();
    }

    public WebElement findElementBy(By by) {
        return driver.findElement(by);
    }
}

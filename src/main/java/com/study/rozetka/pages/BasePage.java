package com.study.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected ChromeDriver driver;
    private String pageUrl;
    private String pageTitle;

    public BasePage(ChromeDriver driver, String pageUrl, String pageTitle) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.pageTitle = pageTitle;
    }

    public void open() {
        driver.get(pageUrl);
    }

    public boolean isPageValid() {
        String title = driver.getTitle();
        if (pageTitle.equals(title)) {
            return true;
        } else {
            System.out.println("Page title is wrong, \nexpected: " + pageTitle + "\nactual: " + title);
            return false;
        }
    }

    public void clickElementByAndWait(By by, long timeOutInSeconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSeconds);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElementBy(by).click();
    }

    public WebElement findElementBy(By by) {
        return driver.findElement(by);
    }
}

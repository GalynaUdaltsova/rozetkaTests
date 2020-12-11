package com.study.rozetka.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSearch extends BaseTest {

    @Test
    public void search() {
        driver.get("https://rozetka.com.ua/");

        String title = driver.getTitle();
        Assert.assertEquals("Интернет-магазин ROZETKA™: официальный сайт самого популярного " +
                "онлайн-гипермаркета в Украине", title);

//        WebElement search = driver.findElementByName("search");
        WebElement search = driver.findElement(By.xpath("//input[@class='search-form__input " +
                "ng-untouched ng-pristine ng-valid']"));
        search.clear();
        search.sendKeys("IPhone 11");

        WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button " +
                "button_color_green button_size_medium search-form__submit']")));

        driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium " +
                "search-form__submit']")).click();
        driver.findElement(By.xpath("//span[text()='Мобильные телефоны']")).click();
//        driver.findElement(By.xpath("//input[@id='Готов к отправке'}")).click();




//        List<WebElement> elements = driver.findElementsByClassName("kjdbv");
////        elements.stream().sorted(Comparator.comparingInt(el ->((WebElement) el).findElement(By.xpath("jhgefg")).))


    }

}

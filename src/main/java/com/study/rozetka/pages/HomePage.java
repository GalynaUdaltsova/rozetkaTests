package com.study.rozetka.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage{

    public static final String HOME_PAGE_URL = "https://rozetka.com.ua/";
    public static final String HOME_PAGE_TITLE = "Интернет-магазин ROZETKA™: официальный сайт самого популярного " +
            "онлайн-гипермаркета в Украине";

    public HomePage(ChromeDriver driver) {
        super(driver, HOME_PAGE_URL, HOME_PAGE_TITLE);
    }
}

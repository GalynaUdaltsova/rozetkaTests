package com.study.rozetka.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProfilePage extends BasePage {

    private static final String PROFILE_PAGE_URL = "https://rozetka.com.ua/cabinet/personal-information/";
    private static final String PROFILE_PAGE_TITLE = "ROZETKA — Особисті дані | Особистий кабінет";

    public ProfilePage(ChromeDriver driver) {
        super(driver, PROFILE_PAGE_URL, PROFILE_PAGE_TITLE);
    }
}

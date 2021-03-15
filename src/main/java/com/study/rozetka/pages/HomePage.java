package com.study.rozetka.pages;

import com.study.rozetka.pages.utils.Element;
import com.study.rozetka.pages.utils.XpathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "https://rozetka.com.ua/ua/";
    private static final String HOME_PAGE_TITLE = "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого " +
            "онлайн-гіпермаркету в Україні";

    private static final String SEARCH_FORM_CLASS = "search-form__submit";
    private static final String SEARCH_FORM_INPUT_CLASS = "search-form__input";
    private static final String SUBMIT_LOGIN_CLASS = "auth-modal__submit";
    private static final String FILTER_MOBILE_PHONE_TEXT = "Мобільні телефони";
    private static final String FILTER_READY_TO_SHIP = "Готовий до відправлення";
    private static final String SORTING_FROM_EXPENSIVE_TO_CHEAP_TEXT = " Від дорогих до дешевих ";
    private static final String ENTER_LOGIN_ID = "auth_email";
    private static final String ENTER_PASSWORD_ID = "auth_pass";
    private static final String HEADER_BUTTON = "header__button";

    private static final int DEFAULT_TIMEOUT = 10;

    public HomePage(ChromeDriver driver) {
        super(driver, HOME_PAGE_URL, HOME_PAGE_TITLE);
    }

    public void executeLogin(String email, String password) {
        clickElement(By.xpath(String.format("//rz-user/button[contains(@class,'%s')]", HEADER_BUTTON)), DEFAULT_TIMEOUT);
        findElementBy(By.xpath(String.format("//*[@id='%s']", ENTER_LOGIN_ID))).sendKeys(email);
        findElementBy(By.xpath(String.format("//*[@id='%s']", ENTER_PASSWORD_ID))).sendKeys(password);
        clickElement(By.xpath(String.format("//button[contains(@class, '%s')]", SUBMIT_LOGIN_CLASS)), DEFAULT_TIMEOUT);
    }

    public void checkFilterMobilePhone(String productItem) {
        findElementBy(XpathUtils.buildContainsClass(Element.INPUT, SEARCH_FORM_INPUT_CLASS)).sendKeys(productItem);
        clickElement(XpathUtils.buildContainsClass(Element.BUTTON, SEARCH_FORM_CLASS), DEFAULT_TIMEOUT);
        clickElement(XpathUtils.buildTextEquals(Element.SPAN, FILTER_MOBILE_PHONE_TEXT), DEFAULT_TIMEOUT);
    }

    public void checkFilterReadyToShip() {
        clickElement(XpathUtils.buildContainsText(Element.LABEL, FILTER_READY_TO_SHIP), DEFAULT_TIMEOUT);
    }

    public void checkSortingFromExpensiveToCheap(String productItem) {
        findElementBy(XpathUtils.buildContainsClass(Element.INPUT, SEARCH_FORM_INPUT_CLASS)).sendKeys(productItem);
        clickElement(XpathUtils.buildContainsClass(Element.BUTTON, SEARCH_FORM_CLASS), DEFAULT_TIMEOUT);
        clickElement(XpathUtils.buildTextEquals(Element.OPTION, SORTING_FROM_EXPENSIVE_TO_CHEAP_TEXT), DEFAULT_TIMEOUT);
    }
}

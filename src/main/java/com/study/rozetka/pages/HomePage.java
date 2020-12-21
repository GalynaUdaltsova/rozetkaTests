package com.study.rozetka.pages;

import com.study.rozetka.pages.utils.Element;
import com.study.rozetka.pages.utils.XpathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    public static final String HOME_PAGE_URL = "https://rozetka.com.ua/";
    public static final String HOME_PAGE_TITLE = "Интернет-магазин ROZETKA™: официальный сайт самого популярного " +
            "онлайн-гипермаркета в Украине";

    public static final String SEARCH_FORM_CLASS = "search-form__submit";
    public static final String SEARCH_FORM_INPUT_CLASS = "search-form__input";
    public static final String SUBMIT_LOGIN_CLASS = "auth-modal__submit";
    public static final String FILTER_MOBILE_PHONE_TEXT = "Мобильные телефоны";
    public static final String FILTER_READY_TO_SHIP = "Готов к отправке";
    public static final String SORTING_FROM_EXPENSIVE_TO_CHEAP_TEXT = " От дорогих к дешевым ";
    public static final String ENTER_LOGIN_ID = "auth_email";
    public static final String ENTER_PASSWORD_ID = "auth_pass";
    public static final String BUTTON_LOGIN = "header-topline__user-link button--link";

    private static final int DEFAULT_TIMEOUT = 10;

    public HomePage(ChromeDriver driver) {
        super(driver, HOME_PAGE_URL, HOME_PAGE_TITLE);
    }

    public void executeLogin(String email, String password) {
        clickElement(XpathUtils.buildContainsClass(Element.BUTTON, BUTTON_LOGIN), DEFAULT_TIMEOUT);
        findElementBy(XpathUtils.buildIdLocator(ENTER_LOGIN_ID)).sendKeys(email);
        findElementBy(XpathUtils.buildIdLocator(ENTER_PASSWORD_ID)).sendKeys(password);
        clickElement(XpathUtils.buildContainsClass(Element.BUTTON, SUBMIT_LOGIN_CLASS), DEFAULT_TIMEOUT);
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

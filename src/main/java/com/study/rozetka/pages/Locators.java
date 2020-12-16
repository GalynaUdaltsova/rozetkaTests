package com.study.rozetka.pages;

import org.openqa.selenium.By;

public interface Locators {

    interface Homepage {
        By inputSearch = By.xpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
        By buttonSubmitSearch = By.xpath("//button[@class='button button_color_green button_size_medium " +
                "search-form__submit']");
        By inputItemInSearch = By.xpath("//span[text()='Мобильные телефоны']");
        By filterReadyToShip = By.xpath("//label[contains(text(),'Готов к отправке')]");
        By sortingFromExpensiveToCheap = By.xpath("//option[text()=' От дорогих к дешевым ']");
    }

    interface Login {
        By buttonLogInXPath = By.xpath("//button[@class='header-topline__user-link button--link']");
        By inputLogIn = By.xpath("//*[@id='auth_email']");
        By inputPassword = By.xpath("//*[@id='auth_pass']");
        By buttonSubmitLogIn = By.xpath("//button[@class='button button--large button--green auth-modal__submit']");
    }
}

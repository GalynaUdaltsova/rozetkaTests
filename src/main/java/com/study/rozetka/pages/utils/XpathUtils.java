package com.study.rozetka.pages.utils;

import org.openqa.selenium.By;

public class XpathUtils {

    public static By buildContainsClass(Element element, String clazz) {
        return By.xpath(String.format("//%s[contains(@class, '%s')]", element.getElementName(), clazz));
    }

    public static By buildContainsText(Element element, String text) {
        return By.xpath(String.format("//%s[contains(text(),'%s')]", element.getElementName(), text));
    }

    public static By buildTextEquals(Element element, String text) {
        return By.xpath(String.format("//%s[text()='%s']", element.getElementName(), text));
    }

    public static By buildIdLocator(String id) {
        return By.xpath(String.format("//*[@id='%s']", id));
    }
}

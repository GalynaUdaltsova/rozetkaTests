package com.study.rozetka.pages.utils;

public enum Element {

    BUTTON("button"), INPUT("input"), SPAN("span"), OPTION("option"),
    LABEL("label");

    private String elementName;

    Element(String elementName) {
        this.elementName = elementName;
    }

    public String getElementName() {
        return elementName;
    }
}

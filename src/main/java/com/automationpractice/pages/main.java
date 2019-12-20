package com.automationpractice.pages;

import org.openqa.selenium.By;

public class main extends AbstractPage {

    private final static String TAB_NAME = "//a[@data-toggle='tab' and text()='%s']";

    public main() {
        driver.get("http://automationpractice.com/index.php");
    }

    public void clickTab(String tabNme) {
        action.click(By.xpath(String.format(TAB_NAME, tabNme)));
    }
}

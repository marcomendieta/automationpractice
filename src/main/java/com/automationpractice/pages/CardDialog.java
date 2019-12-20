package com.automationpractice.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardDialog extends AbstractPage {

    @FindBy(xpath = "//span[@title='Continue shopping']")
    private WebElement continueShoppingButton;

    public Main clickContinueShopping() {
        action.click(continueShoppingButton);
        return new Main();
    }
}

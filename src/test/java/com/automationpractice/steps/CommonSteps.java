package com.automationpractice.steps;

import com.automationpractice.pages.main;
import cucumber.api.java.en.Given;

public class CommonSteps {

    @Given("I open automation practice")
    public void openAutomationPractice() {
        main signin = new main();
    }

    @Given("I click tab {string}")
    public void iSignInAsUserAnd(String tabNme) {
        main signin = new main();
        signin.clickTab(tabNme);
    }


}

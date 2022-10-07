package com.gemini.generic.testStep;

import com.gemini.generic.MobileAction;
import com.gemini.generic.locators.Locators;
import com.gemini.reporting.GemTestReporter;
import com.gemini.reporting.STATUS;
import io.cucumber.core.options.Constants;
import io.cucumber.java.en.Given;

public class Steps {

    @Given("launch the application and login using {string} and {string}")
    public void launch_the_application_and_login_using_and(String username, String password) {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_login, "login");
        MobileAction.typeText(Locators.input_username, username, "username");
        MobileAction.typeText(Locators.input_password, password, "password");
        MobileAction.click(Locators.btn_login, "login");
    }

    @Given("select catalog option")
    public void select_catalog_option() {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_catalog, "catalog");
    }

    @Given("navigate to products page")
    public void navigate_to_products_page() {
        MobileAction.waitSec(2);
        String title = MobileAction.getElementText(Locators.label_productTitle);
        if (title.equals("Products")) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = " + "Products"
                    + "<BR>Actual = " + title, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = " + "Products"
                    + "<BR>Actual = " + title, STATUS.FAIL, MobileAction.takeSnapShot());
        }

    }
    @Given("logout the user")
    public void logout_the_user() {
        MobileAction.click(Locators.btn_menu, "menu-button");
        MobileAction.click(Locators.list_logout, "logout");
        MobileAction.click(Locators.btn_logoutConfirm, "logout confirm");
        String confirm = MobileAction.getElementText(Locators.btn_logoutConfirmMsg);
        if (confirm.equals("You are successfully logged out.")) {
            GemTestReporter.addTestStep("Verifying Title", "Pass - Expected = "
                    + "You are successfully logged out." + "<BR>Actual = " + confirm, STATUS.PASS, MobileAction.takeSnapShot());
        } else {
            GemTestReporter.addTestStep("Verifying Title", "Fail - Expected = "
                    + "You are successfully logged out." + "<BR>Actual = " + confirm, STATUS.FAIL, MobileAction.takeSnapShot());
        }
        MobileAction.click(Locators.btn_logoutClose, "logout close");
    }

}

package com.solvd.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class LoginBaseScreen extends AbstractMobileScreenBase {

    public LoginBaseScreen(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUserName(String userName);

    public abstract void typePassword(String password);

    public abstract void clickLoginButton();
}

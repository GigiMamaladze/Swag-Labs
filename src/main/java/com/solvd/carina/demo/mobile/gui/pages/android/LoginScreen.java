package com.solvd.carina.demo.mobile.gui.pages.android;

import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginBaseScreen.class)
public class LoginScreen extends LoginBaseScreen {

    @FindBy(id = "nameET")
    private ExtendedWebElement userNameTextField;

    @FindBy(id = "passwordET")
    private ExtendedWebElement passwordTextField;

    @FindBy(id = "loginBtn")
    private ExtendedWebElement loginButton;

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isScreenOpened() {
        return loginButton.isElementPresent(3);
    }

    @Override
    public void typeUserName(String userName) {
        userNameTextField.type(userName);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }
}

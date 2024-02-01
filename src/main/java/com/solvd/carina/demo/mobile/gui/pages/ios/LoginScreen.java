package com.solvd.carina.demo.mobile.gui.pages.ios;

import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginBaseScreen.class)
public class LoginScreen extends LoginBaseScreen {

    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeTextField'")
    private ExtendedWebElement userNameTextField;

    @ExtendedFindBy(iosPredicate = "type == 'XCUIElementTypeSecureTextField'")
    private ExtendedWebElement passwordTextField;

    @ExtendedFindBy(iosPredicate = "name == 'Login' AND type == 'XCUIElementTypeButton'")
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

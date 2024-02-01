package com.solvd.carina.demo.mobile.gui.pages.android.components;

import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import com.solvd.carina.demo.mobile.gui.pages.common.components.NavigationBaseMenu;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NavigationBaseMenu.class)
public class NavigationMenu extends NavigationBaseMenu {

    @FindBy(xpath = "//*[@text= 'Log In']")
    private ExtendedWebElement logInButton;

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginBaseScreen openLogInScreen() {
        logInButton.click();
        return initPage(LoginBaseScreen.class);
    }
}

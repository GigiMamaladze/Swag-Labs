package com.solvd.carina.demo.mobile.gui.pages.ios.componenets;

import com.solvd.carina.demo.mobile.gui.pages.common.LoginBaseScreen;
import com.solvd.carina.demo.mobile.gui.pages.common.components.NavigationBaseMenu;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NavigationBaseMenu.class)
public class NavigationMenu extends NavigationBaseMenu {

    @ExtendedFindBy(iosPredicate = "name == 'LogOut-menu-item'")
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

package com.solvd.carina.demo.mobile.gui.pages.ios.componenets;

import com.solvd.carina.demo.mobile.gui.pages.common.CartScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.MainMenuBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.NavigationBaseMenu;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MainMenuBase.class)
public class MainMenu extends MainMenuBase {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeButton[`name == 'More-tab-item'`]")
    private ExtendedWebElement navigationMenuIcon;

    @ExtendedFindBy(iosPredicate = "name == 'Cart-tab-item'")
    private ExtendedWebElement cartIcon;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public NavigationBaseMenu getNavigationMenu() {
        navigationMenuIcon.click();
        return initPage(NavigationBaseMenu.class);
    }

    @Override
    public CartScreenBase openCartPage() {
        cartIcon.click();
        return initPage(CartScreenBase.class);
    }
}

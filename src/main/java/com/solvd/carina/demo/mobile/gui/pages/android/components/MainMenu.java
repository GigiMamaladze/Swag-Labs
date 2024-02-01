package com.solvd.carina.demo.mobile.gui.pages.android.components;

import com.solvd.carina.demo.mobile.gui.pages.common.CartScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.MainMenuBase;
import com.solvd.carina.demo.mobile.gui.pages.common.components.NavigationBaseMenu;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MainMenuBase.class)
public class MainMenu extends MainMenuBase {

    @FindBy(id = "menuIV")
    private ExtendedWebElement navigationMenuIcon;

    @FindBy(id = "cartRL")
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

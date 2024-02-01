package com.solvd.carina.demo.mobile.gui.pages.common.components;

import com.solvd.carina.demo.mobile.gui.pages.common.AbstractMobileScreenBase;
import com.solvd.carina.demo.mobile.gui.pages.common.CartScreenBase;
import org.openqa.selenium.WebDriver;

public abstract class MainMenuBase extends AbstractMobileScreenBase {

    public MainMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract NavigationBaseMenu getNavigationMenu();

    public abstract CartScreenBase openCartPage();
}

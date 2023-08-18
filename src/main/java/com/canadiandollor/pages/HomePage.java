package com.canadiandollor.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(id = "login-lang-select")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//a[@id='home1']")
    WebElement home;


    public void clickOnLogin() {
        clickOnElement(login);
        log.info("Clicking on login link.." );
        CustomListeners.test.log(Status.PASS,"click on login link");
    }

    public void clickOnHomeTab() {
        clickOnElement(home);
        log.info("Clicking on HomeTab.." );
        CustomListeners.test.log(Status.PASS,"click on Home Tab");
    }
}

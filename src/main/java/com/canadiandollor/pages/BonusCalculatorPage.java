package com.canadiandollor.pages;

import com.aventstack.extentreports.Status;
import com.canadiandollor.customlisteners.CustomListeners;
import com.canadiandollor.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BonusCalculatorPage  extends Utility {
    private static final Logger log = LogManager.getLogger(BonusCalculatorPage.class);
    @CacheLookup
    @FindBy(xpath = "//select[@name='day_of_the_week']")
    WebElement dayOfTheWeek;

    @CacheLookup
    @FindBy(xpath = "//select[@name='loyalty_level']")
    WebElement loyaltyLevel;

    public void selectDayOftheWeek(String weekDay) {


     selectByVisibleTextFromDropDown(dayOfTheWeek,weekDay);
     log.info("Select Day to Week" +dayOfTheWeek.toString());
        CustomListeners.test.log(Status.PASS,"Select Day");
    }

    public void selectLoyaltyLevel(String level) {
        selectByVisibleTextFromDropDown(loyaltyLevel,level);
        log.info("Select loyalty week" +loyaltyLevel.toString());
        CustomListeners.test.log(Status.PASS,"Select loyalty week");
    }


}

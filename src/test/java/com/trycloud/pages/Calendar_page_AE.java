package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar_page_AE extends BasePage{

    @FindBy(css = "div.trigger>button")
    public WebElement calendarViewMenu;


    @FindBy(css = "li.action.active>button")
    public WebElement activeCalendarView;
}

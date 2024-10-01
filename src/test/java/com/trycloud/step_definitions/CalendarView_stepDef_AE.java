package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Calendar_page_AE;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class CalendarView_stepDef_AE {
    Calendar_page_AE calendarPage = new Calendar_page_AE();

    @Given("user clicks {string} module")
    public void user_clicks_module(String moduleName) {
        calendarPage.navigateTo(moduleName);
        BrowserUtils.waitForPageToLoad(1);

    }
    @Given("user clicks calendar view menu button")
    public void user_clicks_calendar_view_menu_button() {
        calendarPage.calendarViewMenu.click();
    }
    @Given("user selects {string} from the menu")
    public void user_selects_from_the_menu(String calendarViewType) {
        Actions actions = new Actions(Driver.getDriver());

        //actions.moveToElement()
    }
    @Then("user sees calendar {string} view")
    public void user_sees_calendar_view(String string) {

    }
}

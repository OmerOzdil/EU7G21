package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    // here is the new method created
    //I am adding new method here
    // We are creating an conflict delibaretely

    @FindBy(css = "[id^='recurrence-repeat-view']")
    public WebElement repeat;

    @FindBy(css = "[id^='recurrence-repeats-view']")
    public WebElement repeatOptions;
    @FindBy(className = "select2-chosen")
    public WebElement selectedOwner;

    @FindBy(css = "input[id^='oro_calendar_event_form_title-']")
    public WebElement title;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    public WebElement startDate;
    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_end']")
    public WebElement endDate;
}

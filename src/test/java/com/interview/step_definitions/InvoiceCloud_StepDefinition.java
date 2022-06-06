package com.interview.step_definitions;

import com.interview.pages.AddRemoveElement;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class InvoiceCloud_StepDefinition {

    AddRemoveElement addRemoveElement = new AddRemoveElement();

    @Given("user is on this page")
    public void user_is_on_this_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user clicks on add element {string} times")
    public void userClicksOnAddElementTimes(String arg0) {
        int n= Integer.parseInt(arg0);

        for (int i = 0; i < n; i++) {
            addRemoveElement.addElementButton.click();
        }
    }

    @Then("verify new element was added {string} times")
    public void verifyNewElementWasAddedTimes(String arg0) {
        Assert.assertEquals(Integer.parseInt(arg0),addRemoveElement.addedElement.size());
    }
}


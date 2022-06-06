package com.interview.step_definitions;

import com.interview.pages.AddRemoveElement;
import com.interview.pages.ClearCapitalHomePage;
import com.interview.pages.ClearCapitalResources;
import com.interview.pages.Ebooks;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ClearCapitalEbook_StepDefinition {
    ClearCapitalHomePage clearCapitalHomePage = new ClearCapitalHomePage();
    Ebooks ebooks = new Ebooks();
    ClearCapitalResources clearCapitalResources = new ClearCapitalResources();
    AddRemoveElement addRemoveElement = new AddRemoveElement();

    @Given("user is on Clear Capital homepage")
    public void user_is_on_clear_capital_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("clearCapital"));
    }

    @When("user pointer hover over Resources")
    public void user_pointer_hover_over_resources() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(clearCapitalHomePage.resources).perform();
    }

    @When("user selects ebooks")
    public void user_selects_ebooks() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(clearCapitalHomePage.ebooks).click().perform();

    }

    @Then("validate that {string} is visible")
    public void validate_that_is_visible(String Keyword) {
        Assert.assertTrue(ebooks.getYourCopy.isDisplayed());
        System.out.println("Get your Copy is visible");


    }

    @When("user clicks on Resources")
    public void userClicksOnResources() {
        clearCapitalHomePage.resources.click();
    }

    @And("user clicks {string}")
    public void userClicksViewResources(String string) {

//        List<WebElement> viewButtons = Driver.getDriver().findElements(By.xpath("//a[@class='resource-link']"));
//        for (WebElement each : viewButtons) {
//            each.click();
//        break;
//
//        }
//        int n= Integer.parseInt(string);
        for (int i = 0; i < 4; i++) {
            clearCapitalResources.viewElements.get(1).click();


        }

        }



    @Then("validate that {string}is visible")
    public void validateThatResourceIsVisible(String string) {
        Assert.assertEquals(string, clearCapitalResources.mainHeader);

    }


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


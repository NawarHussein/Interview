package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddRemoveElement {
    public AddRemoveElement(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (css = "button[onclick='addElement()']")
    public WebElement addElementButton;

    @FindBy (css="button[class='added-manually']")
    public List<WebElement> addedElement;

}


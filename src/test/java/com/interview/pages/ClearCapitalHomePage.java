package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearCapitalHomePage {
    public ClearCapitalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#menu-item-7119 .sf-with-ul")
    public WebElement resources;

    @FindBy(xpath = "//a[.='ebooks']")
    public WebElement ebooks;

}

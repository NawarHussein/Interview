package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebooks {
    public Ebooks(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='GET YOUR COPY']")
   public WebElement getYourCopy;
}

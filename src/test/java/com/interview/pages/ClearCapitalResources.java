package com.interview.pages;

import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClearCapitalResources {
    public ClearCapitalResources(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy (id = "menu-item-7120")
    public WebElement newsroom;

    @FindBy(xpath = "(//a[@class='resource-link'])")
    public WebElement viewWhitePapersButton;

    @FindBy(xpath = "(//a[@class='resource-link'])[2]")
    public WebElement viewNewsRoom;

    @FindBy(xpath = "(//a[@class='resource-link'])[3]")
    public WebElement viewGlossary;

    @FindBy(xpath = "(//a[@class='resource-link'])")
    public List<WebElement> viewElements;


    @FindBy(xpath = "//h1")
    public WebElement mainHeader;

    }


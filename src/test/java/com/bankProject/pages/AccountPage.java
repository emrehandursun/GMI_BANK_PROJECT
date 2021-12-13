package com.bankProject.pages;

import com.bankProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    public  AccountPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountIcon;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Password']")
    public WebElement passwordInAccountIcon;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsIcon;

    @FindBy(xpath = "//span[text()='Manage Accounts']")
    public WebElement manageAccountsButton;

    @FindBy(xpath = "//span[text()='Accounts']")
    public WebElement accountsSayfasiYazisiElementi;

    @FindBy(xpath = "//span[text()='Balance']")
    public WebElement balanceSutunuYazisiElementi;

}

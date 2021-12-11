package com.bankProject.pages;

import com.bankProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage {

    public  PasswordPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordBox;

    @FindBy (id = "newPassword")
    public WebElement newPasswordBox;

    @FindBy (id = "confirmPassword")
    public WebElement confirmPasswordBox;

    @FindBy (xpath = "//div[text()='New password should be different from the current one.']")
    public WebElement newPasswordShouldBeDifferentFromTheCurrentOne;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthRed;

}

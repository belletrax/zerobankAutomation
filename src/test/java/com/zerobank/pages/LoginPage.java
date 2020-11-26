package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


            @FindBy(id = "signin_button")
            public WebElement signinButton;

            @FindBy(xpath = "//*[@id='user_login']")
            public WebElement username;

            @FindBy(xpath = "//*[@id='user_password']")
            public WebElement password;

            @FindBy(xpath = "//*[@id='login_form']/div[2]/input")
            public WebElement signin;

            public void login(String userName, String passWord){

                signinButton.click();
                username.sendKeys(userName);
                password.sendKeys(passWord);
                signin.click();

            }
}

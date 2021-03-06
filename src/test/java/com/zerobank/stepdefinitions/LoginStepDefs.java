package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriver driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
    }

    @When("the user enter valid credential")
    public void the_user_enter_valid_credential() {
        String  username =ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        new LoginPage().login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String  actualTitle=Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
    }


}

package com.vytrack.pages;

import com.vytrack.step_definitions.LoginStepDefs;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(), this);//static initElements method of PageFactory class
                                                          // for initializing web elements
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void loginWithUserType(String username) throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginStepDefs loginStepDefs = new LoginStepDefs();

        switch (username){
            case "driver":
                loginStepDefs.the_user_enters_the_driver_information();
                break;
            case "store manager":
                loginStepDefs.the_user_enters_the_store_manager_information();
                break;
            case "sales manager":
                loginStepDefs.the_user_enters_the_sales_manager_information();
                break;
        }


    }




}

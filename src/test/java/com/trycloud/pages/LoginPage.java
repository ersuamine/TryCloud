package com.trycloud.pages;


import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static   String message;

    @FindBy(css ="input#user" )
    public WebElement userLoginBox;

    @FindBy(css ="input#password" )
    public WebElement userPasswordBox;

    @FindBy(css ="input#submit-form" )
    public WebElement loginButton;

    public void login(){

        userLoginBox.sendKeys(ConfigurationReader.getProperty("username"));
        userPasswordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String username,String password){

        userLoginBox.sendKeys(username);
        userPasswordBox.sendKeys(password);
        loginButton.click();

    }

    public void login(String submitType){

        if (submitType.equals("loginButton")){
            //login method uses login button to enter
            login();
        }
        if (submitType.equals("enterKey")){
            userLoginBox.sendKeys(ConfigurationReader.getProperty("username"));
            userPasswordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
        }
    }



}

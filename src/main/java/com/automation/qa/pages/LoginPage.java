package com.automation.qa.pages;

import com.automation.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id="email")
    WebElement username;

    @FindBy(id ="passwd")
    WebElement userpswd;

    @FindBy(name = "submitLogin")
    WebElement loginBtn;

    @FindBy(id = "shop_name")
    WebElement signInText;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public String validateLoginPageTitle(){
        return signInText.getText();
    }

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        userpswd.sendKeys(pwd);
        loginBtn.click();


        return new HomePage();
    }


}

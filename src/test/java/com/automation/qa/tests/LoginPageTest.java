package com.automation.qa.tests;

import com.automation.qa.base.TestBase;
import com.automation.qa.pages.HomePage;
import com.automation.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        init();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(loginPage.validateLoginPageTitle(),"prestashop-automation");
        System.out.println(loginPage.validateLoginPageTitle());
    }

    @Test(priority = 2)
    public void loginTest(){
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("userpassword"));
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

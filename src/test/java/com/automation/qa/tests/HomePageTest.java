package com.automation.qa.tests;

import com.automation.qa.base.TestBase;
import com.automation.qa.pages.HomePage;
import com.automation.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        init();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("userpassword"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
        String homePageTitle =
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

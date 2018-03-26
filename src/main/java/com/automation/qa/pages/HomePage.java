package com.automation.qa.pages;

import com.automation.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//")

    @FindBy(id = "subtab-AdminParentOrders")
    WebElement ordersLink;

    @FindBy(id = "subtab-AdminParentCustomer")
    WebElement customersLink;

    @FindBy(id = "subtab-AdminParentCustomerThreads")
    WebElement customerThreadsLink;

    @FindBy(id = "subtab-AdminStats")
    WebElement adminStatsLink;

    @FindBy(id = "subtab-AdminParentShipping")
    WebElement shippingLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public OrdersPage clickOnOrdersLink (){
        ordersLink.click();
        return new OrdersPage();
    }
    public CustomersPage clickOnCustomersLink (){
        customersLink.click();
        return new CustomersPage();
    }
    public CustomerThreadsPage clickOnCustomerThreadsLink (){
        customerThreadsLink.click();
        return new CustomerThreadsPage();
    }
    public AdminStatsPage clickOnAdminStatsLink (){
        adminStatsLink.click();
        return new AdminStatsPage();
    }
    public ShippingPage clickOnShippingLink (){
        shippingLink.click();
        return new ShippingPage();
    }
}

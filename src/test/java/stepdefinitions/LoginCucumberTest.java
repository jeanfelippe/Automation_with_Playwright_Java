package stepdefinitions;
import org.junit.Assert;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCucumberTest {

    LoginPage login;
    HomePage home;
    Playwright playwright = Playwright.create();
    BrowserType firefox = playwright.firefox();
    Browser browser = firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();


    @Given("User launched SwagLabs application")
    public void setUp() {
        page.navigate("https://www.saucedemo.com/");
        home = new HomePage(page);
        login = new LoginPage(page);
    }
    @When("User verify the Page title")
    public void verifyPageTitle() {
        String title = login.verifyTitle();
        Assert.assertEquals(title, "Swag Labs");

    }
    //Login into the application
    @When("User logged in to the app using the username {string} and password {string}")
    public void loginIntoTheApplication(String username,String password ) {
        login.loginIntoApplication(username, password);
    }
    //Verify product name after login
    @Then("User verifies the product name {string}")
    public void verifyProductsName(String productname) {
        String productName = home.getProductName();
        Assert.assertEquals(productName, productname);

    }
    //Logout from application
    @Then("User logout from the application")
    public void logoutFromApplication() {
        login.logoutApplication();
    }

        //Error Message when insert incorrect credentials
//    @Then("error message is showed")
//    public void errorIncorrectLogin() {
//        login.errorIncorrectLogin();
//        }






}
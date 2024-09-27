package stepdefinitions;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.Then;

public class IncorrectLoginCucumberTest {

    LoginPage login;
    HomePage home;
    Playwright playwright = Playwright.create();
    BrowserType firefox = playwright.firefox();
    Browser browser = firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();

  //  login = new LoginPage(page);

//    //Error Message when insert incorrect credentials
//    @Then("error message is showed")
//    public void errorIncorrectLogin() {
//        login.errorIncorrectLogin();
//        }



}
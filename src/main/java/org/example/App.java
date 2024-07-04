package org.example;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {


        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.demoblaze.com/");

        page.locator("//a[contains(.,'Log in')]").click();

        page.locator("id=loginusername").fill("teste");
        page.locator("id=loginpassword").fill("123 ");



    }
}

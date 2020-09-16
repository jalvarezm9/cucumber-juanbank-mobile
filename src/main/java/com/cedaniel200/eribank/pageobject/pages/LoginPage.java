package com.cedaniel200.eribank.pageobject.pages;

import static com.cedaniel200.eribank.pageobject.driver.AppiumDriver.isAndroid;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    @FindBy(id = "com.experitest.ExperiBank:id/usernameTextField")
    private WebElement username;
    @FindBy(id = "com.experitest.ExperiBank:id/passwordTextField")
    private WebElement password;
    @FindBy(id = "com.experitest.ExperiBank:id/loginButton")
    private WebElement buttonLogin;

    private void enterValueOn(WebElement webElement, String value) {
        webElement.sendKeys(value);
    }

    private void clickOnLogin() {
        if(isAndroid()){
            System.out.println("La ejecución de esta sección solo le compete a el sistema operativo Android");
        }
        buttonLogin.click();
    }

    public void tryLogin(String username, String password) {

        enterValueOn(this.username, username);
        enterValueOn(this.password, password);
        clickOnLogin();
    }

}

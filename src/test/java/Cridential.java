import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Cridential extends Base {
    AndroidDriver<AndroidElement> driver=capabilities();

    public Cridential() throws MalformedURLException {
    }

    @Given("^user logs in through Login Window by using Username as \"(.*)\" and Password as \"(.*)\"$")
    public void Cridential(String userName, String password) throws MalformedURLException {
        driver.findElement(By.id("sdpd.login:id/editText")).sendKeys(userName);
        driver.findElement(By.id("sdpd.login:id/editText2")).sendKeys(password);
        driver.findElement(By.id("sdpd.login:id/button")).click();
    }
}

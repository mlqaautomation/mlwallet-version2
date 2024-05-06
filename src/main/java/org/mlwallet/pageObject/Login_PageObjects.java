package org.mlwallet.pageObject;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;

public class Login_PageObjects extends AppiumDriverManager{
    private final WebDriverWait wait = new WebDriverWait(AppiumDriverManager.getAndroidDriver(), Duration.ofSeconds(20));
    public WebElement mobileNum_editText(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id='967123']/child::android.view.ViewGroup/child::android.widget.EditText"))));
    }
    public WebElement login_btn(){
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//*[@resource-id='208465']"))));
    }
    public WebElement notifPermission_msg(){
        return driver.findElement(By.id("com.android.permissioncontroller:id/permission_message"));
    }
    public WebElement notifPermission_allowBtn(){
        return driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    }
    public WebElement otp_editText(int num){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId("94NMBE-"+num+""));
    }
    public WebElement walletPin_btn(int num){
        return driver.findElement(AppiumBy.ByAccessibilityId.accessibilityId(""+num+""));
    }
    public WebElement usableBalance_Text(){
        return driver.findElement(By.xpath("//android.widget.TextView[@resource-id='UTJ9TN']"));
    }
}

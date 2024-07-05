package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver.AppiumDriverManager;

public class LogoutObject extends AppiumDriverManager {
    public WebElement objHamburgerMenu(){
        return driver.findElement(By.xpath("//*[@text and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]]"));
    }
    public WebElement objHamburgerMenuForFullyVerifiedTier(){
        return driver.findElement(By.xpath("//*[@text and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]]]"));
    }
    public WebElement objLogoutBtn(){
        return driver.findElement(By.xpath("//*[@text='Logout']"));
    }
    public WebElement objTroubleSignIn(){
        return driver.findElement(By.xpath("//*[@text='Trouble signing in?']"));
    }
    public WebElement objChangeNumber(){
        return driver.findElement(By.xpath("//*[contains(@text,'Number')]"));
    }
    public WebElement objLogoOutPopupMsg(){
        return driver.findElement(By.xpath("//*[@text='Are you sure you would like to logout?']"));
    }
    public WebElement objCancelBtn(){
        return driver.findElement(By.xpath("//*[@text='Cancel']"));
    }
    public WebElement objHome(){
        return driver.findElement(By.xpath("//*[@text='Home']"));
    }
}

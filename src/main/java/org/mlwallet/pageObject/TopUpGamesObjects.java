package org.mlwallet.pageObject;

import org.openqa.selenium.By;
import utilities.Driver.AppiumDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver.AppiumDriverManager;

import java.time.Duration;
public class TopUpGamesObjects extends AppiumDriverManager {
   public WebElement objTopUpGames(){
        return driver.findElement(By.xpath("//*[@text='Gaming']"));
    }
   public WebElement objTopGamesPage(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.widget.ImageView']]/*[@class='android.view.ViewGroup'])[2]"));
    }
   public WebElement objGames(int i){
        return driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])["+i+"]"));
    }
   public WebElement objGames1(int j){
        return driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*[@class='android.view.ViewGroup'])[5]/*/*/*/*[@text and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[./*[@class='android.widget.ImageView']]])["+j+"]"));
    }
   public WebElement objValorant(){
        return driver.findElement(By.xpath("//*[@text='Valorant ']"));
    }
   public WebElement objBuyPHP149(){
        return driver.findElement(By.xpath("((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@text])[1]"));
    }
   public WebElement objGameUserID(){
        return driver.findElement(By.xpath("(//*[@text='*Game User ID']/following-sibling::android.widget.EditText)[1]"));
    }
   public WebElement objEmailAddress(){
        return driver.findElement(By.xpath("(//*[@text='*Email Addresses']/following-sibling::android.widget.EditText)[1]"));
    }
   public WebElement objMobileNumber(){
        return driver.findElement(By.xpath("(//*[@text='*Mobile Number']/following-sibling::android.widget.EditText)[1]"));
    }
    public WebElement objContinueOTP(){
        return driver.findElement(By.xpath("//*[@text='CONTINUE']"));
    }
   public WebElement objContinue(){
        return driver.findElement(By.xpath("//*[@text='Continue']"));
    }
   public WebElement objConfirm(){
        return driver.findElement(By.xpath("//*[@text='Confirm']"));
    }
   public WebElement objTransactionDetails(){
        return driver.findElement(By.xpath("//*[@text='Transaction Details']"));
    }
   public WebElement objTransactionCode(){
        return driver.findElement(By.xpath("(//*[@resource-id='Transaction Code'])[2]"));
    }
   public WebElement objGameUserIDInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Game User ID'])[2]"));
    }
   public WebElement objMobileNumberInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Mobile Number'])[2]"));
    }
   public WebElement objEmailInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Email'])[2]"));
    }
   public WebElement objAmountInTransactionDetails(){
        return driver.findElement(By.xpath("(//*[@resource-id='Amount'])[2]"));
    }
   public WebElement objRedeemCode(){
        return driver.findElement(By.xpath("(//*[@resource-id='Redeem Code'])[2]"));
    }
   public WebElement objAvailableBalance(){
        return driver.findElement(By.xpath("//*[@resource-id='0619JV']"));
    }
   public WebElement objBackToHome(){
        return driver.findElement(By.xpath("//*[@text='Back To Home']"));
    }
   public WebElement objGameIDRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@text='*Game User ID']/following-sibling::android.widget.TextView)[1]"));
    }
   public WebElement objEmailRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@text='*Email Addresses']/following-sibling::android.widget.TextView)[1]"));
    }
   public WebElement objEmailAddressInvalidMsg(){
        return driver.findElement(By.xpath("(//*[@text='*Email Addresses']/following-sibling::android.widget.TextView)[1]"));
    }
   public WebElement objMobileNumberInvalidMsg(){
        return driver.findElement(By.xpath("(//*[@text='*Mobile Number']/following-sibling::android.widget.TextView)[1]"));
    }
   public WebElement objMobileNumberRequiredMsg(){
        return driver.findElement(By.xpath("(//*[@text='*Mobile Number']/following-sibling::android.widget.TextView)[1]"));
    }
   public WebElement objSaveToMyFavorite(){
        return driver.findElement(By.xpath("//*[@text='Save to my favorite']"));
    }
   public WebElement objAddToFavoritesMsg(){
        return driver.findElement(By.xpath("//*[@text='Successfully Added to Favorites']"));
    }
   public WebElement objDuplicateFavorites(){
        return driver.findElement(By.xpath("//*[@text='Recipient already exists.']"));
    }
   public WebElement objOkButton(){
        return driver.findElement(By.xpath("//*[@text='Ok']"));
    }
   public WebElement objMyFavorites(){
        return driver.findElement(By.xpath("//*[@text='My Favorites']"));
    }
   public WebElement objFavoriteRecipient(){
        return driver.findElement(By.xpath("//*[@text='09999999996']"));
    }
   public WebElement objSearchFavField(){
        return driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    }
   public WebElement objLoadType(int i){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./*[@text] and ./*[@class='android.view.ViewGroup']])["+i+"]"));
    }
   public WebElement objLoadTypeAndPoints(int i){
        return driver.findElement(By.xpath("(//*[@class='android.widget.ScrollView']/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView)["+i+"]"));
    }
   public WebElement objHamburgerMenu(){
        return driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup'] and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup' and ./*[./*[@class='android.view.ViewGroup']]]]]]]/*/*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup']])[3]"));
    }
   public WebElement objRemoveBtn(){
        return driver.findElement(By.xpath("//*[@text='Remove']"));
    }
   public WebElement objTopUpAgainBtn(){
        return driver.findElement(By.xpath("//*[@text='Top Up Again']"));
    }
   public WebElement objTopUpGamesTransaction(){
        return driver.findElement(By.xpath("//*[@text='Top Up Games']"));
    }
   public WebElement objCompleteStatus(){
        return driver.findElement(By.xpath("//*[@text='Complete']"));
    }
   public WebElement objMLPinEditField(){
        return driver.findElement(By.xpath("//*[@resource-id='847305']"));
    }
}

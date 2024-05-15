package utilities.ReusableComponents;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver.AppiumDriverManager;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import utilities.yamlReader.yamlReader;
import java.time.Duration;
import java.util.Arrays;

import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class MobileGeneralMethod extends AppiumDriverManager {
    protected final AndroidDriver driver = getAndroidDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public final yamlReader reader = new yamlReader();
    public void tap(WebElement locator, String elementName){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
            LoggingUtils.info("Clicked on element: " + elementName);
            ExtentReporter.logInfo("Clicked on element: " + elementName, "");
        }catch (Exception e){
            LoggingUtils.info("Failed to Clicked on element: " + elementName);
            ExtentReporter.logFail("Failed to Clicked on element: " + elementName, "");
            throw new AssertionError("Failed to Clicked Element: " + elementName + e );
        }
    }
    public void type(WebElement locator, String elementName, String text){
        try{
            wait.until(ExpectedConditions.visibilityOf(locator));
            locator.sendKeys(text);
            LoggingUtils.info("Typed into field: " + elementName + ", Value: "+ text);
            ExtentReporter.logInfo("Typed into field: " + elementName , "Typed Value: "+ text);
        }catch (Exception e){
            LoggingUtils.error("Failed to Typed into field: " + elementName + ", Value: "+ text);
            ExtentReporter.logFail("Failed to Typed into field: " + elementName , "Typed Value: "+ text);
            throw new AssertionError("Failed to Typed Element: " + elementName + e );
        }
    }
    public boolean isVisible(WebElement locator, String elementName){
        try{
            wait.until(ExpectedConditions.visibilityOf(locator));
            LoggingUtils.info("Element: " + elementName + ", is visible");
            ExtentReporter.logInfo("Element: " + elementName , "is visible: ");
            return true;
        }catch (NoSuchElementException e){
            ExtentReporter.logFail("Element: " + elementName + "not visible", "Caused: ");
            LoggingUtils.error("Element: " + elementName + "not visible");
            throw new AssertionError("Element: " + elementName + " not visible" );
        }
    }
    public boolean isDisplayed(WebElement locator) {
        try {
            if(locator.isDisplayed()){
                return true;
            }
        } catch (NoSuchElementException e) {
        }
        return false;
    }
    public void waitSleep(int miliSeconds){
        try{
            Thread.sleep(miliSeconds);
            LoggingUtils.info("Waiting for: " + miliSeconds + " miliSeconds");
        }catch(Exception e){
            LoggingUtils.error("wait error: "+ e.getMessage());
        }
    }
    public void closeApp(){
        try{
            LoggingUtils.info("Closing App ........");
            AppiumDriverManager.getAndroidDriver().quit();
        }catch (Exception e){

        }
    }
//    public void startActivity(){
//        try{
//            LoggingUtils.info("Starting App Activity........");
//            AppiumDriverManager.setupServer();
//            AppiumDriverManager.startActivity();
//        }catch (Exception e){
//
//        }
//    }
    public void verticalSwipe(){
        try{
            Dimension size = driver.manage().window().getSize();
            int startY = size.getHeight()/2;
            int startX = size.getWidth()/2;
            int endY = (int) (driver.manage().window().getSize().getHeight()*0.2);
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 0);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Arrays.asList(swipe));
            ExtentReporter.logInfo("Swipe test", ".");
        }catch (Exception e){
            throw new AssertionError("Err: " +e);
        }
    }

    public String getText(WebElement byLocator) throws Exception {
        try{
            wait.until(ExpectedConditions.visibilityOf(byLocator));
            return byLocator.getText();
        }catch (Exception e){
            ExtentReporter.logFail("Element: " + byLocator + "not visible", "Caused: ");
            LoggingUtils.error("Element: " + byLocator + "not visible");
            throw new AssertionError("Element: " + byLocator + " not visible" );
        }
    }

    public void assertionValidation(String actual, String expected) throws Exception {
        Assert.assertEquals(actual,expected);
        if(actual.equals(expected))
        {
            LoggingUtils.info(actual+" and "+expected+" are matched");
            ExtentReporter.logPass("Assertion",actual+" and "+expected+" are matched");
        }else {
            LoggingUtils.info(actual+" and "+expected+" are not matched");
            ExtentReporter.logFail("Assertion",actual+" and "+expected+" are not matched");
        }
    }
}

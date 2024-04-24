package mlkpx.testSteps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import utilities.Logger.LoggingUtils;

import static utilities.Driver.DriverManager.getDriver;


public class BillsPay_Steps extends Base_Steps{
    public void navigatePayoutPage()throws Exception{
        try{
            click(billsPayPageObjects.billsPay_link(), "Bills Pay");
            if(isVisible(billsPayPageObjects.billsPay_h2(), getText(billsPayPageObjects.billsPay_h2()))){
                LoggingUtils.info("Navigated to Bills Pay Page");
            }
        }catch (Exception e){
            LoggingUtils.info("Failed to Navigate Bills Pay Page "+ e);
        }
    }

    //B I L L S  P A Y    S E N D O U T
    public void validateSuccessfulBillsPayTransaction()throws Exception {
        click(billsPayPageObjects.BPSendout(), "Bills Pay Sendout Transaction");
        click(billsPayPageObjects.NoRemoteTransaction(), "No remote Transaction");

//        click(billsPayPageObjects.BPChoosePartners(), "Choose Partners");
        typeEnter(billsPayPageObjects.BPChoosePartners(), "Partner", "MERALCO RTP (ELECTRICITY)");

//
//        click(billsPayPageObjects.BPChoosePartners(propertyReader.getproperty("Partner")), "Partners");
//        String selectedPartners = getText(billsPayPageObjects.BPChoosePartners(propertyReader.getproperty("Partner")));
//        LoggingUtils.info(selectedPartners);

//        WebElement partnersDropdown = billsPayPageObjects.BPPartners();
//        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//        executor.executeScript("arguments[0].click();", partnersDropdown);
//
//        String partner = propertyReader.getproperty("Partner");
//        WebElement partnerElement = billsPayPageObjects.BPChoosePartners(partner);
//        executor.executeScript("arguments[0].click();", partnerElement);
//
//        String selectedPartners = getText(partnerElement);
//        LoggingUtils.info(selectedPartners);
        type(billsPayPageObjects.BPAccNum(), "BP Account Number", "62725870");
        type(billsPayPageObjects.BPLastName(), "BP Last Name", "AGUILARTEST");
        type(billsPayPageObjects.BPFirstName(), "BP First Name", "ANGELYTEST");
        type(billsPayPageObjects.BPMiddleName(), "BP Middle Name", "TESTING");

        //Payor Information
        type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "AGUILARTEST");
        type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "ANGELYTEST");
        type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
        type(billsPayPageObjects.PayorAddress(), "Payor Address", "Cebu City");
        type(billsPayPageObjects.PayorContact(), "Payor Contact", "09635129781");
        type(billsPayPageObjects.PaymentAmount(), "Payment Amount", "100");
        type(billsPayPageObjects.PaymentDetails(), "Payment Details", "Testing Testing");
        click(billsPayPageObjects.SubmitBillsPay(), "Submit Bills Pay Button");

    }







}

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

        click(billsPayPageObjects.BPPartners(), "Choose Partners");
        type(billsPayPageObjects.BPPartners(), "Partner", "MERALCO RTP (ELECTRICITY)");

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

    //B I L L S  P A Y    C A N C E L L A T I O N
    public void validateSuccessfulBillsPayCancellation()throws Exception{
        //Must need to cancel before/within five minutes.
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPZQEDICCK");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111111262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            click(billsPayPageObjects.YesCancelPayment(), "Yes, Cancel Payment");
            LoggingUtils.info("Bills Pay Cancelled" +
                    "Payment has been successfully cancelled.");

        }
    }
    public void validateSuccessfulRemoteBillsPayCancellation()throws Exception{
        //Must need to cancel before/within five minutes.
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPUNBGCJMV");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            click(billsPayPageObjects.RemoteTransaction(), "Remote Transaction");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.BranchCode()));

            type(billsPayPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(13));

            waits.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.OperatorID()));
            type(billsPayPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(billsPayPageObjects.ReasonRemote(), "Reason", "Testing");

            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111113262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            click(billsPayPageObjects.YesCancelPayment(), "Yes, Cancel Payment");
            LoggingUtils.info("Bills Pay Cancelled" +
                    "Payment has been successfully cancelled.");
        }
    }
    public void validateEmptyRefBillsPayCancellation()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","");
            click(billsPayPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(billsPayPageObjects.EmptyRef()), "Reference Number is required");
        }
    }
    public void validateInvalidRefBillsPayCancellation()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPGQTCVKWTN");
            click(billsPayPageObjects.SearchButton(), "Search Button");

            if(isVisible(billsPayPageObjects.InvalidKTPN(), getText(billsPayPageObjects.Page_h5()))){
                assertEqual(getText(billsPayPageObjects.Page_h5()), "No Transaction Found");
            }
            click(billsPayPageObjects.OKButton(), "OK");
        }
    }
    public void validateCancelledBillsPayRefNum()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPGQTCVWTN");
            click(billsPayPageObjects.SearchButton(), "Search Button");

            if(isVisible(billsPayPageObjects.CancelledRefNum(), getText(billsPayPageObjects.CancelledRefNum()))){
                assertEqual(getText(billsPayPageObjects.CancelledRefNum()), "Bills Payment Cancelled");
            }
            click(billsPayPageObjects.OKButton(), "OK");
        }
    }
    public void validateCancelledBillsPayInvalidIRNumber()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "343453453453");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            assertEqual(getText(billsPayPageObjects.InvalidIRNum()), "Please enter valid IR No.");
        }
    }
    public void validateCancelledBillsPayNoReason()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111111262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            assertEqual(getText(billsPayPageObjects.NoReason()), "Reason for Cancellation is required");


        }
    }
    public void validateCancelledBillsPayNoIRNumber()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Remote Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "IR Number", "");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            assertEqual(getText(billsPayPageObjects.NoIRNum()), "IR Number is required");
        }
    }
    public void validateCancelledBillsPayNoInitiatedBy()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111111262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(billsPayPageObjects.NoInitiatedBy(), "Initiated By");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            LoggingUtils.info("Please select an item in the list display and you can't proceed to cancellations");

        }
    }
    public void validateCancelledBillsPayKeepTransaction()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111111262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.KeepTransaction(), "Keep Transaction");
            click(billsPayPageObjects.YesKeepTransaction(), "Yes, Keep Transaction");
            LoggingUtils.info("You will return to Bills Pay Cancellation" +
                    "Search Transaction");

        }
    }
    public void validateCancelledBillsPayStayInPage()throws Exception{
        click(billsPayPageObjects.BPCancellation(), "Bills Pay Cancellation Transaction");
        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))) {
            LoggingUtils.info("Navigated the BillsPay Cancellation page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }

        if(isVisible(billsPayPageObjects.BillsPayText(), getText(billsPayPageObjects.BillsPayText()))){
            type(billsPayPageObjects.IRNum(), "KTPN Number", "2111111111262");
            type(billsPayPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.CancelPayment(), "Cancel Payment");
            click(billsPayPageObjects.NoCancelPayment(), "No, Keep Transaction");
            LoggingUtils.info("You will stay in the Bills Pay Cancellation" +
                    "Transaction Details");

        }
    }


    //B I L L S  P A Y    C H A N G E  D E T A I L S
    public void validateSuccessfulBillsPayChangeDetails()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))){
            //Payor Information

            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "2111114441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.YesSaveChanges(), "Yes, Save Changes");
            assertEqual(getText(billsPayPageObjects.SuccessChanges()), "Details have been successfully updated.");
            LoggingUtils.info("Bills Pay Details Updated" +
                    "Details have been successfully updated.");

        }
    }
    public void validateSuccessfulBillsPayRemoteChangeDetails()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            click(billsPayPageObjects.RemoteTransaction(), "Remote Transaction");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.BranchCode()));

            type(billsPayPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(13));

            waits.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.OperatorID()));
            type(billsPayPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(billsPayPageObjects.ReasonRemote(), "Reason", "Testing");
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING TEST");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL TEST");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629345");
            type(billsPayPageObjects.IRNum(), "IR Number", "2122214441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.YesSaveChanges(), "Yes, Save Changes");
            assertEqual(getText(billsPayPageObjects.SuccessChanges()), "Details have been successfully updated.");
            LoggingUtils.info("Bills Pay Details Updated" +
                    "Details have been successfully updated.");

        }
    }
    public void validateBillsPayChangeDetailsNoRef()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","");
            click(billsPayPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(billsPayPageObjects.EmptyRef()), "Reference Number is required");
        }
    }
    public void validateBillsPayChangeDetailsInvalidRef()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPEEEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
            if(isVisible(billsPayPageObjects.InvalidKTPN(), getText(billsPayPageObjects.Page_h5()))){
                assertEqual(getText(billsPayPageObjects.Page_h5()), "No Transaction Found");
            }
            click(billsPayPageObjects.OKButton(), "OK");
        }
    }
    public void validateBillsPayChangeDetailsNoIR()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL Clarin");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.NoIRNum()), "IR Number is required.");

        }
    }
    public void validateBillsPayChangeDetailsInvalidIR()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL Clarin");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "4464664");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.InvalidIRNum()), "Please enter a valid IR No.");

        }
    }
    public void validateBillsPayChangeDetailsNoReason()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL Clarin");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "5345555555555");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.NoReasonChange()), "Reason for Change is required.");

        }
    }
    public void validateBillsPayRemoteChangeDetailsNoReason()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            click(billsPayPageObjects.RemoteTransaction(), "Remote Transaction");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.BranchCode()));

            type(billsPayPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(13));

            waits.until(ExpectedConditions.elementToBeClickable(billsPayPageObjects.OperatorID()));
            type(billsPayPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(billsPayPageObjects.ReasonRemote(), "Reason", "Testing");
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL Clarin");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "5345555555555");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.NoReasonChange()), "Reason for Change is required.");

        }
    }
    public void validateBillsPayChangeDetailsNoInitiated()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL Clarin");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "5345555555555");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.NoInitiatedBy(), "Initiated By");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            LoggingUtils.info("Please select an item in the list display and you can't proceed to change details");

        }
    }
    public void validateKeepTransactionBillsPayChangeDetails()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "2111114441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.CancelChanges(), "Cancel");
            click(billsPayPageObjects.YesKeepTransaction(), "Yes, Keep Transaction");
            LoggingUtils.info("You will return to Bills Pay Change Details" +
                    "Search Transaction");

        }
    }
    public void validateStayPageBillsPayChangeDetails()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "2111114441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            click(billsPayPageObjects.NoCancelChanges(), "No, Keep Transaction");
            LoggingUtils.info("You will stay in the Bills Pay Cancellation" +
                    "Transaction Details");

        }
    }
    public void validateStayPageBillsPayNoChangeDetails()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation
                ()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING TEST");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL TEST");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629345");
            type(billsPayPageObjects.IRNum(), "IR Number", "2122214441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "TestingTest");
            click(billsPayPageObjects.InitiatedBy(), "Initiated By");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.NoEditChanges()), "No Changes Have Been Made");
            LoggingUtils.info("No Changes Have Been Made" +
                    "No detail were changed for this transaction. Do you want to go back and make changes?");

        }
    }
    public void validateStayPageBillsPayOnlyLetters()throws Exception{
        click(billsPayPageObjects.BPChangeDetails(), "Bills Pay Change Details");
        if(isVisible(billsPayPageObjects.BillsPayChange(), getText(billsPayPageObjects.BillsPayChange()))) {
            LoggingUtils.info("Navigated the BillsPay Change Details page");
            type(billsPayPageObjects.RefNum(), "KTPN Number","KBPTLEFUPGI");
            click(billsPayPageObjects.SearchButton(), "Search Button");
        }
        if(isVisible(billsPayPageObjects.PayInformation(), getText(billsPayPageObjects.PayInformation
                ()))){
            //Payor Information
            billsPayPageObjects.PayorLastName().clear();
            type(billsPayPageObjects.PayorLastName(), "Payor Last Name", "TEST");
            billsPayPageObjects.PayorFirstName().clear();
            type(billsPayPageObjects.PayorFirstName(), "Payor First Name", "TEST");
            billsPayPageObjects.PayorMiddleName().clear();
            type(billsPayPageObjects.PayorMiddleName(), "Payor Middle Name", "TESTING");
            billsPayPageObjects.PayorAddress().clear();
            type(billsPayPageObjects.PayorAddress(), "Payor Address", "BOHOL");
            billsPayPageObjects.PayorContact().clear();
            type(billsPayPageObjects.PayorContact(), "Payor Contact", "09077629355");
            type(billsPayPageObjects.IRNum(), "IR Number", "2111114441262");
            type(billsPayPageObjects.ReasonChange(), "Reason for Change ", "15345TestingTest");
            click(billsPayPageObjects.SaveChanges(), "Save Changes");
            assertEqual(getText(billsPayPageObjects.OnlyLetters()), "Only letters A-Z, Ñ, - and . are allowed.");

        }
    }

    //B I L L S  P A Y    R E P R I N T I N G
    public void validateSuccessfulBillsPayReprinting()throws Exception{
        click(billsPayPageObjects.BPReprinting(), "Bills Pay Reprinting");
        if(isVisible(billsPayPageObjects.BillsPayPrint(), getText(billsPayPageObjects.BillsPayPrint()))) {
            LoggingUtils.info("Navigated the BillsPay Reprinting page");
        }
        type(billsPayPageObjects.RefNum(), "Reference Number","KBPTLEFUPGI");
        type(billsPayPageObjects.ReasonReprinting(), "Reason for Reprinting ", "Testings");
        click(billsPayPageObjects.Reprint(), "Search Button");
        if(isVisible(billsPayPageObjects.ReprintBillsReceipt(), getText(billsPayPageObjects.ReprintBillsReceipt()))){
            LoggingUtils.info("Navigated the Bills Pay Reprint Receipt page");
            click(billsPayPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing BillsPay Receipt");

        }
    }
    public void validateInvalidKTPNBillsPayReprinting()throws Exception{
        click(billsPayPageObjects.BPReprinting(), "Bills Pay Reprinting");
        if(isVisible(billsPayPageObjects.BillsPayPrint(), getText(billsPayPageObjects.BillsPayPrint()))) {
            LoggingUtils.info("Navigated the BillsPay Reprinting page");
        }
        type(billsPayPageObjects.RefNum(), "Reference Number","KBPTLFFEFUPGI");
        type(billsPayPageObjects.ReasonReprinting(), "Reason for Reprinting ", "Testings");
        click(billsPayPageObjects.Reprint(), "Search Button");
        assertEqual(getText(billsPayPageObjects.NoTransactionFound()), "Bills Payment transaction could not be found. Please check the reference no. and try again.");

    }
    public void validateEmptyRefBillsPayReprinting()throws Exception{
        click(billsPayPageObjects.BPReprinting(), "Bills Pay Reprinting");
        if(isVisible(billsPayPageObjects.BillsPayPrint(), getText(billsPayPageObjects.BillsPayPrint()))) {
            LoggingUtils.info("Navigated the BillsPay Reprinting page");
        }
        type(billsPayPageObjects.RefNum(), "Reference Number","");
        click(billsPayPageObjects.Reprint(), "Search Button");
        assertEqual(getText(billsPayPageObjects.RefRequired()), "Reference number is required");

    }
    public void validateEmptyReasonBillsPayReprinting()throws Exception{
        click(billsPayPageObjects.BPReprinting(), "Bills Pay Reprinting");
        if(isVisible(billsPayPageObjects.BillsPayPrint(), getText(billsPayPageObjects.BillsPayPrint()))) {
            LoggingUtils.info("Navigated the BillsPay Reprinting page");
        }
        type(billsPayPageObjects.RefNum(), "Reference Number","KBPTLERSPGI");
        type(billsPayPageObjects.ReasonReprinting(), "Reason for Reprinting ", "");
        click(billsPayPageObjects.Reprint(), "Search Button");
        assertEqual(getText(billsPayPageObjects.ReasonRequired()), "Reason is required");

    }
    public void validateOnlyLettersBillsPayReprinting()throws Exception{
        click(billsPayPageObjects.BPReprinting(), "Bills Pay Reprinting");
        if(isVisible(billsPayPageObjects.BillsPayPrint(), getText(billsPayPageObjects.BillsPayPrint()))) {
            LoggingUtils.info("Navigated the BillsPay Reprinting page");
        }
        type(billsPayPageObjects.RefNum(), "Reference Number","KBPTLERSPGI");
        type(billsPayPageObjects.ReasonReprinting(), "Reason for Reprinting ", "466Testings");
        click(billsPayPageObjects.Reprint(), "Search Button");
        assertEqual(getText(billsPayPageObjects.OnlyLettersP()), "Only letters are allowed.");

    }


}

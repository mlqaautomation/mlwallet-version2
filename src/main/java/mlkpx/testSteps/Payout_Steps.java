package mlkpx.testSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.time.Duration;
public class Payout_Steps extends Base_Steps{

    //P A Y O U T    T R A N S A C T I O N
    public void navigatePayoutPage()throws Exception{
        try{
            click(payoutPageObjects.payout_link(), "Payout");
            if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
                LoggingUtils.info("Navigated to Payout Page");
            }
        }catch (Exception e){
            LoggingUtils.info("Failed to Navigate Payout Page "+ e);
        }
    }
    public void validateSuccessfulDomesticPayout()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "KPNJMLTCPPR");
            type(payoutPageObjects.PayAmount(), "Amount","200" );
            click(payoutPageObjects.SearchButton(), "Search Button");
            waitSleep(2);
            click(payoutPageObjects.SearchKYC(), "Search KYC");
            waitSleep(2);
            payoutPageObjects.SearchLName().clear();
            type(payoutPageObjects.SearchLName(), "Last name field", "AMOCTEST");
            payoutPageObjects.SearchFName().clear();
            type(payoutPageObjects.SearchFName(), "First name field", "ROSELYNTESTEST");
            payoutPageObjects.SearchMName().clear();
            type(payoutPageObjects.SearchMName(), "Middle name field", "");
            click(payoutPageObjects.SearchKYCAc(), "Search Button");
            waitSleep(2);
            click(payoutPageObjects.ViewKYCCustomer(), "View KYC");
            waitSleep(2);
            if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
                LoggingUtils.info("Navigated to View KYC");
                scrollDown(100);
                waitSleep(3000);
                scrollDown(100);
            }
            click(payoutPageObjects.SelectKYC(), "Select KYC");
            if (payoutPageObjects.PayoutInfos().isEnabled()) {
                LoggingUtils.info("Navigated to View Payout Information's");
                click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
            }


            if (payoutPageObjects.PayoutConfirm().isEnabled()) {
                click(payoutPageObjects.ConfirmPayout(), "Click Confirm Payout");
                assertEqual(getText(payoutPageObjects.SuccessfulPay()), "Payout Successful");
            }

    }
    public void validateSuccessfulRemoteDomesticPayout()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");

            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "KPNHMSMDUPZ");
            type(payoutPageObjects.PayAmount(), "Amount", "100");
            click(payoutPageObjects.SearchButton(), "Search Button");
            waitSleep(2);
            click(payoutPageObjects.SearchKYC(), "Search KYC");
            waitSleep(2);
            payoutPageObjects.SearchLName().clear();
            type(payoutPageObjects.SearchLName(), "Last name field", "AMOCTEST");
            payoutPageObjects.SearchFName().clear();
            type(payoutPageObjects.SearchFName(), "First name field", "ROSELYNTESTEST");
            payoutPageObjects.SearchMName().clear();
            type(payoutPageObjects.SearchMName(), "Middle name field", "");
            click(payoutPageObjects.SearchKYCAc(), "Search Button");
            waitSleep(2);
            click(payoutPageObjects.ViewKYCCustomer(), "View KYC");
            waitSleep(2);
            if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
                LoggingUtils.info("Navigated to View KYC");
                scrollDown(100);
                waitSleep(3000);
                scrollDown(100);
            }
            click(payoutPageObjects.SelectKYC(), "Select KYC");

            if (payoutPageObjects.PayoutInfos().isEnabled()) {
                LoggingUtils.info("Navigated to View Payout Information's");
                click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
            }

            if (payoutPageObjects.PayoutConfirm().isEnabled()) {
                click(payoutPageObjects.ConfirmPayout(), "Click Confirm Payout");
                assertEqual(getText(payoutPageObjects.SuccessfulPay()), "Payout Successful");
            }

    }
    public void validateComplianceAssistance()throws Exception{

        click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
        click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
        click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
        type(payoutPageObjects.PayKTPN(), "Compliance KTPN Number", propertyReader.getproperty("ComplianceAssKTPN"));
        type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("UnPayAmount"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        waitSleep(2);
        click(payoutPageObjects.SearchKYC(), "Search KYC");
        waitSleep(2);
        payoutPageObjects.SearchLName().clear();
        type(payoutPageObjects.SearchLName(), "Last name field", "SIAROT");
        payoutPageObjects.SearchFName().clear();
        type(payoutPageObjects.SearchFName(), "First name field", "ENRIQUE");
        payoutPageObjects.SearchMName().clear();
        type(payoutPageObjects.SearchMName(), "Middle name field", "");
        click(payoutPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(payoutPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(payoutPageObjects.SelectKYC(), "Select KYC");
        if (payoutPageObjects.PayoutInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Payout Information's");
            click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
        }


        if (payoutPageObjects.PayoutConfirm().isEnabled()) {
            click(payoutPageObjects.ConfirmPayout(), "Click Confirm Payout");
            WebDriverWait ca = new WebDriverWait(driver, Duration.ofSeconds(10));
            ca.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OKCom()));
            assertEqual(getText(payoutPageObjects.ComplianceAss()), "For Compliance Assistance");
            click(payoutPageObjects.OKCom(), "Click OK");

        }


    }
    public void validateRemoteComplianceAssistance()throws Exception{

        click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

        waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
        type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
        type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");

        click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
        type(payoutPageObjects.PayKTPN(), "Compliance KTPN Number", propertyReader.getproperty("ComplianceAssKTPN"));
        type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("UnPayAmount"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        waitSleep(2);
        click(payoutPageObjects.SearchKYC(), "Search KYC");
        waitSleep(2);
        payoutPageObjects.SearchLName().clear();
        type(payoutPageObjects.SearchLName(), "Last name field", "SIAROT");
        payoutPageObjects.SearchFName().clear();
        type(payoutPageObjects.SearchFName(), "First name field", "ENRIQUE");
        payoutPageObjects.SearchMName().clear();
        type(payoutPageObjects.SearchMName(), "Middle name field", "");
        click(payoutPageObjects.SearchKYCAc(), "Search Button");
        waitSleep(2);
        click(payoutPageObjects.ViewKYCCustomer(), "View KYC");
        waitSleep(2);
        if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
            LoggingUtils.info("Navigated to View KYC");
            scrollDown(100);
            waitSleep(3000);
            scrollDown(100);
        }
        click(payoutPageObjects.SelectKYC(), "Select KYC");
        if (payoutPageObjects.PayoutInfos().isEnabled()) {
            LoggingUtils.info("Navigated to View Payout Information's");
            click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
        }


        if (payoutPageObjects.PayoutConfirm().isEnabled()) {
            click(payoutPageObjects.ConfirmPayout(), "Click Confirm Payout");
            WebDriverWait ca = new WebDriverWait(driver, Duration.ofSeconds(10));
            ca.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OKCom()));
            assertEqual(getText(payoutPageObjects.ComplianceAss()), "For Compliance Assistance");
            click(payoutPageObjects.OKCom(), "Click OK");

        }


    }
    public void validateInvalidKTPN()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("InvalidKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");

            if(isVisible(payoutPageObjects.InvalidKTPN(), getText(payoutPageObjects.payoutPage_h5()))){
                assertEqual(getText(payoutPageObjects.payoutPage_h5()), "No Transaction Found");
            }
            click(payoutPageObjects.OKInvalidKTPN(), "OK");


    }
    public void validateRemoteInvalidKTPN()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");

            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");

            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("InvalidKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");

            if (isVisible(payoutPageObjects.InvalidKTPN(), getText(payoutPageObjects.payoutPage_h5()))) {
                assertEqual(getText(payoutPageObjects.payoutPage_h5()), "No Transaction Found");
            }
            click(payoutPageObjects.OKInvalidKTPN(), "OK");





    }
    public void validateInvalidAmountDPT()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("UnclaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.InvalidAmount()), "Amount entered does not match amount in KPTN / reference no.");


    }
    public void validateInvalidAmountRemoteDPT()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");

            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("UnclaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.InvalidAmount()), "Amount entered does not match amount in KPTN / reference no.");


    }
    public void validateClaimedDomesticPayout()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "KPNJMLTCPPR");
            type(payoutPageObjects.PayAmount(), "Amount", "200");
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: c3dfb6b)");
            if (isVisible(payoutPageObjects.PayoutClaimed(), getText(payoutPageObjects.payoutClaim_h5()))) {
                assertEqual(getText(payoutPageObjects.payoutClaim_h5()), "Payout Claimed");
            }
            click(payoutPageObjects.OKInvalidKTPN(), "OK");


    }
    public void validateClaimedRemoteDomesticPayout()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "KPNHMSMDUPZ");
            type(payoutPageObjects.PayAmount(), "Amount", "100");
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: c3dfb6b)");

            if (isVisible(payoutPageObjects.PayoutClaimed(), getText(payoutPageObjects.payoutClaim_h5()))) {
                assertEqual(getText(payoutPageObjects.payoutClaim_h5()), "Payout Claimed");
            }
            click(payoutPageObjects.OKInvalidKTPN(), "OK");


    }
    public void validateDPTwithoutKTPNInput()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "");
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.RequiredKTPN()), "KPTN is required");


    }
    public void validateRemoteDPTwithoutKTPNInput()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", "");
            payoutPageObjects.PayAmount().clear();
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.RequiredKTPN()), "KPTN is required");


    }
    public void validateDPTwithoutAmountInput()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("ClaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", "");
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountShouldBeNumber()), "Amount should be a number");


    }
    public void validateRemoteDPTWithoutAmountInput()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
            type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");
            waitSleep(4);
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("ClaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", "");
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountShouldBeNumber()), "Amount should be a number");


    }
    public void validateRemoteInvalidBranchCode()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R3180912");
            ExtentReporter.logPass("validateRemoteInvalidBranchCode","Branch not found");


    }
    public void validateRemoteInvalidOperatorID()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));
            payoutPageObjects.BranchCode().clear();
            type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
            WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

            waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
            type(payoutPageObjects.OperatorID(), "Search Operator ID", "20236709");
            ExtentReporter.logPass("validateRemoteInvalidOperatorID","Operator not found");


    }


    //P A Y O U T    C A N C E L L A T I O N
    public void validateSuccessfulPayoutCancellation()throws Exception{
        //Must need to cancel before/within five minutes.
        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number","KPNJMLTCPPR");
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", "2111111111212");
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");
            click(payoutPageObjects.YesCancelButton(), "Yes, Cancel Button");
            LoggingUtils.info("Payout Cancelled" +
                    "Payout transaction has been successfully cancelled");

        }
    }
    public void validateRemoteSuccessfulPayoutCancellation()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

        waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
        type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
        type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");
        type(payoutPageObjects.CancelKTPN(), "IR Number", "KPNKHPRGHKJ");
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", "2111111111113");
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");
            click(payoutPageObjects.YesCancelButton(), "Yes, Cancel Button");

            LoggingUtils.info("Payout Cancelled" +
                    "Payout transaction has been successfully cancelled");

        }
    }
    public void validateInvalidKTPNPayoutCancellation()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");
        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", "KPNKHPRGHKJK");
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.NoTransactionFound(), getText(payoutPageObjects.NoTransactionFound()))) {
            assertEqual(getText(payoutPageObjects.NoTransactionFound()), "No Transaction Found");

        }


    }
    public void validateAlreadyBeenCancelledTransaction()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");
        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", "KPNRCHYTSSW");
        click(payoutPageObjects.SearchButton(), "Search Button");

        assertEqual(getText(payoutPageObjects.AlreadyBeenCancelled()), "Payout transaction has already been cancelled.");

    }
    public void validatePayoutCancellationWithNoKPTN()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");
        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", "");
        click(payoutPageObjects.SearchButton(), "Search Button");
        assertEqual(getText(payoutPageObjects.CKTPNRequired()), "KPTN is required");

    }
    public void validateNoIRNumberProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", "KPNJUGPIVZI");
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "IR Number", "");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");

            assertEqual(getText(payoutPageObjects.IRNumRequired()), "IR Number is required");


        }
    }
    public void validateRemoteNoIRNumberProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));

        waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
        type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
        type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");

        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", "");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");

            assertEqual(getText(payoutPageObjects.IRNumRequired()), "IR Number is required");


        }
    }
    public void validateNoReasonProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", propertyReader.getproperty("IrNO"));
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");

            assertEqual(getText(payoutPageObjects.ReasonRequired()), "Reason for Cancellation is required");
        }
    }
    public void validateRemoteNoReasonProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));

        waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
        type(payoutPageObjects.OperatorID(), "Search Operator ID", "2023639709");
        type(payoutPageObjects.ReasonRemote(), "Reason", "Testing");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", propertyReader.getproperty("IrNO"));
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");

            assertEqual(getText(payoutPageObjects.ReasonRequired()), "Reason for Cancellation is required");
        }
    }
    public void validateRemoteInvalidBranchCodeProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A1840912");

        assertEqual(getText(payoutPageObjects.BranchNotFound()), "Branch not found");
    }
    public void validateRemoteInvalidOperatorIDProvided()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        click(payoutPageObjects.RemoteTransaction(), "Remote Transaction");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.BranchCode()));

        type(payoutPageObjects.BranchCode(), "Search Branch Code", "12R33A180912");
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(15));

        waits.until(ExpectedConditions.elementToBeClickable(payoutPageObjects.OperatorID()));
        type(payoutPageObjects.OperatorID(), "Search Operator ID", "20236379709");
        assertEqual(getText(payoutPageObjects.OperatorNotFound()), "Operator not found");
    }
    public void validateCannotCancelPayout()throws Exception{
        //Must need to cancel before/within five minutes.
        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", propertyReader.getproperty("IrNO"));
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");
            click(payoutPageObjects.YesCancelButton(), "Yes, Cancel Button");

            assertEqual(getText(payoutPageObjects.CannotCancel()), "Cannot Cancel Payout");
        }
    }
    public void validateKeepTheTransaction()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", propertyReader.getproperty("IrNO"));
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(payoutPageObjects.KeepTransaction(), "Keep Transaction");
            click(payoutPageObjects.YesKeepTransaction(), "Yes, Keep Transaction");

            assertEqual(getText(payoutPageObjects.PayoutCancellationAmountInfo()), "Payout Cancellation");
        }
    }
    public void validateKeepTheTransactionAfterFiveMinutes()throws Exception{

        click(payoutPageObjects.payoutCanPage(), "Payout Cancellation");
        if(isVisible(payoutPageObjects.PayoutCancellation(), getText(payoutPageObjects.PayoutCancellation()))){
            click(payoutPageObjects.PayoutCancellation(), "Payout Cancellation Page");
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.CancelKTPN(), "KTPN Number", "KPNKTNZQEQM");
        click(payoutPageObjects.SearchButton(), "Search Button");
        if(isVisible(payoutPageObjects.PayoutCancellationAmountInfo(), getText(payoutPageObjects.PayoutCancellationAmountInfo()))){
            type(payoutPageObjects.IRNum(), "KTPN Number", propertyReader.getproperty("IrNO"));
            type(payoutPageObjects.ReasonCancel(), "Reason for Cancellation ", "Testing");
            click(payoutPageObjects.CancelButton(), "Cancel Payout");
            click(payoutPageObjects.YesCancelButton(), "Yes, Cancel Button");
            assertEqual(getText(payoutPageObjects.FailedCancel()), "Cancel Payout Failed");


        }
    }


    //P A Y O U T  R E P R I N T
    public void validateSuccessfulPayoutReprinting()throws Exception{
        click(payoutPageObjects.payoutRepPage(), "Payout Reprint");
        if(isVisible(payoutPageObjects.payoutRepPage(), getText(payoutPageObjects.payoutRepPage()))){
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.RepKTPN(), "KTPN Number","KPNKTNZQEQM");
        type(payoutPageObjects.ReasonReprinting(), "Reason for Reprinting ", "Testing");
        click(payoutPageObjects.Reprint(), "Search Button");
        if(isVisible(payoutPageObjects.ReprintPayoutReceipt(), getText(payoutPageObjects.ReprintPayoutReceipt()))){
            LoggingUtils.info("Navigated the Payout Reprint Receipt page");
            click(payoutPageObjects.PrintReceipt(), "Print Receipt");
//            click(payoutPageObjects.PrintButton(), "Print");
            LoggingUtils.info("Successful in printing payout receipt");

        }
    }
    public void validateInvalidKTPNPayoutReprinting()throws Exception{
        click(payoutPageObjects.payoutRepPage(), "Payout Reprint");
        if(isVisible(payoutPageObjects.payoutRepPage(), getText(payoutPageObjects.payoutRepPage()))){
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.RepKTPN(), "KTPN Number","KPNKKTNZQEQM");
        type(payoutPageObjects.ReasonReprinting(), "Reason for Reprinting ", "Testing");
        click(payoutPageObjects.Reprint(), "Search Button");
        assertEqual(getText(payoutPageObjects.NoTransactionFound()), "No Transaction Found");

    }
    public void validateEmptyReasonPayoutReprinting()throws Exception{
        click(payoutPageObjects.payoutRepPage(), "Payout Reprint");
        if(isVisible(payoutPageObjects.payoutRepPage(), getText(payoutPageObjects.payoutRepPage()))){
            LoggingUtils.info("Navigated the Payout Cancellation page");

        }
        type(payoutPageObjects.RepKTPN(), "KTPN Number","KPNKTNZQEQM");
        type(payoutPageObjects.ReasonReprinting(), "Reason for Reprinting ", "");
        click(payoutPageObjects.Reprint(), "Search Button");
        assertEqual(getText(payoutPageObjects.ReReasonRequired()), "Reason is required");

    }
}







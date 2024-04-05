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
    public void navigatePayoutPage()throws Exception{
        try{
            click(payoutPageObjects.payout_link(), "Payout");
            if(isVisible(payoutPageObjects.payoutPage_h2(), getText(payoutPageObjects.payoutPage_h2()))){
                LoggingUtils.info("Navigated to Search Payout Page");
            }
        }catch (Exception e){
            LoggingUtils.info("Failed to Navigate Search Payout Page "+ e);
        }
    }

    public void validateSuccessfulDomesticPayout()throws Exception{

            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("UnclaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("UnnPayAmount"));
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
            }
            if (payoutPageObjects.NavViewKYC().isEnabled()) {
                payoutPageObjects.NavViewKYC().click();

                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("arguments[0].scrollIntoView(true);", payoutPageObjects.SelectKYC());
                click(payoutPageObjects.SelectKYC(), "Select KYC");
                if (payoutPageObjects.PayoutInfos().isEnabled()) {
                    LoggingUtils.info("Navigated to View Payout Information's");
                    click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
                }
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("RUnclaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("UnnPayAmount"));
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
            }
            if (payoutPageObjects.NavViewKYC().isEnabled()) {
                payoutPageObjects.NavViewKYC().click();

                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("arguments[0].scrollIntoView(true);", payoutPageObjects.SelectKYC());
                click(payoutPageObjects.SelectKYC(), "Select KYC");
                if (payoutPageObjects.PayoutInfos().isEnabled()) {
                    LoggingUtils.info("Navigated to View Payout Information's");
                    click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
                }
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
        }
        if (payoutPageObjects.NavViewKYC().isEnabled()) {
            payoutPageObjects.NavViewKYC().click();

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", payoutPageObjects.SelectKYC());
            click(payoutPageObjects.SelectKYC(), "Select KYC");
            if (payoutPageObjects.PayoutInfos().isEnabled()) {
                LoggingUtils.info("Navigated to View Payout Information's");
                click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
            }
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
        }
        if (payoutPageObjects.NavViewKYC().isEnabled()) {
            payoutPageObjects.NavViewKYC().click();

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true);", payoutPageObjects.SelectsKYC());
            click(payoutPageObjects.SelectKYC(), "Select KYC");
            if (payoutPageObjects.PayoutInfos().isEnabled()) {
                LoggingUtils.info("Navigated to View Payout Information's");
                click(payoutPageObjects.ClaimAmount(), "Select Claim Amount");
            }
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("ClaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: 6a3815b)");
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("ClaimKTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: 6a3815b)");

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





}

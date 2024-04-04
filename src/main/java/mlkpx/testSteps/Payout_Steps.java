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
        try{
            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
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
        }catch (Exception e){
            ExtentReporter.logFail(""+e);
        }
    }
    public void validateSuccessfulRemoteDomesticPayout()throws Exception{
        try{
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("PayAmount"));
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
        }catch (Exception e){
            ExtentReporter.logFail(""+e);
        }
    }
    public void validateInvalidKTPN()throws Exception{
        try{
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

        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }
    public void validateRemoteInvalidKTPN()throws Exception{
        try{
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




        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }
    public void validateInvalidAmountDPT()throws Exception{
        try{
            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.InvalidAmount()), "Amount entered does not match amount in KPTN / reference no.");

        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }
    public void validateInvalidAmountRemoteDPT()throws Exception{
        try{
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.InvalidAmount()), "Amount entered does not match amount in KPTN / reference no.");

        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }
    public void validateClaimedDomesticPayout()throws Exception{
        try{
            click(payoutPageObjects.PayoutTransaction(), "Payout Transaction");
            click(payoutPageObjects.UnremoteTransaction(), "Un-remote Transaction");
            click(payoutPageObjects.DomesticTransaction(), "Domestic Transaction");
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: e401a22)");

        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }
    public void validateClaimedRemoteDomesticPayout()throws Exception{
        try{
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
            type(payoutPageObjects.PayKTPN(), "KTPN Number", propertyReader.getproperty("KTPNnum"));
            type(payoutPageObjects.PayAmount(), "Amount", propertyReader.getproperty("InvalidAmount"));
            click(payoutPageObjects.SearchButton(), "Search Button");
            assertEqual(getText(payoutPageObjects.AmountClaimed()), "Sorry this transaction is already claimed. (version: e401a22)");

        }catch(Exception e){
            ExtentReporter.logFail(""+e);

        }
    }


}

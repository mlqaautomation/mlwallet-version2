package mlwallet.testSteps;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;
import mlwallet.testSteps.Login;
import utilities.yamlReader.yamlReader;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GCash extends Base_Steps{
    Login login = new Login();
    public double getWalletBalance() throws Exception {
        String balanceText = "";
        if (mobileGeneralMethod.isVisible(homePageObject.objEyeIcon(), "Eye Icon Visible")) {
            mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
            mobileGeneralMethod.waitSleep(3000);
            balanceText =  mobileGeneralMethod.getText(homePageObject.objAvailableBalance());
            LoggingUtils.info("Balance is = " + balanceText);
        } else {
            balanceText =  mobileGeneralMethod.getText(homePageObject.objAvailableBalance());
            LoggingUtils.info("Balance is = " + balanceText);
        }
        // Remove commas from the balance text and parse it as a double
        double balance = Double.parseDouble(balanceText.replace(",", ""));
        return balance;
    }
    public double parseDouble(String value)throws Exception {
        String cleanValue = value.replace(",", "").trim();
        return Double.parseDouble(cleanValue);
    }
    public void confirmGcashTransaction() throws Exception {
        mobileGeneralMethod.tap(gCashObjects.objGcashText(), "Gcash Icon Button");
        mobileGeneralMethod.tap(gCashObjects.objGcashSendMoneyText(), "Send Money To Gcash");
        mobileGeneralMethod.type(gCashObjects.objGcashMobileNumber(), "Mobile Number",propertyReader.getproperty("GcashMobileNo"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(gCashObjects.objAmountTextBox(),"Amount",propertyReader.getproperty("AmountInput"));
        mobileGeneralMethod.tap(gCashObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        if(mobileGeneralMethod.isVisible(gCashObjects.objProceedBtn(),"Proceed Button")){
            mobileGeneralMethod.tap(gCashObjects.objProceedBtn(),"Click Proceed");
        }
        mobileGeneralMethod.isVisible(gCashObjects.objConfirmDetailsPage(), "Confirm Details Page");
        mobileGeneralMethod.tap(gCashObjects.objConfirmBtn(), "Confirm Button");
        mobileGeneralMethod.tap(loginObject.objContinueBtn(), "Continue Button");
        mobileGeneralMethod.waitSleep(5000);
    }
    public void GCashSuccessfulTransaction_GC_SM_TC_76() throws Exception {
        login.loginWalletBranchTier();
        double prevBalance = getWalletBalance();
        confirmGcashTransaction();
        mobileGeneralMethod.isVisible(gCashObjects.objTransactionDetailsText(), "Transaction Details");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.verticalSwipe();
        String total = mobileGeneralMethod.getText(gCashObjects.objGcashTotal());
        String numericTotal = total.replaceAll("[^\\d.]", ""); // Remove non-numeric characters    
        double totalValue = parseDouble(numericTotal);
        mobileGeneralMethod.tap(gCashObjects.objBack_to_Home_Page(), "Back to Home Page");
        mobileGeneralMethod.waitSleep(5000);
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Available Balance")) {
            mobileGeneralMethod.verticalSwipeDown();
            double newBalance = getWalletBalance();
            double expectedBalance = prevBalance - totalValue;
            mobileGeneralMethod.assertionValidationdouble(newBalance, expectedBalance);
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Recent Transactions Header");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(historyObject.objSeeMoreBtn(),"See More Button");
            mobileGeneralMethod.waitSleep(10000);
            mobileGeneralMethod.isVisible(historyObject.objTransactionHistory(),"Transaction History Page");
            mobileGeneralMethod.tap(historyObject.objSendMoneyTab(),"Send Money Tab");
            mobileGeneralMethod.waitSleep(10000);
            mobileGeneralMethod.tap(historyObject.objFirstTransaction(),"First Transaction");
            String amountHistory = mobileGeneralMethod.getText(historyObject.objTotalAmount());
            String historyTotal = amountHistory.replaceAll("[^\\d.]", ""); // Remove non-numeric characters
            double amountHistoryValue = parseDouble(historyTotal);
            mobileGeneralMethod.assertionValidationdouble(totalValue, amountHistoryValue);
            LoggingUtils.info("GC_SM_TC_76(), Back Home Button In GCash View Recent Transaction Dashboard Page Validated");
            ExtentReporter.logPass("GC_SM_TC_76", "To Validate Back Home Button In GCash View Recent Transaction Dashboard Page");
            System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("GC_SM_TC_76", " Failed To Validate Back Home Button In GCash View Recent Transaction Dashboard Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
}

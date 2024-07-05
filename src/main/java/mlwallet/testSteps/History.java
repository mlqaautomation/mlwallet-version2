package mlwallet.testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class History extends Base_Steps{

    Login login = new Login();

//    public void mlWallet_TransactionHistory_Generic_Steps(String billModule, String transaction) throws Exception {
//        String PayBillsHistory =  mobileGeneralMethod.getText(historyObject.objBillHistory(billModule, transaction));
//        if (PayBillsHistory.equals(billModule))// "Pay Bills"
//        {
//            List<WebElement> values = findElements(historyObject.objPayBillsTransctionList1(billModule));
//            for (int i = 0; i < values.size(); i++) {
//                String billPayTransaction = values.get(i).getText();
//                LoggingUtils.info(billModule + " Transaction : " + billPayTransaction);
//                ExtentReporter.logPass(" ", billModule + " All Transactions : " + billPayTransaction);
//            }
//        } else if (PayBillsHistory.equals(transaction))// "No Recent Transaction"
//        {
//            LoggingUtils.info("No Recent Transactions Are Available for " + billModule + " Module");
//            ExtentReporter.logFail("", "No Recent Transactions Are Available for " + billModule + " Module");
//        }
//    }
    //----------Happy Path
    public void mlWallet_TransactionHistory_TH_TC_01() throws Exception {
        ExtentReporter.logInfo("TH_TC_01","MLWallet_TransactionHistory_Scenario");
        login.loginWalletBranchTier();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(historyObject.objRecentTransaction(),"Recent History");
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(historyObject.objSeeMoreBtn(), "See More Button");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionHistory(),"Page")) {
            LoggingUtils.info("TH_TC_01, All Transactions are displayed");
            ExtentReporter.logPass("TH_TC_01", "All Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_01", " Failed, All Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void SuccessfulRequestTransactionPage_TH_TC_30() throws Exception {
        ExtentReporter.logInfo("TH_TC_30","Successful Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objMonthBtn(),"Month Button");
            mobileGeneralMethod.isVisible(historyObject.objMonths(),"Month Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.type(historyObject.objSearch(), "Search", "Jun");
            mobileGeneralMethod.tap(historyObject.objJune(),"Select Month");
            mobileGeneralMethod.tap(historyObject.objYearBtn(),"Year Button");
            mobileGeneralMethod.isVisible(historyObject.objYears(),"Year Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.tap(historyObject.obj2024(),"Select Year");
            mobileGeneralMethod.tap(historyObject.objStartDateBtn(),"Start Date Button");
            mobileGeneralMethod.tap(historyObject.obj1(),"Select 1 Start Date Button");
            mobileGeneralMethod.tap(historyObject.objOkBtn(),"Okay Button");
            mobileGeneralMethod.tap(historyObject.objEndDateBtn(),"Start Date Button");
            mobileGeneralMethod.tap(historyObject.obj30(),"Select 30 End Date Button");
            mobileGeneralMethod.tap(historyObject.objOkBtn(),"Okay Button");
            mobileGeneralMethod.tap(historyObject.objSubmitRequestBtn(),"Submit Request Button");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(historyObject.objRequestAcceptTitle(),"Request Transaction Accepted");
            mobileGeneralMethod.isVisible(historyObject.objRequestAcceptBody(),"Request Transaction Accepted");
            mobileGeneralMethod.isVisible(historyObject.objGotItBtn(),"Got It Button");
            mobileGeneralMethod.tap(historyObject.objGotItBtn(),"Got It Button");
            LoggingUtils.info("TH_TC_30,Successful Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_30", "Successful Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_30", " Failed to Validate Successful Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }

    //----------Positive
    public void billsPayTransactionHHistory_TH_TC_02() throws Exception {
        ExtentReporter.logInfo("TH_TC_02", "Bills Pay Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objBillsPayTab(), "Bills Pay");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_02, Bills pay Transactions are displayed");
            ExtentReporter.logPass("TH_TC_02", "Bills pay Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_02", " Failed, Bills pay Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void buyLoadTransactionHistory_TH_TC_03() throws Exception {
        ExtentReporter.logInfo("TH_TC_03","Buy Eload Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objeLoadTab(), "eLoad");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_03, eLoad Transactions are displayed");
            ExtentReporter.logPass("TH_TC_03", "eLoad Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_03", " Failed, eLoad Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void sendMoneyTransactionHistory_TH_TC_04() throws Exception {
        ExtentReporter.logInfo("TH_TC_04","Send Money Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objSendMoneyTab(), "Send Money");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_04, Send Money Transactions are displayed");
            ExtentReporter.logPass("TH_TC_04", "Send Money Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_04", " Failed, Send Money Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void cashInTransactionHistory_TH_TC_05() throws Exception {
        ExtentReporter.logInfo("TH_TC_05","Cash In Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objCashInTab(), "Cash In");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_05, Cash In Transactions are displayed");
            ExtentReporter.logPass("TH_TC_05", "Cash In Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_05", " Failed, Cash In Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void cashOutTransactionHistory_TH_TC_06() throws Exception {
        ExtentReporter.logInfo("TH_TC_06","Cash Out Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objCashOutTab(), "Cash Out");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_06, Cash Out Transactions are displayed");
            ExtentReporter.logPass("TH_TC_06", "Cash Out Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_06", " Failed, Cash Out Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void receiveMoneyTransactionHistory_TH_TC_07() throws Exception {
        ExtentReporter.logInfo("TH_TC_07","Receive Money Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objReceiveMoneyTab(), "Receive Money");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_07, Receive Money Transactions are displayed");
            ExtentReporter.logPass("TH_TC_07", "Receive Money Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_07", " Failed, Receive Money Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void balanceAdjustmentTransactionHistory_TH_TC_08() throws Exception {
        ExtentReporter.logInfo("TH_TC_08","Balance Adjustment Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objBalanceAdjustmentTab(), "Balance Adjustment");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_08, Balance Adjustment Transactions are displayed");
            ExtentReporter.logPass("TH_TC_08", "Balance Adjustment Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_08", " Failed, Balance Adjustment Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void mlShopTransactionHistory_TH_TC_09() throws Exception {
        ExtentReporter.logInfo("TH_TC_09","ML Shop Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objMlShopTab(), "ML Shop");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_09, ML Shop Transactions are displayed");
            ExtentReporter.logPass("TH_TC_08", "ML Shop Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_08", " Failed, ML Shop Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void TopUpGamesTransactionHistory_TH_TC_10() throws Exception {
        ExtentReporter.logInfo("TH_TC_10","Top Up Games Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objTopUpGamesTab(), "Top Up Games");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_10, Top Up Games Transactions are displayed");
            ExtentReporter.logPass("TH_TC_10", "Top Up Games Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_10", " Failed, Top Up Games Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void PaymentsTransactionHistory_TH_TC_11() throws Exception {
        ExtentReporter.logInfo("TH_TC_11","Payments Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objPaymentsTab(), "Payments");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_11, Top Up Games Transactions are displayed");
            ExtentReporter.logPass("TH_TC_11", "Payments Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_11", " Failed, Payments Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void ShopSafeTransactionHistory_TH_TC_12() throws Exception {
        ExtentReporter.logInfo("TH_TC_12","Shop Safe Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objShopSafeTab(), "Shop Safe");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_12, Shop Safe Transactions are displayed");
            ExtentReporter.logPass("TH_TC_12", "Shop Safe Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_12", " Failed, Shop Safe Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void RewardsTransactionHistory_TH_TC_13() throws Exception {
        ExtentReporter.logInfo("TH_TC_13","Rewards Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objRewardsTab(), "Rewards");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_13, Shop Safe Transactions are displayed");
            ExtentReporter.logPass("TH_TC_13", "Rewards Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_13", " Failed, Rewards Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void SalaryLoansTransactionHistory_TH_TC_14() throws Exception {
        ExtentReporter.logInfo("TH_TC_14","Salary Loans Transaction History");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for verification
        mobileGeneralMethod.tap(historyObject.objSalaryLoansTab(), "Salary Loans");
        mobileGeneralMethod.waitSleep(10000);
        if(mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"First Transaction")) {
            LoggingUtils.info("TH_TC_14, Salary Loans Transactions are displayed");
            ExtentReporter.logPass("TH_TC_14", "Salary Loans Transactions are displayed");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_14", " Failed, Salary Loans Transactions are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryUIValidation_TH_TC_15() throws Exception {
        ExtentReporter.logInfo("TH_TC_15","Transaction History UI Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        if (mobileGeneralMethod.isVisible(historyObject.objAllTab(),"Tab")) {
            mobileGeneralMethod.isVisible(historyObject.objBillsPayTab(),"Tab");
            mobileGeneralMethod.isVisible(historyObject.objeLoadTab(),"Tab");
            mobileGeneralMethod.isVisible(historyObject.objSendMoneyTab(),"Tab");
//            scrollToFirstHorizontalScrollableElement("Cash Out");
            mobileGeneralMethod.isVisible(historyObject.objCashInTab(),"Tab");
            mobileGeneralMethod.isVisible(historyObject.objCashOutTab(),"Tab");
            mobileGeneralMethod.isVisible(historyObject.objReceiveMoneyTab(),"Tab");
//            scrollToFirstHorizontalScrollableElement("ML Shop");
            mobileGeneralMethod.isVisible(historyObject.objBalanceAdjustmentTab(),"Tab");
            mobileGeneralMethod.isVisible(historyObject.objMlShopTab(),"Tab");
            LoggingUtils.info("TH_TC_15,Transaction History UI Validated");
            ExtentReporter.logPass("TH_TC_15", "'TH_TC_10',Transaction History UI Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_15", " Failed, Transaction History are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryBillsPayTransactionDetailsValidation_TH_TC_16() throws Exception {
        ExtentReporter.logInfo("TH_TC_16","Transaction History BillsPay Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objBillsPayTab(),"Tab");
        if (mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(), "First Transaction")) {
            mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
            mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page");
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objBiller(),"Biller");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("TH_TC_16,Transaction History BillsPay Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_16", "Transaction History BillsPay Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        } else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_16", " Failed, Transaction History BillsPay are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryELoadTransactionDetailsValidation_TH_TC_17() throws Exception {
        ExtentReporter.logInfo("TH_TC_17","Transaction History ELoad Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objeLoadTab(),"Tab");
        if (mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(), "First Transaction")) {
            mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
            mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page");
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objLoadType(),"Load Type");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("TH_TC_17,Transaction History ELoad Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_17", "Transaction History ELoad Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_17", " Failed, Transaction History ELoad are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistorySendMoneyWalletToWalletTransactionDetailsValidation_TH_TC_18() throws Exception {
        ExtentReporter.logInfo("TH_TC_18","Transaction History Send Money Wallet To Wallet Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(historyObject.objSendMoneyTab(),"Tab");
        if (mobileGeneralMethod.isVisible(historyObject.objFirstTransaction(),"Transaction")) {
            mobileGeneralMethod.tap(historyObject.objFirstTransaction(),"Transaction");
            mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page");
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objSenderName(),"Sender Name");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalAmount(),"Total Amount");
            LoggingUtils.info("TH_TC_18,Transaction History Send Money Wallet To Wallet Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_18", "Transaction History Send Money Wallet To Wallet Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_17", " Failed, Transaction History Send Money Wallet To Wallet are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryCashInTransactionDetailsValidation_TH_TC_19() throws Exception {
        ExtentReporter.logInfo("TH_TC_19","Transaction History Cash In Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for Verification
        mobileGeneralMethod.tap(historyObject.objCashInTab(), "Tab");
        mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objTransactionType(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalCashIn(),"Total Cash In");
            LoggingUtils.info("TH_TC_19,Transaction History Cash In Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_19", "Transaction History Cash In Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_19", " Failed, Transaction History Cash In Wallet To Wallet are not displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryCashOutTransactionDetailsValidation_TH_TC_20() throws Exception {
        ExtentReporter.logInfo("TH_TC_20","Transaction History Cash Out Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for Verification
        mobileGeneralMethod.tap(historyObject.objCashOutTab(),"Tab");
        mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objTransactionType(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objAmount(),"Amount");
            mobileGeneralMethod.isVisible(historyObject.objServiceFee(),"Service Fee");
            mobileGeneralMethod.isVisible(historyObject.objTotalCashOut(),"Total Cash Out");
            LoggingUtils.info("TH_TC_20,Transaction History Cash Out Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_20", "Transaction History Cash Out Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_20", " Failed, Transaction History Cash Out Transaction Details");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryReceiveMoneyTransactionDetailsValidation_TH_TC_21() throws Exception {
        ExtentReporter.logInfo("TH_TC_21","Transaction History Receive Money Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for Verification
        mobileGeneralMethod.tap(historyObject.objReceiveMoneyTab(),"Tab");
        mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(),"Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(),"Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            mobileGeneralMethod.isVisible(historyObject.objSenderName(),"Sender Name");
            LoggingUtils.info("TH_TC_21,Transaction History Receive Money Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_21", "Transaction History Receive Money Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_21", " Failed, Transaction History Receive Money Transaction Details");
            System.out.println("-----------------------------------------------------------");
        }

    }
    //----------Positive
    public void transactionHistoryMLShopTransactionDetailsValidation_TH_TC_22() throws Exception {
        ExtentReporter.logInfo("TH_TC_22","Transaction History ML Shop Transaction Details Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.horizontalSwipe(); // for Verification
        mobileGeneralMethod.tap(historyObject.objMlShopTab(),"Tab");
        mobileGeneralMethod.tap(historyObject.objFirstTransaction(), "First Transaction");
        if (mobileGeneralMethod.isVisible(historyObject.objTransactionDetails(),"Page")) {
            mobileGeneralMethod.isVisible(historyObject.objReferenceNumberInTransactionDetails(),"Reference Number");
            mobileGeneralMethod.isVisible(historyObject.objDate(), "Date");
            mobileGeneralMethod.isVisible(historyObject.objReceiverName(), "Receiver Name");
            mobileGeneralMethod.isVisible(historyObject.objReceiverMobileNo(),"Receiver's Mobile Number");
            mobileGeneralMethod.isVisible(historyObject.objPaymentMethod(),"Payment Method");
            LoggingUtils.info("TH_TC_22,Transaction History ML Shop Transaction Details Validated");
            ExtentReporter.logPass("TH_TC_22", "Transaction History ML Shop Transaction Details Validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            mobileGeneralMethod.isVisible(historyObject.objNoHistoryTransaction(),"No Recent Transaction");
            LoggingUtils.info("No Recent Transaction");
            ExtentReporter.logFail("TH_TC_22", " Failed, Transaction History ML Shop Transaction Details Details");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void transactionHistoryRedirectToRequestTransactionPage_TH_TC_23() throws Exception {
        ExtentReporter.logInfo("TH_TC_23","History Redirect To Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.isVisible(historyObject.objBack(),"Back Button");
            LoggingUtils.info("TH_TC_23,History Redirect To Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_23", "History Redirect To Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_23", " Failed, History Redirect To Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Negative
    public void requestTransactionPageRedirectHistoryByClickBackButton_TH_TC_24() throws Exception {
        ExtentReporter.logInfo("TH_TC_24","Request Transaction Page Redirect History By Click Back Button");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objBack(),"Back Button");
            mobileGeneralMethod.isVisible(historyObject.objTransactionHistory(),"Transaction History");
            LoggingUtils.info("TH_TC_24,Request Transaction Page Redirect History By Click Back Button Validated");
            ExtentReporter.logPass("TH_TC_24", "Request Transaction Page Redirect History By Click Back Button Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_24", " Failed, Request Transaction Page Redirect History By Click Back Button");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void RequestTransactionValidationPage(){
        mobileGeneralMethod.isVisible(historyObject.objBack(),"Back");
        mobileGeneralMethod.isVisible(historyObject.objTitleRequestTransact(),"Title Request Transaction");
        mobileGeneralMethod.isVisible(historyObject.objBodyRequestTransact(),"Body Request Transaction");
        mobileGeneralMethod.isVisible(historyObject.objMonth(),"Month");
        mobileGeneralMethod.isVisible(historyObject.objYear(),"Year");
        mobileGeneralMethod.isVisible(historyObject.objStartDate(),"Start Date");
        mobileGeneralMethod.isVisible(historyObject.objEndDate(),"End Date");
        mobileGeneralMethod.isVisible(historyObject.objSubmitRequestBtn(),"Submit Request Button");
    }
    //----------Positive
    public void validateRequestTransactionPage_TH_TC_25() throws Exception {
        ExtentReporter.logInfo("TH_TC_25","Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            RequestTransactionValidationPage();
            LoggingUtils.info("TH_TC_25,Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_25", "Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_25", " Failed to Validate Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void validateSelectMonthRequestTransactionPage_TH_TC_26() throws Exception {
        ExtentReporter.logInfo("TH_TC_26","Select Month Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objMonthBtn(),"Month Button");
            mobileGeneralMethod.isVisible(historyObject.objMonths(),"Month Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.type(historyObject.objSearch(), "Search", "Jun");
            mobileGeneralMethod.tap(historyObject.objJune(),"Select Month");
            LoggingUtils.info("TH_TC_26,Select Month Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_26", "Select Month Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_26", " Failed to Validate Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Positive
    public void validateSelectYearRequestTransactionPage_TH_TC_27() throws Exception {
        ExtentReporter.logInfo("TH_TC_27","Select Year Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objMonthBtn(),"Month Button");
            mobileGeneralMethod.isVisible(historyObject.objMonths(),"Month Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.type(historyObject.objSearch(), "Search", "Jun");
            mobileGeneralMethod.tap(historyObject.objJune(),"Select Month");
            mobileGeneralMethod.tap(historyObject.objYearBtn(),"Year Button");
            mobileGeneralMethod.isVisible(historyObject.objYears(),"Year Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.tap(historyObject.obj2024(),"Select Year");
            LoggingUtils.info("TH_TC_27,Select Year Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_27", "Select Year Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_27", " Failed to Validate Select Year Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Negative
    public void cancelStartDateTransactionPage_TH_TC_28() throws Exception {
        ExtentReporter.logInfo("TH_TC_28","Cancel Start Date Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objMonthBtn(),"Month Button");
            mobileGeneralMethod.isVisible(historyObject.objMonths(),"Month Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.type(historyObject.objSearch(), "Search", "Jun");
            mobileGeneralMethod.tap(historyObject.objJune(),"Select Month");
            mobileGeneralMethod.tap(historyObject.objYearBtn(),"Year Button");
            mobileGeneralMethod.isVisible(historyObject.objYears(),"Year Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.tap(historyObject.obj2024(),"Select Year");
            mobileGeneralMethod.tap(historyObject.objStartDateBtn(),"Start Date Button");
            mobileGeneralMethod.tap(historyObject.objCancelsBtn(),"Cancel Button");
            mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header");
            LoggingUtils.info("TH_TC_28,Cancel Start Date Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_28", "Cancel Start Date Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_28", " Failed to Validate Cancel Start Date Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    //----------Negative
    public void startDateGreaterThanEndDateRequestTransactionPage_TH_TC_29() throws Exception {
        ExtentReporter.logInfo("TH_TC_29","Start Date Greater Than End Date Request Transaction Page Validation");
        mlWallet_TransactionHistory_TH_TC_01();
        mobileGeneralMethod.tap(historyObject.objRequestTransactBtn(),"Request Button");
        if (mobileGeneralMethod.isVisible(historyObject.objHeaderRequestTransact(),"Request Transaction Header")){
            mobileGeneralMethod.tap(historyObject.objMonthBtn(),"Month Button");
            mobileGeneralMethod.isVisible(historyObject.objMonths(),"Month Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.type(historyObject.objSearch(), "Search", "Jun");
            mobileGeneralMethod.tap(historyObject.objJune(),"Select Month");
            mobileGeneralMethod.tap(historyObject.objYearBtn(),"Year Button");
            mobileGeneralMethod.isVisible(historyObject.objYears(),"Year Header");
            mobileGeneralMethod.isVisible(historyObject.objSearch(),"Search");
            mobileGeneralMethod.tap(historyObject.obj2024(),"Select Year");
            mobileGeneralMethod.tap(historyObject.objStartDateBtn(),"Start Date Button");
            mobileGeneralMethod.tap(historyObject.obj30(),"Select 30 Start Date Button");
            mobileGeneralMethod.tap(historyObject.objOkBtn(),"Okay Button");
            mobileGeneralMethod.tap(historyObject.objEndDateBtn(),"Start Date Button");
            mobileGeneralMethod.tap(historyObject.obj1(),"Select 1 End Date Button");
            mobileGeneralMethod.tap(historyObject.objOkBtn(),"Okay Button");
            mobileGeneralMethod.tap(historyObject.objSubmitRequestBtn(),"Submit Request Button");
            mobileGeneralMethod.waitSleep(5000);
            mobileGeneralMethod.isVisible(historyObject.objStartDateGreaterThanEndDate(),"Start Date Greater Than End Date Note");
            mobileGeneralMethod.isVisible(historyObject.objOkButton(),"Okay Button");
            mobileGeneralMethod.tap(historyObject.objOkButton(),"Okay Button");
            LoggingUtils.info("TH_TC_29,Start Date Greater Than End Date Request Transaction Page Validated");
            ExtentReporter.logPass("TH_TC_29", "Start Date Greater Than End Date Request Transaction Page Validated");
            System.out.println("-----------------------------------------------------------");
        }else{
            ExtentReporter.logFail("TH_TC_29", " Failed to Validate Start Date Greater Than End Date Request Transaction Page");
            System.out.println("-----------------------------------------------------------");
        }
    }

}

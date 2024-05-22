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
public class KwartaPadala_Wallet extends Base_Steps{

    Login login = new Login();
    public void enterAmountAndSendToMLWallet() throws Exception {
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objToMLWalletUser(), "MLWallet User")) {
            mobileGeneralMethod.type(kwartaPadalaObjects.objAmountTxtField(), "Amount",propertyReader.getproperty("AmountInput"));
            mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
            mobileGeneralMethod.waitSleep(3000);
            mobileGeneralMethod.tap(kwartaPadalaObjects.objMLWalletBalance(), "MLWallet Balance Button");
            mobileGeneralMethod.waitSleep(8000);
            mobileGeneralMethod.isVisible(kwartaPadalaObjects.objConfirmDetails(), "Confirm Details Page");
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.tap(kwartaPadalaObjects.objSendPHPBtn(), "Send PHP Button");
        }
    }
    public void kwartaPadalaViaMLWalletSuccessfulTransaction_STW_TC_02() throws Exception {
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objSendTransferBtn(), "Send Transfer Button");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoney(),  "Send Money Page");
        mobileGeneralMethod.tap(kwartaPadalaObjects.objToAMLWalletUser(), "MLWallet User Button");
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.type(kwartaPadalaObjects.objMobileNumber(), "Mobile Number",propertyReader.getproperty("MobileNo"));
        mobileGeneralMethod.tap(kwartaPadalaObjects.objNextBtn(), "Next Button");
        mobileGeneralMethod.waitSleep(3000);
        enterAmountAndSendToMLWallet();
        mobileGeneralMethod.waitSleep(10000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(20000);
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWallet(), "Send Money MLWallet Message");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletPHP(), "Amount");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objSendMoneyMLWalletDate(), "Date");
        mobileGeneralMethod.isVisible(kwartaPadalaObjects.objMLWalletReferenceNumber(), "Reference Number");
        String sReferenceNumber = mobileGeneralMethod.getText(kwartaPadalaObjects.objMLWalletReferenceNumber());
        System.out.println(sReferenceNumber);
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.tap(kwartaPadalaObjects.objBackToHomeBtn(), "Back To Home Button");
        Thread.sleep(3000);
        mobileGeneralMethod.verticalSwipeDown();
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.waitSleep(3000);
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),  "Recent Transactions");
        mobileGeneralMethod.isVisible(homePageObject.objWalletToWallet(), "Wallet To Wallet");
        mobileGeneralMethod.tap(homePageObject.objWalletToWallet(), "Wallet To Wallet");
        if (mobileGeneralMethod.isVisible(kwartaPadalaObjects.objReferenceNumberInTransactionDetails(), "Page")) {
               String sReferenceNumberInWalletToWallet = mobileGeneralMethod.getText(kwartaPadalaObjects.objReferenceNumberInTransactionDetails());
               System.out.println(sReferenceNumberInWalletToWallet);
               mobileGeneralMethod.assertionValidation(sReferenceNumberInWalletToWallet, sReferenceNumber);
               LoggingUtils.info("STW_TC_02(), Successfully Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
               ExtentReporter.logPass("STW_TC_02", "STW_TC_02(), Successfully Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
               System.out.println("-----------------------------------------------------------");
        }
        else{
            ExtentReporter.logFail("STW_TC_02", "STW_TC_02(), Failed Amount sent from Wallet to Wallet to Recently added favorite and Transaction Details is validated");
            System.out.println("-----------------------------------------------------------");

        }
    }
}

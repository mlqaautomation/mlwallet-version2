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
public class TopUpGames extends Base_Steps{

    Login login = new Login();

    public void selectGameAndLoadType() throws Exception {
          mobileGeneralMethod.tap(topUpGamesObjects.objValorant(),"Game");
          mobileGeneralMethod.waitSleep(3000);
          mobileGeneralMethod.tap(topUpGamesObjects.objBuyPHP149(),"Load Type");
          mobileGeneralMethod.waitSleep(5000);

    }
    public void inputRequiredDataAndContinue() throws Exception {
         mobileGeneralMethod.type(topUpGamesObjects.objGameUserID(),"Game User ID Input Field", propertyReader.getproperty("GameUserID"));
         mobileGeneralMethod.type(topUpGamesObjects.objEmailAddress(),"Email ID Input Field", propertyReader.getproperty("Email"));
         mobileGeneralMethod.type(topUpGamesObjects.objMobileNumber(),"Mobile Number", propertyReader.getproperty("GameMobileNumber"));
         mobileGeneralMethod.verticalSwipe();
         mobileGeneralMethod.waitSleep(3000);
         mobileGeneralMethod.tap(topUpGamesObjects.objContinue(),"Button");
         mobileGeneralMethod.waitSleep(5000);
    }
    public void topUpGamesSuccessfulTransaction_TUG_TC_06() throws Exception {
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
        mobileGeneralMethod.waitSleep(3000);
        String sAvailableBalance = mobileGeneralMethod.getText(topUpGamesObjects.objAvailableBalance());
        mobileGeneralMethod.tap(topUpGamesObjects.objTopUpGames(),"Icon");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.isVisible(topUpGamesObjects.objTopGamesPage(), "TopUp Games Page");
        selectGameAndLoadType();
        inputRequiredDataAndContinue();
        mobileGeneralMethod.tap(topUpGamesObjects.objConfirm(),"button");
        mobileGeneralMethod.waitSleep(8000);
        mobileGeneralMethod.tap(mlWalletPageObjects.continue2_btn(),"Continue Button");
        mobileGeneralMethod.waitSleep(10000);
        if( mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionDetails(),"Page")) {
             mobileGeneralMethod.isVisible(topUpGamesObjects.objTransactionCode(),"Transaction Code");
             mobileGeneralMethod.isVisible(topUpGamesObjects.objGameUserIDInTransactionDetails(),"Game User ID");
             mobileGeneralMethod.isVisible(topUpGamesObjects.objRedeemCode(),"Redeem code");
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.verticalSwipe();
             mobileGeneralMethod.tap(topUpGamesObjects.objBackToHome(),"Button");
             mobileGeneralMethod.waitSleep(5000);
             mobileGeneralMethod.verticalSwipeDown();
             mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
             mobileGeneralMethod.waitSleep(3000);
             String sAvailableBalanceAfterTopUp = mobileGeneralMethod.getText(topUpGamesObjects.objAvailableBalance());
             mobileGeneralMethod.assertionValidation(sAvailableBalance, sAvailableBalanceAfterTopUp);
             LoggingUtils.info("TUG_TC_06, TopUp Games successful Load Transaction validated");
             ExtentReporter.logPass("TUG_TC_06", "TUG_TC_06, TopUp Games successful Load Transaction validated");
             System.out.println("-----------------------------------------------------------");
        }
        else{
             ExtentReporter.logFail("TUG_TC_06", "TUG_TC_06, TopUp Games Failed to Load Transaction validate!");
             System.out.println("-----------------------------------------------------------");
        }
    }
}

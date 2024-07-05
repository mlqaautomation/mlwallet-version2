package mlwallet.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.time.Duration;

public class Logout extends Base_Steps{
    public Logout(){
        super();
    }
    Login login = new Login();

    public void mlWalletLogout() throws Exception {
        mobileGeneralMethod.isVisible(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        Thread.sleep(1000);
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Link")) {
            LoggingUtils.info("Application Logged Out Successfully");
        } else {
            LoggingUtils.info("Application not get Logged Out Successfully");
        }
    }

    public void logOUtPopUpValidation_Lout_TC_05() throws Exception {
        ExtentReporter.logInfo("Lout_TC_05","LogOut Popup Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        mobileGeneralMethod.waitSleep(3000);
        if (mobileGeneralMethod.isVisible(logoutObject.objLogoOutPopupMsg(),"Pop up Message")) {
            String sLogOutPopupMsg = mobileGeneralMethod.getText(logoutObject.objLogoOutPopupMsg());
            String sExpectedErrorMsg = "Are you sure you would like to logout?";
            mobileGeneralMethod.assertionValidation(sLogOutPopupMsg, sExpectedErrorMsg);
            mobileGeneralMethod.isVisible(logoutObject.objLogoutBtn(),"Button");
            mobileGeneralMethod.isVisible(logoutObject.objCancelBtn(),"Button");
            LoggingUtils.info("Lout_TC_05, LogOut Popup validated");
            ExtentReporter.logPass("Lout_TC_05", "LogOut Popup validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lout_TC_05", " Failed to validate LogOut Popup");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void logOutPopUpCancelBtnValidation_Lout_TC_06() throws Exception {
        ExtentReporter.logInfo("Lout_TC_06","LogOut PopUp Cancel Button Validation");
        logOUtPopUpValidation_Lout_TC_05();
        mobileGeneralMethod.tap(logoutObject.objCancelBtn(),"Button");
        if (mobileGeneralMethod.isVisible(logoutObject.objHome(),"Button")) {
            LoggingUtils.info("Lout_TC_06, Popup disappeared after clicking on Cancel Button, LogOut PopUp Cancel Button validated");
            ExtentReporter.logPass("Lout_TC_06", "Popup disappeared after clicking on Cancel Button, LogOut PopUp Cancel Button validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lout_TC_06", " Failed to validate Popup disappeared after clicking on Cancel Button");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void logOutPopUpLogOutBtnValidation_Lout_TC_07() throws Exception {
        ExtentReporter.logInfo("Lout_TC_07","LogOut PopUp LogOut Btn Validation");
        logOUtPopUpValidation_Lout_TC_05();
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Page")) {
            LoggingUtils.info("Lout_TC_07, Popup disappeared after clicking on Cancel Button, LogOut PopUp Cancel Button validated");
            ExtentReporter.logPass("Lout_TC_07", "Popup disappeared after clicking on Cancel Button, LogOut PopUp Cancel Button validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("TH_TC_21", " Failed to Validate Popup disappeared after clicking on Cancel Button");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void logoutChangeNumberUIValidation_Lout_TC_08() throws Exception {
        ExtentReporter.logInfo("Lout_TC_08","Log Out Change Number UI page Validation");
        logOUtPopUpValidation_Lout_TC_05();
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Page")) {
            mobileGeneralMethod.isVisible(loginObject.objTroubleSigningIn(),"Link");
            mobileGeneralMethod.isVisible(loginObject.objBranchLocator(),"Link");
            mobileGeneralMethod.isVisible(loginObject.objAppVersionChangeNumber(),"App Version");
            LoggingUtils.info("Lout_TC_08, Log Out Change Number UI page validated");
            ExtentReporter.logPass("Lout_TC_08", "Log Out Change Number UI page validated");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lout_TC_08", " Failed to Validate Log Out Change Number UI page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void logInWithChangeNumber_Lout_TC_09() throws Exception {
        ExtentReporter.logInfo("Lout_TC_09","Log In With Change Number");
        login.loginWalletBranchTier();
        mlWalletLogout();
        mobileGeneralMethod.tap(logoutObject.objChangeNumber(),"Link");
        login.loginWalletFullyTier();
        if (mobileGeneralMethod.isVisible(loginObject.objAvailableBalance(),"Text")) {
            LoggingUtils.info("Lout_TC_09,Application Logged In Successfully with Change Number");
            ExtentReporter.logPass("Lout_TC_09", "Application Logged In Successfully with Change Number");
            System.out.println("-----------------------------------------------------------");
        }else {
            ExtentReporter.logFail("Lout_TC_09", " Failed to Validate Application Logged In Successfully with Change Number");
            System.out.println("-----------------------------------------------------------");
        }
    }
}

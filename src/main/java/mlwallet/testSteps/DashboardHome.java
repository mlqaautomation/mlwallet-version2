package mlwallet.testSteps;

import org.openqa.selenium.WebElement;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

import java.util.List;

public class DashboardHome extends Base_Steps{
    Login login = new Login();
    public DashboardHome(){
        super();
    }

    public void verificationTierPerksPageValidation() throws Exception {
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceText(),"Header");
        mobileGeneralMethod.isVisible(homePageObject.objMaxBalanceAmount(),"Max Balance");
        mobileGeneralMethod.isVisible(homePageObject.objSendingLimitsCashOut(),"Header");
//        List<WebElement> values = findElements(homePageObject.objSendingLimitTransactionTypeAndAmount());
//        for (int i = 0; i < values.size(); i++) {
//            if (i % 2 == 0) {
//                String sTransactionType = values.get(i).getText();
//                LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//                ExtentReporter.logInfo(" ", "Transaction Type : " + sTransactionType + " is displayed");
//            }
//            if (i % 2 != 0) {
//                String sAmountRange = values.get(i).getText();
//                LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                ExtentReporter.logInfo(" ", "Amount Range : " + sAmountRange + " is displayed");
//            }
//        }
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objReceivingLimitsCashIn(),"Header");
//        List<WebElement> values1 = findElements(homePageObject.objReceivingLimitsTransactionTypeAndAmount);
//        for (int i = 0; i < values1.size(); i++) {
//            if (i % 2 == 0) {
//                String sTransactionType = values1.get(i).getText();
//                LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//                ExtentReporter.logInfo(" ", "Transaction Type : " + sTransactionType + " is displayed");
//            }
//            if (i % 2 != 0) {
//                String sAmountRange = values1.get(i).getText();
//                LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                ExtentReporter.logInfo(" ", "Amount Range : " + sAmountRange + " is displayed");
//            }
//        }
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objPurchaseLimits(),"Header");
//        List<WebElement> values2 = findElements(homePageObject.objPurchaseLimitsTransactionTypeAndAmount);
//        for (int i = 0; i < values2.size(); i++) {
//            if (i % 2 == 0) {
//                String sTransactionType = values2.get(i).getText();
//                LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//                ExtentReporter.logInfo(" ", "Transaction Type : " + sTransactionType + " is displayed");
//            }
//            if (i % 2 != 0) {
//                String sAmountRange = values2.get(i).getText();
//                LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                ExtentReporter.logInfo(" ", "Amount Range : " + sAmountRange + " is displayed");
//            }
//        }
    }
    public void mlWalletHomePageUIValidation_HD_TC_01() throws Exception {
       ExtentReporter.logInfo("","ML Wallet Home Page UI Validation");
        login.loginWalletFullyTier();
        if (mobileGeneralMethod.isVisible(homePageObject.objAvailableBalanceHeader(),"Header")) {
            mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
            mobileGeneralMethod.isVisible(homePageObject.objAvailableBalance(),"Available Balance");
            mobileGeneralMethod.isVisible(homePageObject.objCashInIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objSendTransferIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objCashOutIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objPayBillsIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objBuyELoadIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objShopItemsIcon(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objMLLoans(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objUseQR(),"Options");
            mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Header");
            mobileGeneralMethod.verticalSwipe();
//            List<WebElement> values = findElements(homePageObject.objTransactions);
//            for (int i = 4; i < values.size(); i += 4) {
//                String sTransactionType = values.get(i).getText();
//                LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//               ExtentReporter.logInfo(" ", "Transaction Type : " + sTransactionType + " is displayed");
//            }
//            for (int i = 2; i < values.size(); i += 4) {
//                String sAmount = values.get(i).getText();
//                LoggingUtils.info("Amount : " + sAmount + " is displayed");
//               ExtentReporter.logInfo(" ", "Amount : " + sAmount + " is displayed");
//            }
            mobileGeneralMethod.verticalSwipe();
            mobileGeneralMethod.isVisible(homePageObject.objSeeMore(),"Button");
            LoggingUtils.info("HD_TC_01, ML Wallet Home Page UI Validated");
            ExtentReporter.logPass("HD_TC_01", "HD_TC_01, ML Wallet Home Page UI Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletLogOutFromHomePage_HD_TC_02() throws Exception {
       ExtentReporter.logInfo("","ML Wallet Logout from Home Page Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button");
        mobileGeneralMethod.waitSleep(1000);
        mobileGeneralMethod.tap(logoutObject.objLogoutBtn(),"Button on Popup");
        if (mobileGeneralMethod.isVisible(logoutObject.objChangeNumber(),"Page")) {
            LoggingUtils.info("HD_TC_02, ML Wallet Application Logged out from Home Page Validated");
            ExtentReporter.logPass("HD_TC_02", "HD_TC_02, ML Wallet Application Logged out from Home Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletSettingsNavigationFromHomePage_HD_TC_03() throws Exception {
       ExtentReporter.logInfo("","ML Wallet Settings Navigation from Hom Page");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objProfileIcon(), "Profile Icon");
        if (mobileGeneralMethod.isVisible(settingsObjects.objSettings(),"Page")) {
            mobileGeneralMethod.isVisible(settingsObjects.objAccountDetails(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objChangeMLPin(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objBiometricsLogin(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objAccountRecovery(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objNotification(),"Option");
            mobileGeneralMethod.isVisible(settingsObjects.objDeleteAccount(),"Option");
            LoggingUtils.info("HD_TC_03, ML Wallet Settings Navigation from Hom Page Validated");
            ExtentReporter.logPass("HD_TC_03", "HD_TC_03, ML Wallet Settings Navigation from Hom Page Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageEyeIconValidation_HD_TC_04() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Eye Icon Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
        mobileGeneralMethod.isVisible(homePageObject.objAvailableBalance(),"Available Balance");
        mobileGeneralMethod.tap(homePageObject.objEyeIcon(), "Eye Icon");
        mobileGeneralMethod.isVisible(homePageObject.objHiddenAvailableBalance(),"Available Balance");
        LoggingUtils.info("HD_TC_04, ML Wallet Home Page Eye Icon Validated");
        ExtentReporter.logPass("HD_TC_04", "HD_TC_04, ML Wallet Home Page Eye Icon Validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void mlWalletAccountTierLevelVerification_HD_TC_05() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Account Tier Level Verification");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_05, ML Wallet Account Tier Level Verification");
            ExtentReporter.logPass("HD_TC_05", "HD_TC_05, ML Wallet Account Tier Level Verification");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageRecentTransaction_HD_TC_06() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Recent Transaction validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.isVisible(homePageObject.objRecentTransactions(),"Header");
        mobileGeneralMethod.verticalSwipe();
//        List<WebElement> values = findElements(homePageObject.objTransactions);
//
//        for (int i = 4; i < values.size(); i += 4) {
//            String sTransactionType = values.get(i).getText();
//            LoggingUtils.info("Transaction Type : " + sTransactionType + " is displayed");
//           ExtentReporter.logInfo(" ", "Transaction Type : " + sTransactionType + " is displayed");
//        }
//        for (int i = 2; i < values.size(); i += 4) {
//            String sAmount = values.get(i).getText();
//            LoggingUtils.info("Amount : " + sAmount + " is displayed");
//           ExtentReporter.logInfo(" ", "Amount : " + sAmount + " is displayed");
//        }
        mobileGeneralMethod.verticalSwipe();
        mobileGeneralMethod.isVisible(homePageObject.objSeeMore(),"Button");
        LoggingUtils.info("HD_TC_06, ML Wallet Home Page Recent Transaction validated");
        ExtentReporter.logPass("HD_TC_06", "HD_TC_06, ML Wallet Home Page Recent Transaction validated");
        System.out.println("-----------------------------------------------------------");
    }
    public void mlWalletHomePageWithdrawCash_HD_TC_07() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page WithDraw Cash");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objTransaction(),"Option");
        mobileGeneralMethod.tap(homePageObject.objWithdrawCash(),"Option");
        if (mobileGeneralMethod.isVisible(cashOutViaBranchObjects.objCashOutPage(),"Page")) {
            LoggingUtils.info("HD_TC_07, After clicking on Withdraw cash from Hamburger menu of Home Page, Application Navigated directly to CashOut Page is validated");
            ExtentReporter.logPass("HD_TC_07", "HD_TC_07, After clicking on Withdraw cash from Hamburger menu of Home Page, Application Navigated directly to CashOut Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageTopUpMLWallet_HD_TC_08() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Top Up ML Wallet");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objTransaction(),"Option");
        mobileGeneralMethod.tap(homePageObject.objTopUpMLWallet(),"Option");
        if (mobileGeneralMethod.isVisible(cashInViaBranchObjects.objBranchCashIn(),"Page")) {
            LoggingUtils.info("HD_TC_08, After clicking on Top Up ML Wallet from Hamburger menu of Home Page, Application Navigated directly to CashIn ML Branch Page is validated");
            ExtentReporter.logPass("HD_TC_08", "HD_TC_08, After clicking on Top Up ML Wallet from Hamburger menu of Home Page, Application Navigated directly to CashIn ML Branch Page is validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageShopHD_TC_09() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Shop");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(homePageObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objShop(),"Option");
        mobileGeneralMethod.waitSleep(1000);
//        if (mobileGeneralMethod.isVisible(shopSafeObjects.objMLShopPage(), getTextVal(MLWalletShopItemsPage.objMLShopPage, "Page"))) {
//            LoggingUtils.info("HD_TC_09, After clicking on Shop from Hamburger menu of Home Page, Application Navigated directly ML Shop Page is validated");
//            ExtentReporter.logPass("HD_TC_09", "HD_TC_09, After clicking on Shop from Hamburger menu of Home Page, Application Navigated directly to ML Shop Page is validated");
//            System.out.println("-----------------------------------------------------------");
//        }
    }
    public void mlWalletHomePageKwartaPadalaRatesValidation_HD_TC_10() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Kwarta Padala Rates Validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objKwartaPadalaRatesBtn(), "Kwarta Padala Rates");
        if (mobileGeneralMethod.isVisible(homePageObject.objKwartaPadalaRates(), "Kwarta Padala Rates")) {
//            List<WebElement> values = findElements(homePageObject.objKwartaPadalaRates);
//            for (int i = 0; i < values.size(); i++) {
//                if (i % 2 != 0) {
//                    String sRates = values.get(i).getText();
//                    LoggingUtils.info("Rates : " + sRates + " is displayed");
//                   ExtentReporter.logInfo(" ", "Rates : " + sRates + " is displayed");
//                }
//                if (i % 2 == 0) {
//                    String sAmountRange = values.get(i).getText();
//                    LoggingUtils.info("Amount Range : " + sAmountRange + " is displayed");
//                   ExtentReporter.logInfo(" ", "Amount Range : " + sAmountRange + " is displayed");
//                }
//            }
            LoggingUtils.info("HD_TC_10, ML Wallet Home Page Kwarta Padala Rates validated");
            ExtentReporter.logPass("HD_TC_10", "HD_TC_10, ML Wallet Home Page Kwarta Padala Rates validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationTierPerksNavigationFromHomePageHamburgerMenu_HD_TC_11() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification Tier Perks Navigation From Home Page Hamburger Menu");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_11, ML Wallet Verification Tier Perks Navigation From Home Page Hamburger Menu Validated");
            ExtentReporter.logPass("HD_TC_11", "HD_TC_11, ML Wallet Verification Tier Perks Navigation From Home Page Hamburger Menu Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletSupportPageNavigation_HD_TC_12() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Support page Navigation From Home Page Hamburger Menu");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objSupport(),"Option");
        mobileGeneralMethod.waitSleep(1000);
//        if (mobileGeneralMethod.isVisible(MLWalletTroubleSigningInPage.objTroubleSingingInPAge, getTextVal(MLWalletTroubleSigningInPage.objTroubleSingingInPAge, "Page"))) {
//            LoggingUtils.info("HD_TC_12, After clicking on support Button on Hamburger menu, Application Navigated to Trouble Signing In Page");
//            ExtentReporter.logPass("HD_TC_12", "HD_TC_12, After clicking on support Button on Hamburger menu, Application Navigated to Trouble Signing In Page");
//            System.out.println("-----------------------------------------------------------");
//        }
    }
    public void mlWalletAboutPageNavigation_HD_TC_13() throws Exception {
        ExtentReporter.logInfo("","ML Wallet About page Navigation From Home Page Hamburger Menu");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objAbout(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(homePageObject.objAbout(),"Page")) {
            LoggingUtils.info("HD_TC_13, After clicking on About Button on Hamburger menu, Application Navigated to About Page");
            ExtentReporter.logPass("HD_TC_13", "HD_TC_13, After clicking on About Button on Hamburger menu, Application Navigated to About Page");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationTierPerksAsSemiVerifiedUser_HD_TC_14() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification Tier Perks Validation By logging as Semi-verified User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.tap(homePageObject.objSemiVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objBranchVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objFullyVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_14, ML Wallet Verification Tier Perks Validation By logging as Semi-verified User Validated");
            ExtentReporter.logPass("HD_TC_14", "HD_TC_14, ML Wallet Verification Tier Perks Validation By logging as Semi-verified User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationTierPerksAsFullyVerifiedUser_HD_TC_15() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification Tier Perks Validation By logging as Fully-verified User");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenuForFullyVerifiedTier(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
//            scrollToFirstHorizontalScrollableElement("Branch Verified Tier Perks");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
//            scrollToFirstHorizontalScrollableElement("Fully Verified Tier Perks");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_15, ML Wallet Verification Tier Perks Validation By logging as Fully-verified User Validated");
            ExtentReporter.logPass("HD_TC_15", "HD_TC_15, ML Wallet Verification Tier Perks Validation By logging as Fully-verified User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationAllTierPerksLoggingInAsSemiVerifiedUser_HD_TC_16() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification All Tier Perks Validation By logging as Semi-verified User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.tap(homePageObject.objSemiVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objBranchVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objFullyVerified(), "Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_16, ML Wallet Verification All Tier Perks Validation By logging as Semi-verified User Validated");
            ExtentReporter.logPass("HD_TC_16", "HD_TC_16, ML Wallet Verification All Tier Perks Validation By logging as Semi-verified User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationTierPerksAsBranchVerifiedUser_HD_TC_17() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification Tier Perks Validation By logging as Branch-verified User");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_17, ML Wallet Verification Tier Perks Validation By logging as Branch-verified User Validated");
            ExtentReporter.logPass("HD_TC_17", "HD_TC_17, ML Wallet Verification Tier Perks Validation By logging as Branch-verified User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletVerificationTierPerksAsBuyerTierUser_HD_TC_18() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Verification Tier Perks Validation By logging as Buyer Tier User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objViewTier(),"Option");
        mobileGeneralMethod.waitSleep(1000);
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.tap(homePageObject.objSemiVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objBranchVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objFullyVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_18, ML Wallet Verification Tier Perks Validation By logging as Buyer Tier User Validated");
            ExtentReporter.logPass("HD_TC_18", "HD_TC_18, ML Wallet Verification Tier Perks Validation By logging as Buyer Tier  User Validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHamburgerMenuTransactionBtnValidation_HD_TC_19() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Hamburger Menu Transaction button validation");
        login.loginWalletBranchTier();
        mobileGeneralMethod.tap(logoutObject.objHamburgerMenu(), "Hamburger Menu");
        mobileGeneralMethod.tap(homePageObject.objTransaction(),"Option");
        if (mobileGeneralMethod.isVisible(homePageObject.objWithdrawCash(),"Option")) {
            mobileGeneralMethod.isVisible(homePageObject.objTopUpMLWallet(),"Option");
            LoggingUtils.info("HD_TC_19, After clicking on Transactions option, Withdraw Cash and TopUp Ml Wallet options are displayed");
            ExtentReporter.logPass("HD_TC_19", "HD_TC_19, After clicking on Transactions option, Withdraw Cash and TopUp Ml Wallet options are displayed");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageIIconValidationAsBranchVerifiedTierUser_HD_TC_20() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page I Icon Validation as Branch verified User");
        login.loginWalletBranchTier();
        if(mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            LoggingUtils.info("HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
            ExtentReporter.logFail("HD_TC_23", "HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
        } else{
            ExtentReporter.logPass("HD_TC_23", "HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
        }
    }
    public void mlWalletHomePageIIconValidationAsBuyerTierUser_HD_TC_21() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page I Icon Validation as BuyerTier verified User");
        login.loginWalletBuyerTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.tap(homePageObject.objSemiVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objBranchVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objFullyVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_21,ML Wallet Home Page I Icon Validated as BuyerTier verified User");
            ExtentReporter.logPass("HD_TC_21", "HD_TC_21, ML Wallet Home Page I Icon Validated as BuyerTier verified User");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageIIconValidationAsSemiVerifiedTierUser_HD_TC_22() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page I Icon Validation as Semi verified Tier User");
        login.loginWalletSemiTier();
        mobileGeneralMethod.tap(homePageObject.objIIcon(), "i Icon");
        if (mobileGeneralMethod.isVisible(homePageObject.objVerificationTierPerks(),"Page")) {
            mobileGeneralMethod.tap(homePageObject.objSemiVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objBranchVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            mobileGeneralMethod.tap(homePageObject.objFullyVerified(),"Tier Button");
            mobileGeneralMethod.isVisible(homePageObject.objTier(),"Header");
            verificationTierPerksPageValidation();
            LoggingUtils.info("HD_TC_22, ML Wallet Home Page I Icon Validated as Semi verified Tier User");
            ExtentReporter.logPass("HD_TC_22", "HD_TC_22, ML Wallet Home Page I Icon Validated as Semi verified Tier User");
            System.out.println("-----------------------------------------------------------");
        }
    }
    public void mlWalletHomePageIIconValidationAsFullyVerifiedTierUser_HD_TC_23() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page I Icon Validation as Fully verified Tier User");
        login.loginWalletFullyTier();
        if(mobileGeneralMethod.isVisible(homePageObject.objIIcon(), "i Icon")) {
            LoggingUtils.info("HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
            ExtentReporter.logPass("HD_TC_23", "HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
            System.out.println("-----------------------------------------------------------");
        } else{
            ExtentReporter.logPass("HD_TC_23", "HD_TC_23, ML Wallet Home Page I Icon not displayed For Fully-verified Tier user");
        }
    }
    public void mlWalletHomePageDoYouHaveAnotherAcButtonFunctionality_HD_TC_24() throws Exception {
        ExtentReporter.logInfo("","ML Wallet Home Page Do you have another Account Button functionality");
        login.loginWalletFullyTier();
        mobileGeneralMethod.tap(homePageObject.objDoYouHaveAnotherAccBtn(),"button");
        if (mobileGeneralMethod.isVisible(homePageObject.objAddAccFacility(),"Page")) {
            LoggingUtils.info("HD_TC_24, ML Wallet Home Page Do you have another Account Button functionality validated");
            ExtentReporter.logPass("HD_TC_24", "HD_TC_24, ML Wallet Home Page Do you have another Account Button functionality validated");
            System.out.println("-----------------------------------------------------------");
        }
    }
}

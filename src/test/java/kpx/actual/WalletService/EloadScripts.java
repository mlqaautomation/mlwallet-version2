package kpx.actual.WalletService;

import kpx.base.BaseTest;
import mlwallet.testSteps.KwartaPadala_Wallet;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

import static org.testng.Assert.assertTrue;
import static utilities.Driver.AppiumDriverManager.APP_ID;
import static utilities.Driver.AppiumDriverManager.getAndroidDriver;

public class EloadScripts extends BaseTest {
//----HappyPath
    @Test(priority = 1, description = "buyELoadSuccessfulTransaction_BE_1")
    public void buyELoadSuccessfulTransaction_BE_1() throws Exception {
        buyELoad.buyELoadSuccessfulTransaction_BE_TC_26();
    }
//----Positive Test
//    @Test(priority = 2, description = "buyELoadTransactionDetails_BE_2")
//    public void buyELoadTransactionDetails_BE_2() throws Exception {
//        buyELoad.buyELoadTransactionDetails_BE_TC_01();
//    }
//    @Test(priority = 3, description = "buyELoadTransactionPageUIValidation_BE_3")
//    public void buyELoadTransactionPageUIValidation_BE_3() throws Exception {
//        buyELoad.buyELoadTransactionPageUIValidation_BE_TC_10();
//    }
//    @Test(priority = 4, description = "buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_4")
//    public void buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_4() throws Exception {
//        buyELoad.buyELoadNextButtonFunctionalityOnELoadTransactionPage_BE_TC_11();
//    }
//    @Test(priority = 5, description = "buyELoadLoadSelectionPageUIValidation_BE_5")
//    public void buyELoadLoadSelectionPageUIValidation_BE_5() throws Exception {
//        buyELoad.buyELoadLoadSelectionPageUIValidation_BE_TC_13();
//    }
//    @Test(priority = 6, description = "buyELoadTransactionDetailsPageUIValidation_BE_6")
//    public void buyELoadTransactionDetailsPageUIValidation_BE_6() throws Exception {
//        buyELoad.buyELoadTransactionDetailsPageUIValidation_BE_TC_15();
//    }
//    @Test(priority = 7, description = "buyELoadSelectFromContactsBtnFunctionality_BE_7")
//    public void buyELoadSelectFromContactsBtnFunctionality_BE_7() throws Exception {
//        buyELoad.buyELoadSelectFromContactsBtnFunctionality_BE_TC_16();
//    }
//    @Test(priority = 8, description = "buyELoadContactsPageUIValidation_BE_8")
//    public void buyELoadContactsPageUIValidation_BE_8() throws Exception {
//        buyELoad.buyELoadContactsPageUIValidation_BE_TC_17();
//    }
//    @Test(priority = 9, description = "buyELoadSearchFieldValidation_BE_9")
//    public void buyELoadSearchFieldValidation_BE_9() throws Exception {
//        buyELoad.buyELoadSearchFieldValidation_BE_TC_19();
//    }
//    @Test(priority = 10, description = "buyELoadAddContactToFavorites_BE_10")
//    public void buyELoadAddContactToFavorites_BE_10() throws Exception {
//        buyELoad.buyELoadAddContactToFavorites_BE_TC_20();
//    }
//    @Test(priority = 11, description = "buyELoadPromoConfirmationPopupValidation_BE_11")
//    public void buyELoadSearchUnFavoriteContact_BE_20() throws Exception {
//        buyELoad.buyELoadSearchUnFavoriteContact_BE_TC_23();
//    }
//    @Test(priority = 12, description = "buyELoadPromoConfirmationPopupValidation_BE_12")
//    public void buyELoadPromoConfirmationPopupValidation_BE_12() throws Exception {
//        buyELoad.buyELoadPromoConfirmationPopupValidation_BE_TC_24();
//    }
//    @Test(priority = 13, description = "buyELoadInAppOTPPageUIValidation_BE_13")
//    public void buyELoadInAppOTPPageUIValidation_BE_13() throws Exception {
//        buyELoad.buyELoadInAppOTPPageUIValidation_BE_TC_25();
//    }
    //--------------Failed back to home status is failed app crash
//    @Test(priority = 14, description = "buyELoadRecentTransactionUIValidation_BE_14")
//    public void buyELoadRecentTransactionUIValidation_BE_14() throws Exception {
//        buyELoad.buyELoadRecentTransactionUIValidation_BE_TC_27();
//    }
    //--------------Failed back to home status is failed
//    @Test(priority = 15, description = "buyELoadTransactionDetailsUIValidation_BE_15")
//    public void buyELoadTransactionDetailsUIValidation_BE_15() throws Exception {
//        buyELoad.buyELoadTransactionDetailsUIValidation_BE_TC_28();
//    }
//--------------Failed new transaction status is failed app crash
//    @Test(priority = 16, description = "buyELoadNewTransactionBtnFunctionality_BE_16")
//    public void buyELoadNewTransactionBtnFunctionality_BE_16() throws Exception {
//        buyELoad.buyELoadNewTransactionBtnFunctionality_BE_TC_66();
//    }
//    @Test(priority = 17, description = "buyELoadTransactionNewOTPAfterSixtySecondsValidation_BE_17")
//    public void buyELoadTransactionNewOTPAfterSixtySecondsValidation_BE_17() throws Exception {
//        buyELoad.buyELoadTransactionNewOTPAfterSixtySecondsValidation_BE_TC_091();
//    }
//    @Test(priority = 18, description = "buyELoadTransactionForBranchVerifiedTier_BE_18")
//    public void buyELoadTransactionForBranchVerifiedTier_BE_18() throws Exception {
//        buyELoad.buyELoadTransactionForBranchVerifiedTier_BE_TC_42();
//    }
//    @Test(priority = 19, description = "buyELoadTransactionForSemiVerifiedTier_BE_19")
//    public void buyELoadTransactionForSemiVerifiedTier_BE_19() throws Exception {
//        buyELoad.buyELoadTransactionForSemiVerifiedTier_BE_TC_30();
//    }
//    @Test(priority = 20, description = "buyELoadBuyerTierVerifiedTier_BE_20")
//    public void buyELoadBuyerTierVerifiedTier_BE_20() throws Exception {
//        buyELoad.buyELoadBuyerTierVerifiedTier_BE_TC_45();
//    }

//----Negative Test
//    @Test(priority = 1, description = "buyELoadInvalidMobileNumber_BE_01")
//    public void buyELoadInvalidMobileNumber_BE_01() throws Exception {
//        buyELoad.buyELoadInvalidMobileNumber_BE_TC_02();
//    }
//    @Test(priority = 2, description = "buyELoadWithoutInputMobNumber_BE_2")
//    public void buyELoadWithoutInputMobNumber_BE_2() throws Exception {
//        buyELoad.buyELoadWithoutInputMobNumber_BE_TC_03();
//    }
//    @Test(priority = 3, description = "buyELoadWithCharacterMobileNo_BE_3")
//    public void buyELoadWithCharacterMobileNo_BE_3() throws Exception {
//        buyELoad.buyELoadWithCharacterMobileNo_BE_TC_04();
//    }
//    @Test(priority = 4, description = "buyELoadLoadSelectionPageBackBtnValidation_BE_4")
//    public void buyELoadLoadSelectionPageBackBtnValidation_BE_4() throws Exception {
//        buyELoad.buyELoadLoadSelectionPageBackBtnValidation_BE_TC_12();
//    }
//    @Test(priority = 5, description = "buyELoadLoadSelectionChangeBtnFunctionality_BE_5")
//    public void buyELoadLoadSelectionChangeBtnFunctionality_BE_5() throws Exception {
//        buyELoad.buyELoadLoadSelectionChangeBtnFunctionality_BE_TC_14();
//    }
//    @Test(priority = 6, description = "buyELoadContactsPageBackBtnValidation_BE_6")
//    public void buyELoadContactsPageBackBtnValidation_BE_6() throws Exception {
//        buyELoad.buyELoadContactsPageBackBtnValidation_BE_TC_18();
//    }
    //--------------------- Cancel redirect to login Page Crash
//    @Test(priority = 7, description = "buyELoadTransactionOTPCancelBtnFunctionality_BE_7")
//    public void buyELoadTransactionOTPCancelBtnFunctionality_BE_7() throws Exception {
//        buyELoad.buyELoadTransactionOTPCancelBtnFunctionality_BE_TC_092();
//    }
}

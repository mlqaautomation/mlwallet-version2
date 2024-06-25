package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class TopUpGamesScripts  extends BaseTest {
    //----Happy Path
    @Test(priority = 1, description = "topUpGamesSuccessfulTransaction_TUG_1")
    public void topUpGamesSuccessfulTransaction_TUG_1() throws Exception {
        topUpGames.topUpGamesSuccessfulTransaction_TUG_TC_06();
    }
    //-----Positive Testing
    @Test(priority = 2, description = "topUpGamesHomePageValidation_TUG_2")
    public void topUpGamesHomePageValidation_TUG_2() throws Exception {
        topUpGames.topUpGamesHomePageValidation_TUG_TC_01();
    }
    @Test(priority = 3, description = "topUPGamesLoadSelectionScreenNavigation_TUG_3")
    public void topUPGamesLoadSelectionScreenNavigation_TUG_3() throws Exception {
        topUpGames.topUPGamesLoadSelectionScreenNavigation_TUG_TC_05();
    }
    @Test(priority = 4, description = "topUPGamesLoadSelectionPageLoadTypesValidation_TUG_4")
    public void topUPGamesLoadSelectionPageLoadTypesValidation_TUG_4() throws Exception {
        topUpGames.topUPGamesLoadSelectionPageLoadTypesValidation_TUG_TC_08();
    }
    @Test(priority = 5, description = "topUPGamesTransactionDetailsPageNavigation_TUG_5")
    public void topUPGamesTransactionDetailsPageNavigation_TUG_5() throws Exception {
        topUpGames.topUPGamesTransactionDetailsPageNavigation_TUG_TC_09();
    }
    @Test(priority = 6, description = "topUpGamesLandingPageNavigation_TUG_6")
    public void topUpGamesLandingPageNavigation_TUG_6() throws Exception {
        topUpGames.topUpGamesLandingPageNavigation_TUG_TC_14();
    }
    @Test(priority = 7, description = "topUpGamesTransactionDetailsPageUIValidation_TUG_7")
    public void topUpGamesTransactionDetailsPageUIValidation_TUG_7() throws Exception {
        topUpGames.topUpGamesTransactionDetailsPageUIValidation_TUG_TC_15();
    }
    @Test(priority = 8, description = "topUpGamesSaveToFavorites_TUG_8")
    public void topUpGamesSaveToFavorites_TUG_8() throws Exception {
        topUpGames.topUpGamesSaveToFavorites_TUG_TC_16();
    }
    @Test(priority = 9, description = "topUpGamesSRecipientAlreadySavedMsgValidation_TUG_9")
    public void topUpGamesSRecipientAlreadySavedMsgValidation_TUG_9() throws Exception {
        topUpGames.topUpGamesSRecipientAlreadySavedMsgValidation_TUG_TC_17();
    }
    @Test(priority = 10, description = "topUpGamesRemoveFromFavorites_TUG_10")
    public void topUpGamesRemoveFromFavorites_TUG_10() throws Exception {
        topUpGames.topUpGamesRemoveFromFavorites_TUG_TC_18();
    }
    @Test(priority = 11, description = "topUpGamesTransactionValidationInTransactionHistory_TUG_11")
    public void topUpGamesTransactionValidationInTransactionHistory_TUG_11() throws Exception {
        topUpGames.topUpGamesTransactionValidationInTransactionHistory_TUG_TC_19();
    }
    @Test(priority = 12, description = "topUpGamesTopUpAgainFunctionalityAfterFirstSuccessfulTransaction_TUG_12")
    public void topUpGamesTopUpAgainFunctionalityAfterFirstSuccessfulTransaction_TUG_12() throws Exception {
        topUpGames.topUpGamesTopUpAgainFunctionalityAfterFirstSuccessfulTransaction_TUG_TC_27();
    }
    @Test(priority = 13, description = "topUpGamesSelectRecipientWithSavedFavorites_TUG_13")
    public void topUpGamesSelectRecipientWithSavedFavorites_TUG_13() throws Exception {
        topUpGames.topUpGamesSelectRecipientWithSavedFavorites_TUG_TC_29();
    }
//--------Need Test Data MLPin
//    @Test(priority = 14, description = "topUpGamesTransactionWithValidMLPin_TUG_14")
//    public void topUpGamesTransactionWithValidMLPin_TUG_14() throws Exception {
//        topUpGames.topUpGamesTransactionWithValidMLPin_TUG_TC_31();
//    }
//--------Need Test Data MLPin
//    @Test(priority = 15, description = "topUpGamesMLPinPageNavigation_TUG_15")
//    public void topUpGamesMLPinPageNavigation_TUG_15() throws Exception {
//        topUpGames.topUpGamesMLPinPageNavigation_TUG_TC_23();
//    }
    @Test(priority = 16, description = "topUpGamesInAppOTPPopupNavigation_TUG_16")
    public void topUpGamesInAppOTPPopupNavigation_TUG_16() throws Exception {
        topUpGames.topUpGamesInAppOTPPopupNavigation_TUG_TC_20();
    }


    //Negative Testing
//--------Crash when clicking Continue APP
//    @Test(priority = 1, description = "topUpGamesGameIDRequiredErrorMsgValidation_TUG_1")
//    public void topUpGamesGameIDRequiredErrorMsgValidation_TUG_1() throws Exception {
//        topUpGames.topUpGamesGameIDRequiredErrorMsgValidation_TUG_TC_10();
//    }
    @Test(priority = 2, description = "topUpGamesEmailAddressRequiredErrorMsgValidation_TUG_2")
    public void topUpGamesEmailAddressRequiredErrorMsgValidation_TUG_2() throws Exception {
        topUpGames.topUpGamesEmailAddressRequiredErrorMsgValidation_TUG_TC_11();
    }
    @Test(priority = 3, description = "topUpGamesEmailAddressInvalidErrorMsgValidation_TUG_3")
    public void topUpGamesEmailAddressInvalidErrorMsgValidation_TUG_3() throws Exception {
        topUpGames.topUpGamesEmailAddressInvalidErrorMsgValidation_TUG_TC_12();
    }
    @Test(priority = 4, description = "topUpGamesMobileNumberInvalidErrorMsgValidation_TUG_4")
    public void topUpGamesMobileNumberInvalidErrorMsgValidation_TUG_4() throws Exception {
        topUpGames.topUpGamesMobileNumberInvalidErrorMsgValidation_TUG_TC_13();
    }
// --------Need Test Data MLPin
//    @Test(priority = 5, description = "topUpGamesTransactionWithInValidMLPin_TUG_5")
//    public void topUpGamesTransactionWithInValidMLPin_TUG_5() throws Exception {
//        topUpGames.topUpGamesTransactionWithInValidMLPin_TUG_TC_26();
//    }

}

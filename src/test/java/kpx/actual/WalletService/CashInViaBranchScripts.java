package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CashInViaBranchScripts extends BaseTest {
    //----HappyPath
//    @Test(priority = 1, description = "cashInViaBranchSuccessfulTransaction_CIBR_1")
//    public void cashInViaBranchSuccessfulTransaction_CIBR_1() throws Exception {
//        cashInViaBranch.cashInViaBranchSuccessfulTransaction_CIBR_TC_16();
//    }
//    //----Positive Testing
//    @Test(priority = 2, description = "cashInviaBranch_ValidAmount_Scenario_CIBR_2")
//    public void cashInviaBranch_ValidAmount_Scenario_CIBR_2() throws Exception {
//        cashInViaBranch.cashInviaBranch_ValidAmount_Scenario_CIBR_TC_01();
//    }
//    @Test(priority = 3, description = "cashInViaBranchUIValidation_CIBR_3")
//    public void cashInViaBranchUIValidation_CIBR_3() throws Exception {
//        cashInViaBranch.cashInViaBranchUIValidation_CIBR_TC_06();
//    }
//    @Test(priority = 4, description = "cashInViaBranchNavigationToHomePageFromQRPage_CIBR_4")
//    public void cashInViaBranchNavigationToHomePageFromQRPage_CIBR_4() throws Exception {
//        cashInViaBranch.cashInViaBranchNavigationToHomePageFromQRPage_CIBR_TC_08();
//    }
//    @Test(priority = 5, description = "cashInViaBranchQRCodePageUIValidation_CIBR_5")
//    public void cashInViaBranchQRCodePageUIValidation_CIBR_5() throws Exception {
//        cashInViaBranch.cashInViaBranchQRCodePageUIValidation_CIBR_TC_09();
//    }
//    @Test(priority = 6, description = "cashInViaBranchPendingTransaction_CIBR_6")
//    public void cashInViaBranchPendingTransaction_CIBR_6() throws Exception {
//        cashInViaBranch.cashInViaBranchPendingTransaction_CIBR_TC_11();
//    }
//    @Test(priority = 7, description = "cashInViaBranchGoBackBtnValidationOnCashInConfirmPopUp_CIBR_7")
//    public void cashInViaBranchGoBackBtnValidationOnCashInConfirmPopUp_CIBR_7() throws Exception {
//        cashInViaBranch.cashInViaBranchGoBackBtnValidationOnCashInConfirmPopUp_CIBR_TC_14();
//    }
//    @Test(priority = 8, description = "cashInViaBranchSemiVerifiedTierUser_CIBR_8")
//    public void cashInViaBranchSemiVerifiedTierUser_CIBR_8() throws Exception {
//        cashInViaBranch.cashInViaBranchSemiVerifiedTierUser_CIBR_TC_17();
//    }
//    @Test(priority = 9, description = "cashInViaBranchFullyVerifiedTierUser_CIBR_9")
//    public void cashInViaBranchFullyVerifiedTierUser_CIBR_9() throws Exception {
//        cashInViaBranch.cashInViaBranchFullyVerifiedTierUser_CIBR_TC_18();
//    }
//    @Test(priority = 10, description = "cashInViaBranchTransactionDetailsUIValidation_CIBR_10")
//    public void cashInViaBranchTransactionDetailsUIValidation_CIBR_10() throws Exception {
//        cashInViaBranch.cashInViaBranchTransactionDetailsUIValidation_CIBR_TC_22();
//    }
//-----Need test Data MLPIn
//    @Test(priority = 11, description = "cashInViaBranchTransactionWithValidMLPin_CIBR_11")
//    public void cashInViaBranchTransactionWithValidMLPin_CIBR_11() throws Exception {
//        cashInViaBranch.cashInViaBranchTransactionWithValidMLPin_CIBR_TC_43();
//    }
//    @Test(priority = 11, description = "cashInViaBranchOTPPopupValidation_CIBR_12")
//    public void cashInViaBranchOTPPopupValidation_CIBR_12() throws Exception {
//        cashInViaBranch.cashInViaBranchOTPPopupValidation_CIBR_TC_50();
//    }
//    @Test(priority = 12, description = "cashInViaBranchTransactionNewOTPAfterSixtySecondsValidation_CIBR_13")
//    public void cashInViaBranchTransactionNewOTPAfterSixtySecondsValidation_CIBR_13() throws Exception {
//        cashInViaBranch.cashInViaBranchTransactionNewOTPAfterSixtySecondsValidation_CIBR_TC_52();
//    }
    @Test(priority = 13, description = "cashInViaBranchOTPContinueBtnFunctionality_CIBR_14")
    public void cashInViaBranchOTPContinueBtnFunctionality_CIBR_14() throws Exception {
        cashInViaBranch.cashInViaBranchOTPContinueBtnFunctionality_CIBR_TC_54();
    }

    //-----Negative Testing
//    @Test(priority = 1, description = "cashInViaBranchCancelTransactionScenario_CIBR_1")
//    public void cashInViaBranchCancelTransactionScenario_CIBR_1() throws Exception {
//        cashInViaBranch.cashInViaBranchCancelTransactionScenario_CIBR_TC_02();
//    }
//    @Test(priority = 2, description = "cashInviaBranch_Invalid_Amount_CIBR_2")
//    public void cashInviaBranch_Invalid_Amount_CIBR_2() throws Exception {
//        cashInViaBranch.cashInviaBranch_Invalid_Amount_CIBR_TC_03();
//    }
//    @Test(priority = 3, description = "cashInViaBranch_Maximum_Limit_Amount_CIBR_3")
//    public void cashInViaBranch_Maximum_Limit_Amount_CIBR_3() throws Exception {
//        cashInViaBranch.cashInViaBranch_Maximum_Limit_Amount_CIBR_TC_04();
//    }
//    @Test(priority = 4, description = "cashInViaBRanchInvalidAmount_CIBR_4")
//    public void cashInViaBRanchInvalidAmount_CIBR_4() throws Exception {
//        cashInViaBranch.cashInViaBRanchInvalidAmount_CIBR_TC_05();
//    }
//    @Test(priority = 5, description = "cashInViaBranchBackBtnValidation_CIBR_5")
//    public void cashInViaBranchBackBtnValidation_CIBR_5() throws Exception {
//        cashInViaBranch.cashInViaBranchBackBtnValidation_CIBR_TC_07();
//    }
//    @Test(priority = 6, description = "cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_6")
//    public void cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_6() throws Exception {
//        cashInViaBranch.cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_TC_12();
//    }
//    @Test(priority = 7, description = "cashInViaBranchMaxTransactionBuyerTierUser_CIBR_7")
//    public void cashInViaBranchMaxTransactionBuyerTierUser_CIBR_7() throws Exception {
//        cashInViaBranch.cashInViaBranchMaxTransactionBuyerTierUser_CIBR_TC_19();
//    }
//    @Test(priority = 8, description = "cashInViaBranchMaxTransactionSemiVerifiedTierUser_CIBR_8")
//    public void cashInViaBranchMaxTransactionSemiVerifiedTierUser_CIBR_8() throws Exception {
//        cashInViaBranch.cashInViaBranchMaxTransactionSemiVerifiedTierUser_CIBR_TC_20();
//    }
//    @Test(priority = 9, description = "cashInViaBranchMaxTransactionFullyVerifiedTierUser_CIBR_9")
//    public void cashInViaBranchMaxTransactionFullyVerifiedTierUser_CIBR_9() throws Exception {
//        cashInViaBranch.cashInViaBranchMaxTransactionFullyVerifiedTierUser_CIBR_TC_21();
//    }
//-----Need test Data MLPIn
//    @Test(priority = 10, description = "cashInViaBranchTransactionWithInValidMLPin_CIBR_10")
//    public void cashInViaBranchTransactionWithInValidMLPin_CIBR_10() throws Exception {
//        cashInViaBranch.cashInViaBranchTransactionWithInValidMLPin_CIBR_TC_44();
//    }
//    @Test(priority = 11, description = "cashInViaBranchTransactionOTPCancelBtnFunctionality_CIBR_11")
//    public void cashInViaBranchTransactionOTPCancelBtnFunctionality_CIBR_11() throws Exception {
//        cashInViaBranch.cashInViaBranchTransactionOTPCancelBtnFunctionality_CIBR_TC_53();
//    }
}

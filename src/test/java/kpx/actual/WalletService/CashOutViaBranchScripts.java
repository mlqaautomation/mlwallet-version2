package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class CashOutViaBranchScripts extends BaseTest {
    //----Happy Path
//    @Test(priority = 1, description = "cashOutViaBranchSuccessfulTransaction_WM_TC_05")
//    public void cashOutViaBranchSuccessfulTransaction_WM_TC_05() throws Exception {
//        cashOutViaBranch.cashOutViaBranchSuccessfulTransaction_WM_TC_05();
//    }
//    //------Postive Testing
//    @Test(priority = 2, description = "cashOutUIValidation_WM_2")
//    public void cashOutUIValidation_WM_2() throws Exception {
//        cashOutViaBranch.cashOutUIValidation_WM_TC_16();
//    }
//    @Test(priority = 3, description = "cashOutToBranchUIValidation_WM_3")
//    public void cashOutToBranchUIValidation_WM_3() throws Exception {
//        cashOutViaBranch.cashOutToBranchUIValidation_WM_TC_18();
//    }
//    @Test(priority = 4, description = "cashOutMlBranchQRPageUIValidation_WM_4")
//    public void cashOutMlBranchQRPageUIValidation_WM_4() throws Exception {
//        cashOutViaBranch.cashOutMlBranchQRPageUIValidation_WM_TC_22();
//    }
//    @Test(priority = 5, description = "cashOutMLBranchSemiVerifiedTier_WM_5")
//    public void cashOutMLBranchSemiVerifiedTier_WM_5() throws Exception {
//        cashOutViaBranch.cashOutMLBranchSemiVerifiedTier_WM_TC_31();
//    }
//    @Test(priority = 6, description = "cashOutMLBranchFullyVerifiedTier_WM_6")
//    public void cashOutMLBranchFullyVerifiedTier_WM_6() throws Exception {
//        cashOutViaBranch.cashOutMLBranchFullyVerifiedTier_WM_TC_32();
//    }
//    @Test(priority = 7, description = "cashOutMLBranchBackToHomeBtnValidation_WM_7")
//    public void cashOutMLBranchBackToHomeBtnValidation_WM_7() throws Exception {
//        cashOutViaBranch.cashOutMLBranchBackToHomeBtnValidation_WM_TC_54();
//    }
//    @Test(priority = 8, description = "cashOutMLBranchNewTransactionBtnValidation_WM_8")
//    public void cashOutMLBranchNewTransactionBtnValidation_WM_8() throws Exception {
//        cashOutViaBranch.cashOutMLBranchNewTransactionBtnValidation_WM_TC_55();
//    }
//    @Test(priority = 9, description = "cashOutMLBranchOTPPageUiValidation_WM_9")
//    public void cashOutMLBranchOTPPageUiValidation_WM_9() throws Exception {
//        cashOutViaBranch.cashOutMLBranchOTPPageUiValidation_WM_TC_60();
//    }
//    @Test(priority = 10, description = "cashOutMLBranchTransactionDetailsUIValidation_WM_10")
//    public void cashOutMLBranchTransactionDetailsUIValidation_WM_10() throws Exception {
//        cashOutViaBranch.cashOutMLBranchTransactionDetailsUIValidation_WM_TC_61();
//    }
//-----Need Test Data MLPin
//    @Test(priority = 11, description = "cashOutBranchTransactionWithValidMLPin_WM_11")
//    public void cashOutBranchTransactionWithValidMLPin_WM_11() throws Exception {
//        cashOutViaBranch.cashOutBranchTransactionWithValidMLPin_WM_TC_106();
//    }
//    @Test(priority = 12, description = "cashOutBranchTransactionNewOTPAfterSixtySecondsValidation_WM_12")
//    public void cashOutBranchTransactionNewOTPAfterSixtySecondsValidation_WM_12() throws Exception {
//        cashOutViaBranch.cashOutBranchTransactionNewOTPAfterSixtySecondsValidation_WM_TC_115();
//    }
//    @Test(priority = 13, description = "cashOutBranchTransactionOTPContinueBtnFunctionality_WM_13")
//    public void cashOutBranchTransactionOTPContinueBtnFunctionality_WM_13() throws Exception {
//        cashOutViaBranch.cashOutBranchTransactionOTPContinueBtnFunctionality_WM_TC_117();
//    }


    //------Negative Testing
    @Test(priority = 1, description = "cashOutMaxLimit_WM_1")
    public void cashOutMaxLimit_WM_1() throws Exception {
        cashOutViaBranch.cashOutMaxLimit_WM_TC_06();
    }
    @Test(priority = 2, description = "cashOutInsufficientBalance_WM_2")
    public void cashOutInsufficientBalance_WM_2() throws Exception {
        cashOutViaBranch.cashOutInsufficientBalance_WM_TC_07();
    }
    @Test(priority = 3, description = "cashOutBranchMaximumTransactionBranchVerifiedTier_WM_3")
    public void cashOutBranchMaximumTransactionBranchVerifiedTier_WM_3() throws Exception {
        cashOutViaBranch.cashOutBranchMaximumTransactionSemiVerifiedTier_WM_TC_08();
    }
    @Test(priority = 4, description = "cashOutBuyerTierLevelAcc_WM_4")
    public void cashOutBuyerTierLevelAcc_WM_4() throws Exception {
        cashOutViaBranch.cashOutBuyerTierLevelAcc_WM_TC_09();
    }
    @Test(priority = 5, description = "cashOutWithdrawBackBtnValidation_WM_5")
    public void cashOutWithdrawBackBtnValidation_WM_5() throws Exception {
        cashOutViaBranch.cashOutWithdrawBackBtnValidation_WM_TC_17();
    }
    @Test(priority = 6, description = "cashOutToBranchBackBtnValidation_WM_6")
    public void cashOutToBranchBackBtnValidation_WM_6() throws Exception {
        cashOutViaBranch.cashOutToBranchBackBtnValidation_WM_TC_19();
    }
    @Test(priority = 7, description = "cashOutCancelIconValidation_WM_7")
    public void cashOutCancelIconValidation_WM_7() throws Exception {
        cashOutViaBranch.cashOutCancelIconValidation_WM_TC_23();
    }
    @Test(priority = 8, description = "cashOutMLBranchMaxLimitFullyVerifiedTier_WM_8")
    public void cashOutMLBranchMaxLimitFullyVerifiedTier_WM_8() throws Exception {
        cashOutViaBranch.cashOutMLBranchMaxLimitFullyVerifiedTier_WM_TC_42();
    }
//-----Need Test Data MLPin
//    @Test(priority = 9, description = "cashOutBranchTransactionWithInValidMLPin_WM_9")
//    public void cashOutBranchTransactionWithInValidMLPin_WM_9() throws Exception {
//        cashOutViaBranch.cashOutBranchTransactionWithInValidMLPin_WM_TC_100();
//    }
//-----Cancel OTP App will  Crash but manual Okay
//    @Test(priority = 10, description = "cashOutBranchTransactionOTPCancelBtnFunctionality_WM_10")
//    public void cashOutBranchTransactionOTPCancelBtnFunctionality_WM_10() throws Exception {
//        cashOutViaBranch.cashOutBranchTransactionOTPCancelBtnFunctionality_WM_TC_116();
//    }
}

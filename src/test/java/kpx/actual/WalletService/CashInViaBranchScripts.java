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
    //----Positive Testing
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
    @Test(priority = 6, description = "cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_6")
    public void cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_6() throws Exception {
        cashInViaBranch.cashInViaBranchCancelBtnValidationOnCashInConfirmPopUp_CIBR_TC_12();
    }
}

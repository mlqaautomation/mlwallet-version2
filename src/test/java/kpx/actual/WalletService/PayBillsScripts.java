package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;

public class PayBillsScripts extends BaseTest {
//--------------Happy Path
//    @Test(priority = 1, description = "paybillsSuccessfulTransaction_PB_1")
//    public void paybillsSuccessfulTransaction_PB_1() throws Exception {
//        payBills.paybillsSuccessfulTransaction_PB_TC_19();
//    }
//----Positive Test
//    @Test(priority = 2, description = "payBillsPageValidation_PB_2")
//    public void payBillsPageValidation_PB_2() throws Exception {
//        payBills.payBillsPageValidation_PB_TC_01();
//    }
//    @Test(priority = 3, description = "billerCategories_PB_03")
//    public void billerCategories_PB_03() throws Exception {
//        payBills.billerCategories_PB_TC_02();
//    }
//    @Test(priority = 4, description = "billersInAlphabeticalOrder_PB_4")
//    public void billersInAlphabeticalOrder_PB_4() throws Exception {
//        payBills.billersInAlphabeticalOrder_PB_TC_03();
//    }
//    @Test(priority = 5, description = "selectBillsPaymentNameEqualToBillsDetail_PB_5")
//    public void selectBillsPaymentNameEqualToBillsDetail_PB_5() throws Exception {
//        payBills.selectBillsPaymentNameEqualToBillsDetail_PB_TC_04();
//    }
//    @Test(priority = 6, description = "searchBillsPaymentNameEqualToBillsDetail_PB_6")
//    public void searchBillsPaymentNameEqualToBillsDetail_PB_6() throws Exception {
//        payBills.searchBillsPaymentNameEqualToBillsDetail_PB_TC_05();
//    }
//    @Test(priority = 7, description = "billingInformationInput_PB_7")
//    public void billingInformationInput_PB_7() throws Exception {
//        payBills.billingInformationInput_PB_TC_06();
//    }
//    @Test(priority = 8, description = "payBillsWithValidInputs_PB_8")
//    public void payBillsWithValidInputs_PB_8() throws Exception {
//        payBills.payBillsWithValidInputs_PB_TC_07();
//    }
//    @Test(priority = 9, description = "payBillsInRecentTransactions_PB_9")
//    public void payBillsInRecentTransactions_PB_9() throws Exception {
//        payBills.payBillsInRecentTransactions_PB_TC_08();
//    }
//---------- Add same biller will something went wrong
//    @Test(priority = 10, description = "addBillerToPayBills_PB_10")
//    public void addBillerToPayBills_PB_10() throws Exception {
//        payBills.addBillerToPayBills_PB_TC_12();
//    }
//    @Test(priority = 11, description = "payBillsUIValidation_PB_11")
//    public void payBillsUIValidation_PB_11() throws Exception {
//        payBills.payBillsUIValidation_PB_TC_16();
//    }
//    @Test(priority = 12, description = "payBillsUIValidation_PB_12")
//    public void payBillsAddBillerPageUIValidation_PB_12() throws Exception {
//        payBills.payBillsAddBillerPageUIValidation_PB_TC_18();
//    }
//    @Test(priority = 13, description = "payBillsUIValidation_PB_13")
//    public void payBillsSavedBilerUIValidation_PB_13() throws Exception {
//        payBills.payBillsSavedBilerUIValidation_PB_TC_20();
//    }
//    @Test(priority = 14, description = "payBillsRecentTransaction_PB_14")
//    public void payBillsRecentTransaction_PB_14() throws Exception {
//        payBills.payBillsRecentTransaction_PB_TC_21();
//    }
//    @Test(priority = 15, description = "payBillsTransactionInAppOTPPopupUIValidation_PB_15")
//    public void payBillsTransactionInAppOTPPopupUIValidation_PB_15() throws Exception {
//        payBills.payBillsTransactionInAppOTPPopupUIValidation_PB_TC_56();
//    }
//    @Test(priority = 16, description = "payBillsTransactionNewOTPAfterSixtySecondsValidation_PB_16")
//    public void payBillsTransactionNewOTPAfterSixtySecondsValidation_PB_16() throws Exception {
//        payBills.payBillsTransactionNewOTPAfterSixtySecondsValidation_PB_TC_57();
//    }
//    @Test(priority = 16, description = "payBillsTransactionOTPContinueBtnFunctionality_PB_17")
//    public void payBillsTransactionOTPContinueBtnFunctionality_PB_17() throws Exception {
//        payBills.payBillsTransactionOTPContinueBtnFunctionality_PB_TC_59();
//    }

//---------Negative Test
//-------Cant test need Test data low balance
//    @Test(priority = 1, description = "payBillsInRecentTransactions_PB_1")
//    public void payBillsInsufficientBalance_PB_TC_1() throws Exception {
//        payBills.payBillsInsufficientBalance_PB_TC_09();
//    }
//------Negative test Error Message Missing
//    @Test(priority = 2, description = "billingInformationInvalidInput_PB_2")
//    public void billingInformationInvalidInput_PB_2() throws Exception {
//        payBills.billingInformationInvalidInput_PB_TC_10();
//    }
//------Dependent TC 12
//    @Test(priority = 3, description = "addBillerToPayBills_PB_3")
//    public void editAddedBillerToPayBills_PB_3() throws Exception {
//        payBills.editAddedBillerToPayBills_PB_TC_14();
//    }
//------Dependent TC 12
//    @Test(priority = 4, description = "deleteAddedBillerPayBills_PB_4")
//    public void deleteAddedBillerPayBills_PB_4() throws Exception {
//        payBills.deleteAddedBillerPayBills_PB_TC_15();
//    }
//    @Test(priority = 4, description = "payBillsMaxBillsPaymentPerTransactionBuyTierUser_PB_5")
//    public void payBillsMaxBillsPaymentPerTransactionBuyTierUser_PB_5() throws Exception {
//        payBills.payBillsMaxBillsPaymentPerTransactionBuyTierUser_PB_TC_22();
//    }
//    @Test(priority = 5, description = "payBillsMaxBillsPaymentPerTransactionSemiVerifiedTier_PB_6")
//    public void payBillsMaxBillsPaymentPerTransactionSemiVerifiedTier_PB_6() throws Exception {
//        payBills.payBillsMaxBillsPaymentPerTransactionSemiVerifiedTier_PB_TC_25();
//    }
//    @Test(priority = 6, description = "payBillsMaxBillsPaymentPerTransactionBranchVerifiedTier_PB_7")
//    public void payBillsMaxBillsPaymentPerTransactionBranchVerifiedTier_PB_7() throws Exception {
//        payBills.payBillsMaxBillsPaymentPerTransactionBranchVerifiedTier_PB_TC_28();
//    }
//    @Test(priority = 7, description = "payBillsMaxBillsPaymentPerTransactionFullyVerifiedTier_PB_8")
//    public void payBillsMaxBillsPaymentPerTransactionFullyVerifiedTier_PB_8() throws Exception {
//        payBills.payBillsMaxBillsPaymentPerTransactionFullyVerifiedTier_PB_TC_31();
//    }
//------------Negative cant run App Crash
//    @Test(priority = 8, description = "payBillsTransactionOTPCancelBtnFunctionality_PB_9")
//    public void payBillsTransactionOTPCancelBtnFunctionality_PB_9() throws Exception {
//        payBills.payBillsTransactionOTPCancelBtnFunctionality_PB_TC_58();
//    }

}

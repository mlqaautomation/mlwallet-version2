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
//    @Test(priority = 10, description = "addBillerToPayBills_PB_10")
//    public void addBillerToPayBills_PB_10() throws Exception {
//        payBills.addBillerToPayBills_PB_TC_12();
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
    @Test(priority = 10, description = "addBillerToPayBills_PB_3")
    public void editAddedBillerToPayBills_PB_3() throws Exception {
        payBills.editAddedBillerToPayBills_PB_TC_14();
    }

}

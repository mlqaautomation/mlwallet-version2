package kpx.actual.WalletService;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class CashOutViaBranchScripts extends BaseTest {
    //----Happy Path
    @Test(priority = 1, description = "cashOutViaBranchSuccessfulTransaction_WM_TC_05")
    public void cashOutViaBranchSuccessfulTransaction_WM_TC_05() throws Exception {
        cashOutViaBranch.cashOutViaBranchSuccessfulTransaction_WM_TC_05();
    }
}

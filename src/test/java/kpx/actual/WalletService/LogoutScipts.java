package kpx.actual.WalletService;
import kpx.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class LogoutScipts extends BaseTest {
    //------HappyPath
    @Test(priority = 1, description = "logInWithChangeNumber_01")
    public void logInWithChangeNumber_01() throws Exception {
        logout.logInWithChangeNumber_Lout_TC_09();
    }

    //------Positive Test
//    @Test(priority = 2, description = "logOUtPopUpValidation_02")
//    public void logOUtPopUpValidation_02() throws Exception {
//        logout.logOUtPopUpValidation_Lout_TC_05();
//    }
//    @Test(priority = 3, description = "logOutPopUpCancelBtnValidation_03")
//    public void logOutPopUpCancelBtnValidation_03() throws Exception {
//        logout.logOutPopUpCancelBtnValidation_Lout_TC_06();
//    }
//    @Test(priority = 4, description = "logOutPopUpLogOutBtnValidation_04")
//    public void logOutPopUpLogOutBtnValidation_04() throws Exception {
//        logout.logOutPopUpLogOutBtnValidation_Lout_TC_07();
//    }
//    @Test(priority = 5, description = "logoutChangeNumberUIValidation_05")
//    public void logoutChangeNumberUIValidation_05() throws Exception {
//        logout.logoutChangeNumberUIValidation_Lout_TC_08();
//    }

}

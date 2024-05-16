package kpx.actual;
import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;
public class WS_ShopSafe_TestfFirst extends BaseTest {
    //----------------Positive Test
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
//        if(this.homeSteps.isInHomePage()){
//            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
//        }
    }

    @Test(dependsOnMethods = "loginGoogle", priority = 1, description = "Validate Cash In to Own Account Page")
    public void To_Validate_Update_Status_By_Clicking_Yes_Button_For_Transit_WS_SS_11() throws Exception {
        this.wsShopSafeSteps.To_Validate_Update_Status_By_Clicking_Yes_Button_For_Transit_WS_SS_11();
    }
}

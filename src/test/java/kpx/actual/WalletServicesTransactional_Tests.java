package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class WalletServicesTransactional_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }

    @Test(dependsOnMethods = "loginGoogle", priority = 2, description = "Validate Cash In to Own Account Page")
    public void CIOA_TC_01() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CIOA_TC_01();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify receipt")
    public void CIOA_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CIOA_TC_03();

        }

    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 3, description = "Verify CASH IN Remote")
    public void CIOA_TC_11()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CIOA_TC_11();

        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "Validate Cash Out")
    public void CO_TC_01() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CO_TC_01();

        }

    }

    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "Validate verify transaction receipt")
    public void CO_TC_03() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CO_TC_03();

        }

    }

    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "Validate verify remote Cash Out")
    public void CO_TC_08() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.walletServicesTransactionalSteps.CO_TC_08();

        }

    }
}

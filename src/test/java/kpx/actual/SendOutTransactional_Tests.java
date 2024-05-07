package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SendOutTransactional_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if (this.homeSteps.isInHomePage()) {
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify Navigation of SendOut Domestic")
    public void DS_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.DS_TC_01();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 2, description = "Verify SendOut Transaction Option Valid Branch Code")
    public void DS_TC_02_1()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.DS_TC_02_1();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 3, description = "Verify Search KYC (Sender)")
    public void DS_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.DS_TC_03();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 4, description = "Verify Add Receiver New")
    public void DS_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.DS_TC_04();
        }
    }

    @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "Verify Search Receivers")
    public void DS_TC_05() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.DS_TC_05();
        }
    }

    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "Verify Other Information Inputs")
    public void DS_TC_06() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.DS_TC_06();
        }
    }
    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To Validate Submit SendOut Transaction")
    public void DS_TC_8() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.DS_TC_08();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 8, description = "Verify Navigation of SendOut Cancellation and Cancellation of Transaction")
    public void navigatingSendOutCancellationPage()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.SOC_TC_01();
        }

    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 9, description = "Verify Navigation of Request for Change Page and can Request for Change")
    public void rfcNavigation_RFC_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.RFC_TC_01();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 10, description = "Verify Navigation of Return To Sender Page")
    public void RTS_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutTransactionalSteps.RTS_TC_01();
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 11, description = "Validate SO Reprinting")
    public void navigatingSOReprintingPageandPrintingValidKPTN()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.SOR_TC_01();

        }

    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 12, description = "Validate OR Reprinting")
    public void navigatingORReprintingPage()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutTransactionalSteps.OR_TC_01();

        }

    }

}

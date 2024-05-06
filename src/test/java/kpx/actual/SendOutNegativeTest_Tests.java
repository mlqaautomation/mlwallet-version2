package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SendOutNegativeTest_Tests extends BaseTest {

    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if (this.homeSteps.isInHomePage()) {
            ExtentReporter.logPass("loginGoogle", "Login, Passed!!");
        }
    }

    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify SendOut Transaction Option Invalid Branch Code")
    public void DS_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.DS_TC_02();
        }
    }

        @Test(dependsOnMethods = "loginGoogle" , priority = 2, description = "Verify Search KYC (Sender) Negative Test")
    public void DS_TC_03_1()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.DS_TC_03_1();
        }
    }


        @Test(dependsOnMethods = "loginGoogle" , priority = 3, description = "Verify Add Receiver New Negative Test")
    public void DS_TC_04_1()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.DS_TC_04_1();
        }
    }


        @Test(dependsOnMethods = "loginGoogle", priority = 4, description = "Verify Principal Amount")
    public void DS_TC_07() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_07();
        }
    }

        @Test(dependsOnMethods = "loginGoogle", priority = 5, description = "To Validate Cancel SendOut Transaction")
    public void DS_TC_09() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_09();
        }

    }


    @Test(dependsOnMethods = "loginGoogle", priority = 6, description = "To Validate Cancel No SendOut Transaction")
    public void DS_TC_10() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_10();
        }

    }




    @Test(dependsOnMethods = "loginGoogle", priority = 7, description = "To Validate kyc from the Watch List")
    public void DS_TC_11() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_11();
        }

    }
    @Test(dependsOnMethods = "loginGoogle", priority = 8, description = "To Validate The Same Transaction")
    public void DS_TC_12() throws Exception {
        if (this.homeSteps.isInHomePage()) {
            this.sendOutSteps.DS_TC_12();
        }

    }
        @Test(dependsOnMethods = "loginGoogle" , priority = 9, description = "Verify Cancel Sendout with Non-exisitng KPTN")
    public void SOC_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutCancellationSteps.SOC_TC_02();

        }

    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 10, description = "Verify Cancel Sendout with already cancelled KPTN")
    public void SOC_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.sendOutCancellationSteps.SOC_TC_03();

        }

    }

        @Test(dependsOnMethods = "loginGoogle" , priority = 11, description = "Invalid KPTN Code")
    public void invalidKPTN_RFC_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.requestForChangeSteps.RFC_TC_02();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 12, description = "Cancelled KPTN Code")
    public void cancelledKPTN_RFC_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.requestForChangeSteps.RFC_TC_03();
        }
    }

        @Test(dependsOnMethods = "loginGoogle" , priority = 13, description = "Verify Return to Sender with Non-existing KPTN\n")
    public void RTS_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.returnToSenderSteps.RTS_TC_02();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 14, description = "Verify Return to Sender with cancelled KPTN")
    public void RTS_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.returnToSenderSteps.RTS_TC_03();
        }
    }
        @Test(dependsOnMethods = "loginGoogle" , priority = 15, description = " Validate SO Reprinting with Non-Existing KPTN")
    public void nonExistingKPTNSOR_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.soReprintingSteps.SOR_TC_02();

        }

    }
        @Test(dependsOnMethods = "loginGoogle" , priority = 16, description = " Validate OR Reprinting with Non-Existing KPTN")
    public void nonExistingKPTNOR_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()) {
            this.orReprintingSteps.OR_TC_02();

        }

    }

}

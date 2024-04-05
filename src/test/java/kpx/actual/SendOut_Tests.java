package kpx.actual;

import kpx.base.BaseTest;
import org.testng.annotations.Test;
import utilities.ExtentReport.ExtentReporter;

public class SendOut_Tests extends BaseTest {
    @Test(description = "Logging in via gmail and kpx")
    public void loginGoogle() throws Exception {
        this.loginSteps.signInGoogle("teller");
        this.loginSteps.loginKpx("teller");
        if(this.homeSteps.isInHomePage()){
            ExtentReporter.logPass("loginGoogle","Login, Passed!!");
        }
    }
//    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify Navigation of SendOut Domestic")
//    public void navigatingSendOutPage()throws Exception{
//        if(this.homeSteps.isInHomePage()){
//            this.sendOutSteps.DS_TC_01();
//            this.sendOutSteps.DS_TC_02();
//            this.sendOutSteps.DS_TC_03();
//            this.sendOutSteps.DS_TC_04();
////            this.sendOutSteps.DS_TC_05();
//            this.sendOutSteps.DS_TC_06_07_08_09();
//        }
//    }


    @Test(dependsOnMethods = "loginGoogle" , priority = 1, description = "Verify Navigation of SendOut Domestic")
    public void DS_TC_01()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.verifyIsInDomesticSendoutPage();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 2, description = "Verify SendOut Transaction Option ")
    public void DS_TC_02()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();

        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 3, description = "Verify Search KYC (Sender)")
    public void DS_TC_03()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 4, description = "Verify Add Receiver New")
    public void DS_TC_04()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.addReceiverNew();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 5, description = "Verify Search Receivers")
    public void DS_TC_05()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();

        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 6, description = "Other Information Inputs")
    public void DS_TC_06_07()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();
            this.sendOutSteps.otherInformationInputs();

        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 7, description = "To Validate Cancel No SendOut Transaction")
    public void DS_TC_09()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();
            this.sendOutSteps.otherInformationInputs();
            this.sendOutSteps.cancelNoTransactions();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 8, description = "To Validate Cancel2 SendOut Transaction")
    public void DS_TC_10()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();
            this.sendOutSteps.otherInformationInputs();
            this.sendOutSteps.submitSendOutCancel();

        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 9, description = "Cancel Yes Testing")
    public void DS_TC_09_1()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();
            this.sendOutSteps.otherInformationInputs();
            this.sendOutSteps.cancelYesTransactions();
        }
    }
    @Test(dependsOnMethods = "loginGoogle" , priority = 10, description = "To Validate Submitting a SendOut")
    public void DS_TC_08()throws Exception{
        if(this.homeSteps.isInHomePage()){
            this.sendOutSteps.navigationFOrSendOutDomestic();
            this.sendOutSteps.sendOutTransactionOption();
            this.sendOutSteps.searchKYCSender();
            this.sendOutSteps.searchReceiver();
            this.sendOutSteps.otherInformationInputs();
            this.sendOutSteps.submitSendOut();
        }
    }




}

package mlkpx.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class SOReprinting_Steps extends Base_Steps{

    public void SOR_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(soReprintingPageObjects.soReprintingLink(), "SendOut Page ");
        if(isVisible(soReprintingPageObjects.soReprintText(), getText(soReprintingPageObjects.soReprintText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Reprint Page ");
        }
        type(soReprintingPageObjects.kptnButtonInReprint(), "KPTN SOReprint field ", propertyReader.getproperty("kptnvalidcode"));
        type(soReprintingPageObjects.reasonSOReprint(), "Reason SOReprint field ", propertyReader.getproperty("reason_SOReprint"));
        click(soReprintingPageObjects.reprintButton(), "Reprint Button");
        if(isVisible(soReprintingPageObjects.printSendoutReceiptText(), getText(soReprintingPageObjects.printSendoutReceiptText()))){
            ExtentReporter.logPass("SOR_TC_01", "Successfully Validate SO Reprinting");
        }else{
            ExtentReporter.logFail("SOR_TC_01", "Fail to Validate SO Reprinting");
        }
    }

    public void SOR_TC_02()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(soReprintingPageObjects.soReprintingLink(), "SendOut Page ");
        if(isVisible(soReprintingPageObjects.soReprintText(), getText(soReprintingPageObjects.soReprintText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Reprint Page ");
        }
        type(soReprintingPageObjects.kptnButtonInReprint(), "KPTN SOReprint field ", propertyReader.getproperty("invalidkptnfield"));
        type(soReprintingPageObjects.reasonSOReprint(), "Reason SOReprint field ", propertyReader.getproperty("reason_SOReprint"));
        click(soReprintingPageObjects.reprintButton(), "Reprint Button");
        if(isVisible(soReprintingPageObjects.noTransactionFoundText(), getText(soReprintingPageObjects.noTransactionFoundText()))){
            ExtentReporter.logPass("SOR_TC_02", "Successfully Validate SO Reprinting with Non-Existing KPTN");
        }else{
            ExtentReporter.logFail("SOR_TC_02", "Fail to Validate SO Reprinting with Non-Existing KPTN");
        }
    }

}

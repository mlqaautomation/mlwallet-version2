package mlkpx.testSteps;

import org.testng.Assert;
import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class SendOutCancellation_Steps extends Base_Steps{
    public void SOC_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(sendOutCancellationPageObjects.sendOutCancellationLink(), "SendOut Cancellation Page ");
        click(sendOutCancellationPageObjects.cancelDropdown(), "Cancel Dropdown");
        waitSleep(1000);
        if(isVisible(sendOutCancellationPageObjects.cancelSendOutText(), getText(sendOutCancellationPageObjects.cancelSendOutText()))){
            LoggingUtils.info("Successfully Navigate for SendOut Cancellation Page ");
        }
        String randomKPTN = reader.getRandomKPTN(); // Call the getRandomKPTN function
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        String randomKPTN = YAMLUtils.getRandomKPTN("testData.yaml"); // Call the getRandomKPTN function
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", propertyReader.getproperty("kptnvalidcode"));
        click(sendOutCancellationPageObjects.searchButton(),"Search button");
        waitSleep(2000);
        click(sendOutCancellationPageObjects.irNumberField(),"IR Number Field");
        type(sendOutCancellationPageObjects.irNumberField(),"IR Number Field", propertyReader.getproperty("iRNumber"));
        click(sendOutCancellationPageObjects.initiatedByOption(),"Initiated By Option");
        click(sendOutCancellationPageObjects.customerOption(),"Customer Option");
        type(sendOutCancellationPageObjects.reasonField(),"Reason Field", propertyReader.getproperty("reasonfield"));
        click(sendOutCancellationPageObjects.keepTransactionButton(), "Keep Transaction Button");
        click(sendOutCancellationPageObjects.noStayOnThisPage(),"No, Stay On This Page");
        click(sendOutCancellationPageObjects.keepTransactionButton(), "Keep Transaction Button");
        click(sendOutCancellationPageObjects.yesKeepTransactionButton(),"Yes, Keep Transaction Button");
        waitSleep(3000);
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", randomKPTN); // Use the random KPTN value
//        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", propertyReader.getproperty("kptnvalidcode"));
        click(sendOutCancellationPageObjects.searchButton(),"Search button");
        waitSleep(2000);
        click(sendOutCancellationPageObjects.irNumberField(),"IR Number Field");
        type(sendOutCancellationPageObjects.irNumberField(),"IR Number Field", propertyReader.getproperty("iRNumber"));
        click(sendOutCancellationPageObjects.initiatedByOption(),"Initiated By Option");
        click(sendOutCancellationPageObjects.customerOption(),"Customer Option");
        type(sendOutCancellationPageObjects.reasonField(),"Reason Field", propertyReader.getproperty("reasonfield"));
        click(sendOutCancellationPageObjects.cancelButton(), "Cancel Button");
        click(sendOutCancellationPageObjects.noKeepTransaction(),"No, Keep Transaction");
        click(sendOutCancellationPageObjects.cancelButton(), "Cancel Button");
        click(sendOutCancellationPageObjects.yesCancelSendout(),"Yes Cancel Sendout");

        if(isVisible(sendOutCancellationPageObjects.cancelSendOutText(), getText(sendOutCancellationPageObjects.cancelSendOutText()))){
            LoggingUtils.info("Successfully Cancel the Transaction");
        }else {
            ExtentReporter.logFail("SOC_TC_01", "Failed to Cancel the Transaction");
            Assert.fail("Failed to Cancel the Transaction");
        }
    }



    public void SOC_TC_02()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(sendOutCancellationPageObjects.sendOutCancellationLink(), "SendOut Cancellation Page ");
        click(sendOutCancellationPageObjects.cancelDropdown(), "Cancel Dropdown");
        click(sendOutCancellationPageObjects.kptnField(), "KPTN Field");
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field ", propertyReader.getproperty("invalidkptnfield"));
        click(sendOutCancellationPageObjects.searchButton(), "Search Button");
        if(isVisible(sendOutCancellationPageObjects.noTransactionFoundText(), getText(sendOutCancellationPageObjects.noTransactionFoundText()))){
            LoggingUtils.info("No Transaction Found ");
        }else {
            ExtentReporter.logFail("SOC_TC_02", "Failed to go Back to the Cancel Sendout Page");
            Assert.fail("Failed to go Back to the Cancel Sendout Page");
        }
        click(sendOutCancellationPageObjects.okButton(),"OK button");

    }
    public void SOC_TC_03()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(sendOutCancellationPageObjects.sendOutCancellationLink(), "SendOut Cancellation Page ");
        click(sendOutCancellationPageObjects.cancelDropdown(), "Cancel Dropdown");
        click(sendOutCancellationPageObjects.kptnField(), "KPTN Field");
        type(sendOutCancellationPageObjects.kptnField(), "KPTN Field ", propertyReader.getproperty("kptCancelCode"));
        click(sendOutCancellationPageObjects.searchButton(), "Search Button");
        if(isVisible(sendOutCancellationPageObjects.alreadyCancelledText(), getText(sendOutCancellationPageObjects.alreadyCancelledText()))){
            LoggingUtils.info("Sendout transaction has already been cancelled");
        }else {
            ExtentReporter.logFail("SOC_TC_03", "Fail");
            Assert.fail("Fail");
        }
        click(sendOutCancellationPageObjects.okButton(),"OK button");

    }

}

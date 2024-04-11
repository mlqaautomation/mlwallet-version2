package mlkpx.testSteps;

import utilities.ExtentReport.ExtentReporter;
import utilities.Logger.LoggingUtils;

public class RequestForChange_Steps extends Base_Steps{
    public void RFC_TC_01()throws Exception{
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(requestForChangePageObjects.rfcLink(),"Request for Change Link");
        click(requestForChangePageObjects.domesticRFClink(), "Domestic RFC Link");
        waitSleep(3000);
        click(requestForChangePageObjects.kptnField(),"RFC KPTN Field");
        type(requestForChangePageObjects.kptnField(), "RFC KPTN Field ", propertyReader.getproperty("kptnvalidcode"));
        click(requestForChangePageObjects.searchButton(), "RFC Search Button");
        if(isVisible(requestForChangePageObjects.rfcText(), getText(requestForChangePageObjects.rfcText()))){
            ExtentReporter.logPass("RFC_TC_01", "Successfully Navigate for SendOut Domestic Page");
            LoggingUtils.info("Successfully Navigate for SendOut Domestic Page");
        }else{
            ExtentReporter.logFail("RFC_TC_01", "Fail to verify navigation");
            LoggingUtils.error("Fail to verify navigation");
        }
    }
    public void RFC_TC_02()throws Exception {
        click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
        click(requestForChangePageObjects.rfcLink(), "Request for Change Link");
        waitSleep(3000);
        click(requestForChangePageObjects.kptnField(), "RFC KPTN Field");
        type(requestForChangePageObjects.kptnField(), "RFC KPTN Field ", propertyReader.getproperty("invalidkptnfield"));
        click(requestForChangePageObjects.searchButton(), "RFC Search Button");
        if (isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))) {
            ExtentReporter.logPass("RFC_TC_01", "Successfully Navigate for SendOut Domestic Page");
            LoggingUtils.info("Successfully Navigate for SendOut Domestic Page");
        } else {
            ExtentReporter.logFail("RFC_TC_01", "Fail to verify navigation");
            LoggingUtils.error("Fail to verify navigation");
        }
    }
}

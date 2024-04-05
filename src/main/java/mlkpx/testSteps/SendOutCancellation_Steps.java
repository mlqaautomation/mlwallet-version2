package mlkpx.testSteps;

import utilities.Logger.LoggingUtils;

public class SendOutCancellation_Steps extends Base_Steps{

    public void DS_TC_01()throws Exception{
        try{
            click(sendOutPageObjects.sendOutLink(), "SendOut Page ");
            if(isVisible(sendOutPageObjects.sendOutTransaction(), getText(sendOutPageObjects.sendOutTransaction()))){
                LoggingUtils.info("Successfully Navigate for SendOut Domestic Page ");
            }
        }catch (Exception e){
            LoggingUtils.info("Failed to Navigate SendOut Domestic Page "+ e);
        }
    }
    public void SOC_TC_01()throws Exception{

            click(sendOutCancellationPageObjects.sendOutCancellationLink(), "SendOut Cancellation Page ");
            waitSleep(10);
            click(sendOutCancellationPageObjects.cancelDropdown(), "Cancel Dropdown");
            waitSleep(10);
            if(isVisible(sendOutCancellationPageObjects.cancelSendOutText(), getText(sendOutCancellationPageObjects.cancelSendOutText()))){
                LoggingUtils.info("Successfully Navigate for SendOut Cancellation Page ");
            }
//            type(sendOutCancellationPageObjects.kptnField(), "KPTN Field", propertyReader.getproperty("kptn"));
    }

}

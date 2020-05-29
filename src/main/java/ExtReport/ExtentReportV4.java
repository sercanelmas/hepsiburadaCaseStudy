package ExtReport;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportV4{
    ExtentReports extent;
    ExtentTest logger;

    @Test
    public void passTest(){

        logger = extent.startTest("passTest");
        Assert.assertTrue(true);
        //To generate the log when the test case is passed
        logger.log(LogStatus.PASS, "Test Case Passed is passTest");
    }

    @Test
    public void failTest(){
        logger = extent.startTest("failTest");
        Assert.assertTrue(false);
        logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
    }

    @Test
    public void skipTest(){
        logger = extent.startTest("skipTest");
        throw new SkipException("Skipping - This is not ready for testing ");
    }

    @AfterMethod
    public void getResult(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE){
            logger.log(LogStatus.FAIL, "fail-0 Failed is "+result.getName());
            logger.log(LogStatus.FAIL, "fail-1 Failed is "+result.getThrowable());
        }else if(result.getStatus() == ITestResult.SKIP){
            logger.log(LogStatus.SKIP, "skip-0 "+result.getName());
        }
        // ending test
        //endTest(logger) : It ends the current test and prepares to create HTML report
        extent.endTest(logger);
    }
    @AfterTest
    public void endReport(){
        // writing everything to document
        //flush() - to write or update test information to your report.
        extent.flush();

        extent.close();
    }
}
package P_Definitions;

import com.relevantcodes.extentreports.ExtentReports;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Definitions {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static ExtentReports extent;
    public static DateFormat dateFormat = new SimpleDateFormat("yyyymmddHHmmss");
    public static Date date = new Date();
    public static String date1 = dateFormat.format(date);
    public static String email = "@smail.com";
    public static String homePageURL = "http://automationpractice.com/index.php?";
    public static String Path = "ChromeDriver/chromedriver";
    public static String screenShotPath = System.getProperty("user.dir") + "/test-output/";


    public static void driverSettings() {

        if (Platform.getCurrent().toString().contains("WIN")) {
            Path = "ChromeDriver/chromedriver.exe";
        }
        System.setProperty("webdriver.chrome.driver", Path);
        // chrome capabilities
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 60);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        if (extent == null) {
            extent = new com.relevantcodes.extentreports.ExtentReports(System.getProperty("user.dir") + "/test-output/" + date1 + "_Test_Result.html", true);
            //extent.addSystemInfo("Environment","Environment Name")
            extent
                    .addSystemInfo("Host Name", "http://automationpractice.com/")
                    .addSystemInfo("Environment", "Automation Testing")
                    .addSystemInfo("User Name", "Sercan Elmas");
            //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
            //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
            extent.loadConfig(new File(System.getProperty("user.dir") + "extent-config.xml"));
        }
    }

    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }


    public static WebElement getElement(By elementLocator) {
        return driver.findElement(elementLocator);
    }


    public static void ClickAndSend(By elementDefiniton, String text) {
        WebElement element = getElement(elementDefiniton);
        element.click();
        element.sendKeys(text);
    }

    public static boolean checkElement(By elementLocator) {
        return driver.findElements(elementLocator).size() != 0;
    }

    private static String captureBase(String imgName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = screenShotPath + ((imgName == null) ? dateFormat.format(new Date()) : imgName) + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;
    }

    public static String capture() throws IOException {
        return captureBase(null);
    }

}

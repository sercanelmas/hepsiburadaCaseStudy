import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static P_Definitions.Definitions.extent;

public class CheckResponsCode extends Driver {
    public ExtentTest test;

    @After
    public void orderCancel() throws IOException {
        test = extent.startTest("happy path test");

        URL JsonApi = new URL("http://generator.swagger.io/api/swagger.json");
        HttpURLConnection connectionHeader = (HttpURLConnection) JsonApi.openConnection();
        connectionHeader.setRequestMethod("GET");
        connectionHeader.connect();
        int codeHeader = connectionHeader.getResponseCode();
        if (codeHeader == 200) {
            test.log(LogStatus.PASS, "JSON API Request successful");
        } else {
            test.log(LogStatus.FAIL, "JSON API Request unsuccessful");
        }
    }
}

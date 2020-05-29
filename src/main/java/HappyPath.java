import P_Definitions.Definitions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import net.bytebuddy.utility.RandomString;
import org.junit.After;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static P_Definitions.Definitions.*;


public class HappyPath extends Driver {
    public ExtentTest test;


    @After
    public void orderCancel() throws InterruptedException, IOException {

        test = extent.startTest("happy path test");
        Actions action = new Actions(driver);

        Elements.btnLogin().click();
        ClickAndSend(Elements.email, RandomString.make(10) + email);

        Elements.btnCreateAccount().click();
        Elements.radioGenderMr().click();

        ClickAndSend(Elements.firstName, "Sercan");
        ClickAndSend(Elements.lastName, "Elmas");
        ClickAndSend(Elements.password, "Se123456");

        Select dropdown = new Select(Elements.drpDay());
        dropdown.selectByValue("5");

        Select dropdownMonth = new Select(Elements.drpMonth());
        dropdownMonth.selectByValue("4");

        Select dropdownYear = new Select(Elements.drpYear());
        dropdownYear.selectByValue("1989");

        Elements.chckNewsLetter().click();
        Elements.chckOptin().click();

        ClickAndSend(Elements.coAddress, "Test Street. No: 17 / 1");
        ClickAndSend(Elements.coCity, "Test");

        Select dropdownState = new Select(Elements.drpCoState());
        dropdownState.selectByValue("47");

        ClickAndSend(Elements.coMobilePhone, "0123456789");

        ClickAndSend(Elements.coPostCode, "12345");
        Elements.boxCoAliasAddress().clear();
        ClickAndSend(Elements.coAliasAddress, "Home Address");

        Elements.btnRegister().click();

        navigateTo(homePageURL);

        if (checkElement(Elements.account)) {
            test.log(LogStatus.PASS, "Hesap Başarıyla Oluşturuldu" + test.addScreenCapture(capture()));
        } else {
            test.log(LogStatus.FAIL, "Hesap Oluşturulamadı" + test.addScreenCapture(capture()));
        }

        action.moveToElement(Elements.btnMenuDresses()).perform();
        Elements.btnMenuSummerDresses().click();

        String firtsItemPrice = Elements.getFirstItemPrice().getText();

        action.moveToElement(Elements.prdCatFirstItem()).perform();

        String productFirstName = Elements.prdCatFirstItem().getText();

        Elements.btnAddToCart().click();
        Elements.btnContinueShopping().click();

        ClickAndSend(Elements.search, "summer" + Keys.ENTER);

        String secondItemPrice = Elements.getSecondItemPrice().getText();

        action.moveToElement(Elements.prdCatSecondItem()).perform();

        String productSecondName = Elements.prdCatSecondItem().getText();

        Elements.btnAddToCartSecond().click();

        Elements.btnContinueShopping().click();


        action.moveToElement(Elements.btnShoppingCart()).perform();

        Elements.btnOrderCart().click();

        String itemNameFirst = Elements.getCartItemFirst().getText();
        String itemNameSecond = Elements.getCartItemSecond().getText();
        String itemPriceFirst = Elements.getCartPriceFirst().getText();
        String itemPriceSecond = Elements.getCartPriceSecond().getText();
        String cartTotalPrice = Elements.getCartTotalPrice().getText();
        String quatity1 = Elements.getQuantityFirst().getAttribute("value");
        String quatity2 = Elements.getQuantitySecond().getAttribute("value");


        if ((itemNameFirst.equals(productFirstName)) &&
                (itemNameSecond.equals(productSecondName)) &&
                (itemPriceFirst.equals(firtsItemPrice)) &&
                (itemPriceSecond.equals(secondItemPrice)) &&
                (quatity1.equals("1")) &&
                (quatity2.equals("1"))) {
            test.log(LogStatus.PASS, "Ürünler Başarılı Şekilde Sepete Eklenmiştir" + test.addScreenCapture(capture()));
        } else {
            test.log(LogStatus.FAIL, "Sepete Eklenen Ürün Bilgileri Hatalıdır" + test.addScreenCapture(capture()));
        }

        Elements.btnProceedToCheckout().click();

        Elements.btnProceedToCheckoutStep().click();

        Elements.chckTermOfService().click();

        Elements.btnProceedToCheckout().click();

        Elements.btnPaymentBankWire().click();

        Elements.btnConfirmOrder().click();

        Thread.sleep(5000);

        Elements.btnAccount().click();
        Elements.btnOrderDetails().click();

        String detailTotalPrice = Elements.getDetailTotalPrice().getText();


        if (detailTotalPrice.equals(cartTotalPrice)) {
            test.log(LogStatus.PASS, "Sipariş Başarılı Şekilde Oluşturulmuştur" + test.addScreenCapture(capture()));
        } else {
            test.log(LogStatus.FAIL, "Sipariş Hatalı Oluşturulmuştur." + test.addScreenCapture(capture()));

        }


    }
}

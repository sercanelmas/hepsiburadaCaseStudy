import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static P_Definitions.Definitions.getElement;

public class Elements {

    public static By login = By.className("login");
    public static By createAccount = By.id("SubmitCreate");
    public static By email = By.id("email_create");
    public static By genderMr = By.id("id_gender1");
    public static By firstName = By.id("customer_firstname");
    public static By lastName = By.id("customer_lastname");
    public static By password = By.id("passwd");
    public static By day = By.id("days");
    public static By month = By.id("months");
    public static By year = By.id("years");
    public static By newsLetter = By.id("newsletter");
    public static By _optin = By.id("optin");
    public static By coAddress = By.id("address1");
    public static By coCity = By.id("city");
    public static By coState = By.id("id_state");
    public static By coPostCode = By.id("postcode");
    public static By coCountry = By.id("country");
    public static By coMobilePhone = By.id("phone_mobile");
    public static By coAliasAddress = By.id("alias");
    public static By Register = By.id("submitAccount");
    public static By menuDresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]");
    public static By menuSummerDresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]");
    public static By catFirstItem = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]");
    public static By catSecondItem = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]");
    public static By addToCart = By.cssSelector(".button.ajax_add_to_cart_button.btn.btn-default");
    public static By addToCartSecond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]");
    public static By continueShopping = By.cssSelector(".exclusive-medium");
    public static By search = By.id("search_query_top");
    public static By shoppingCart = By.className("ajax_cart_product_txt_s");
    public static By orderCart = By.id("button_order_cart");
    public static By proceedToCheckout = By.cssSelector(".standard-checkout.button-medium");
    public static By proceedToCheckoutStep = By.cssSelector("button.btn.btn-default.button-medium");
    public static By termOfService = By.id("cgv");
    public static By paymentBankWire = By.className("bankwire");
    public static By confirmOrder = By.cssSelector("button.btn-default.button-medium");
    public static By account = By.className("account");
    public static By itemPriceFirst = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[1]/span[1]");
    public static By itemPriceSecond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/span[1]");
    public static By cartItemFirst = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p[1]/a[1]");
    public static By cartItemSecond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/p[1]");
    public static By cartPriceFirst = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/span[1]");
    public static By cartPriceSecond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[6]/span[1]");
    public static By quantityFirst = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[2]");
    public static By quantitySecond = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/input[2]");
    public static By orderDetails = By.className("icon-list-ol");
    public static By detailTotalPrice = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]");
    public static By cartTotalPrice = By.id("total_price");


    public static WebElement btnLogin() {
        return getElement(login);
    }

    public static WebElement btnCreateAccount() {
        return getElement(createAccount);
    }

    public static WebElement radioGenderMr() {
        return getElement(genderMr);
    }

    public static WebElement drpDay() {
        return getElement(day);
    }

    public static WebElement drpMonth() {
        return getElement(month);
    }

    public static WebElement drpYear() {
        return getElement(year);
    }

    public static WebElement chckNewsLetter() {
        return getElement(newsLetter);
    }

    public static WebElement chckOptin() {
        return getElement(_optin);
    }

    public static WebElement drpCoState() {
        return getElement(coState);
    }

    public static WebElement boxCoAliasAddress() {
        return getElement(coAliasAddress);
    }

    public static WebElement btnRegister() {
        return getElement(Register);
    }

    public static WebElement btnMenuDresses() {
        return getElement(menuDresses);
    }

    public static WebElement btnMenuSummerDresses() {
        return getElement(menuSummerDresses);
    }

    public static WebElement prdCatFirstItem() {
        return getElement(catFirstItem);
    }

    public static WebElement prdCatSecondItem() {
        return getElement(catSecondItem);
    }

    public static WebElement btnAddToCart() {
        return getElement(addToCart);
    }

    public static WebElement btnAddToCartSecond() {
        return getElement(addToCartSecond);
    }

    public static WebElement btnContinueShopping() {
        return getElement(continueShopping);
    }

    public static WebElement btnShoppingCart() {
        return getElement(shoppingCart);
    }

    public static WebElement btnOrderCart() {
        return getElement(orderCart);
    }

    public static WebElement btnProceedToCheckout() {
        return getElement(proceedToCheckout);
    }

    public static WebElement btnProceedToCheckoutStep() {
        return getElement(proceedToCheckoutStep);
    }

    public static WebElement chckTermOfService() {
        return getElement(termOfService);
    }

    public static WebElement btnPaymentBankWire() {
        return getElement(paymentBankWire);
    }

    public static WebElement btnAccount() {
        return getElement(account);
    }

    public static WebElement btnConfirmOrder() {
        return getElement(confirmOrder);
    }

    public static WebElement getFirstItemPrice() {
        return getElement(itemPriceFirst);
    }

    public static WebElement getSecondItemPrice() {
        return getElement(itemPriceSecond);
    }

    public static WebElement getCartItemFirst() {
        return getElement(cartItemFirst);
    }

    public static WebElement getCartItemSecond() {
        return getElement(cartItemSecond);
    }

    public static WebElement getCartPriceFirst() {
        return getElement(cartPriceFirst);
    }

    public static WebElement getCartPriceSecond() {
        return getElement(cartPriceSecond);
    }

    public static WebElement getQuantityFirst() {
        return getElement(quantityFirst);
    }

    public static WebElement getQuantitySecond() {
        return getElement(quantitySecond);
    }

    public static WebElement btnOrderDetails() {
        return getElement(orderDetails);
    }

    public static WebElement getDetailTotalPrice() {
        return getElement(detailTotalPrice);
    }

    public static WebElement getCartTotalPrice() {
        return getElement(cartTotalPrice);
    }


}

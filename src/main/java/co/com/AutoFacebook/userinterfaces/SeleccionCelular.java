package co.com.AutoFacebook.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionCelular extends PageObject {

    public static Target CARD_CELULAR = Target.the("Card Celular")
            .located(By.id(":rr:"));

    public static Target BTN_AGREGAR = Target.the("Card Celular")
            .located(By.id(":R9j658p99gm:"));
    //*[@id=":R9j658p99gm:"]

    public static Target BTN_LOGIN = Target.the("Card Celular")
            .located(By.id(":R579:"));
    //*[@id=":R579:"]

    public static Target BTN_GOOGLE = Target.the("Card Celular")
            .located(By.xpath("//*[@id=\"login-form__oauth-container\"]/div"));
    //*[@id="gsi_188254_534225"]

}

package co.com.AutoFacebook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductoEnCarrito implements Question<Boolean> {

    public static final Target PRODUCTO_EN_CARRITO =
            Target.the("producto en el carrito")
                    .located(By.xpath("//*[@id='full_item_row_1']"));

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(PRODUCTO_EN_CARRITO, isVisible()).forNoMoreThan(10).seconds()
        );
        return WebElementQuestion.the(PRODUCTO_EN_CARRITO).answeredBy(actor).isVisible();
    }

    public static ProductoEnCarrito estaPresente() {
        return new ProductoEnCarrito();
    }
}


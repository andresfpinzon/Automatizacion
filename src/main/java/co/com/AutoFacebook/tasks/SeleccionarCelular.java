package co.com.AutoFacebook.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.AutoFacebook.userinterfaces.SeleccionCelular.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionarCelular implements Task {

    public static SeleccionarCelular enListaCelulares() {
        return Instrumented.instanceOf(SeleccionarCelular.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CARD_CELULAR),
                Click.on(BTN_AGREGAR),
                Click.on(BTN_LOGIN),
                WaitUntil.the(BTN_GOOGLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_GOOGLE)

        );
    }
}
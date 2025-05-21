package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.models.RangoValor;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterfaces.FiltroCelular.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SeleccionarFiltro implements Task {

    private final List<RangoValor> rangoValor;

    public SeleccionarFiltro(List<RangoValor> rangoValor) {
        this.rangoValor = rangoValor;
    }

    public static SeleccionarFiltro enCategoriasCelulares(List<RangoValor> rangoValor) {
        return Instrumented.instanceOf(SeleccionarFiltro.class).withProperties(rangoValor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACEPTAR_COOKIES),
                Click.on(NAV_MENU_CAT),
                Click.on(NAV_MENU_CAT_TEC),
                Click.on(NAV_MENU_CAT_TEC_CEL),
                Scroll.to(SECCION_PRECIO),
                Click.on(CARD_PRECIO),
                Click.on(INPUT_MIN_PRE),
                Enter.theValue(String.valueOf(rangoValor.get(0).getValormin())).into(INPUT_MIN_PRE),
                Click.on(INPUT_MAX_PRE),
                Enter.theValue(String.valueOf(rangoValor.get(0).getValormax())).into(INPUT_MAX_PRE),
                WaitUntil.the(FILTRAR_PRECIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FILTRAR_PRECIO)

        );
    }
}



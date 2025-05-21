package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.models.DatosSeleccionCelular;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterfaces.SeleccionCelular.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SeleccionarCelular implements Task {

    public SeleccionarCelular(List<DatosSeleccionCelular> datosSeleccion) {
        this.datosSeleccion = datosSeleccion;
    }

    private final List<DatosSeleccionCelular> datosSeleccion;

    public static SeleccionarCelular seleccionarCelular(List<DatosSeleccionCelular> datosSeleccion) {
        return Instrumented.instanceOf(SeleccionarCelular.class).withProperties(datosSeleccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_ACEPTAR_COOKIES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ACEPTAR_COOKIES),
                Click.on(NAV_MENU_CAT),
                Click.on(NAV_MENU_CAT_TEC),
                Click.on(NAV_MENU_CAT_TEC_CEL),
                Scroll.to(SECCION_PRECIO),
                Click.on(CARD_PRECIO),
                Click.on(INPUT_MIN_PRE),
                Enter.theValue(String.valueOf(datosSeleccion.get(0).getValormin())).into(INPUT_MIN_PRE),
                Click.on(INPUT_MAX_PRE),
                Enter.theValue(String.valueOf(datosSeleccion.get(0).getValormax())).into(INPUT_MAX_PRE),
                WaitUntil.the(FILTRAR_PRECIO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FILTRAR_PRECIO),
                Click.on(CARD_CELULAR),
                Click.on(BTN_AGREGAR),
                Click.on(BTN_LOGIN),
                WaitUntil.the(BTN_GOOGLE, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(BTN_GOOGLE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_GOOGLE),
                CambiarVentana.aNueva(),
                WaitUntil.the(INPUT_CORREO, isEnabled()).forNoMoreThan(10).seconds(),
                WaitUntil.the(INPUT_CORREO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(INPUT_CORREO),
                Enter.theValue(datosSeleccion.get(0).getUsuario()).into(INPUT_CORREO),
                Click.on(BTN_SIGUIENTE),
                WaitUntil.the(INPUT_CLAVE, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(INPUT_CLAVE, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(INPUT_CLAVE),
                Enter.theValue(datosSeleccion.get(0).getClave()).into(INPUT_CLAVE),
                Click.on(BTN_SIGUIENTE_P)
        );
    }

}
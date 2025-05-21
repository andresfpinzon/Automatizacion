package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.userinterfaces.InicioMercadoLibre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPgMercadoLibre implements Task {

    InicioMercadoLibre inicioMercadoLibre;

    public static AbrirPgMercadoLibre pagina(){
        return Tasks.instrumented(AbrirPgMercadoLibre.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(inicioMercadoLibre));
    }
}

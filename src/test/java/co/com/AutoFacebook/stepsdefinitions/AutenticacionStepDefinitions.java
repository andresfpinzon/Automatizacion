package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.tasks.AbrirPagina;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Facebook$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeFacebook() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.lapagina());

    }

    @Cuando("^ingrese las credenciales correctas \\(usuario y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasUsuarioYContrasena(DataTable arg1) {

    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Facebook$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPaginaDeInicioDeFacebook() {

    }
}

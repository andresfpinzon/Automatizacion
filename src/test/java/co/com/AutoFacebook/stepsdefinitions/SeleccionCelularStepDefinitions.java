package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.RangoValor;
import co.com.AutoFacebook.tasks.AbrirPgMercadoLibre;
import co.com.AutoFacebook.tasks.SeleccionarCelular;
import co.com.AutoFacebook.tasks.SeleccionarFiltro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionCelularStepDefinitions {
    @Dado("^que el usuario está en la página principal de Mercado Libre$")
    public void queElUsuarioEstáEnLaPáginaPrincipalDeMercadoLibre() {
        theActorInTheSpotlight().wasAbleTo(AbrirPgMercadoLibre.pagina());
    }

    @Cuando("^navega a través de las categorías Tecnología, Celulares y Teléfonos y aplica un filtro por precio maximo y minimo$")
    public void navegaATravésDeLasCategoríasTecnologíaCelularesYTeléfonosYAplicaUnFiltroPorPrecioMaximoYMinimo(List<RangoValor> rangovalor) {
        theActorInTheSpotlight().attemptsTo(SeleccionarFiltro.enCategoriasCelulares(rangovalor));
    }

    @Cuando("^selecciona un celular de la lista de resultados$")
    public void seleccionaUnCelularDeLaListaDeResultados() {
        theActorInTheSpotlight().attemptsTo(SeleccionarCelular.enListaCelulares());
    }

    @Cuando("^da clic en el botón Agregar al carrito$")
    public void daClicEnElBotónAgregarAlCarrito() {

    }

    @Cuando("^da clic en el botón Ingresar$")
    public void daClicEnElBotónIngresar() {

    }

    @Cuando("^selecciona la opción Continuar con Google$")
    public void seleccionaLaOpciónContinuarConGoogle() {

    }

    @Cuando("^elige la cuenta de Google deseada$")
    public void eligeLaCuentaDeGoogleDeseada() {

    }

    @Entonces("^el usuario debe estar autenticado y ver el producto en el carrito$")
    public void elUsuarioDebeEstarAutenticadoYVerElProductoEnElCarrito() {

    }

}

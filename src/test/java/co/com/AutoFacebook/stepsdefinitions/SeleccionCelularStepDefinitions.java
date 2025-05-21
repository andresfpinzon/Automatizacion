package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.CredencialesInicioSesion;
import co.com.AutoFacebook.models.DatosSeleccionCelular;
import co.com.AutoFacebook.models.RangoValor;
import co.com.AutoFacebook.questions.ProductoEnCarrito;
import co.com.AutoFacebook.tasks.*;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SeleccionCelularStepDefinitions {
    @Dado("^que el usuario está en la página principal de Mercado Libre$")
    public void queElUsuarioEstáEnLaPáginaPrincipalDeMercadoLibre() {
        theActorInTheSpotlight().wasAbleTo(AbrirPgMercadoLibre.pagina());
    }

    @Cuando("^navega a través de las categorías , selecciona un telefono y se autentica para realizar la compra$")
    public void navegaATravésDeLasCategoríasSeleccionaUnTelefonoYSeAutenticaParaRealizarLaCompra(List<DatosSeleccionCelular> datosSeleccion) {
        theActorInTheSpotlight().attemptsTo(SeleccionarCelular.seleccionarCelular(datosSeleccion));
    }

    @Entonces("^el usuario debe estar autenticado y ver el producto en el carrito$")
    public void elUsuarioDebeEstarAutenticadoYVerElProductoEnElCarrito() {
        theActorInTheSpotlight().attemptsTo(Ensure.that(ProductoEnCarrito.PRODUCTO_EN_CARRITO).isDisplayed());
    }


}

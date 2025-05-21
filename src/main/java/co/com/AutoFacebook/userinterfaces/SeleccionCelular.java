package co.com.AutoFacebook.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionCelular extends PageObject {

    public static Target BTN_ACEPTAR_COOKIES = Target.the("Botón Aceptar cookies")
            .located(By.xpath("/html/body/div[4]/div[1]/div/div[2]/button[1]"));

    public static Target NAV_MENU_CAT = Target.the(" Categorias ")
            .located(By.xpath("/html/body/header/div/div[5]/div/ul/li[1]/a"));

    public static Target NAV_MENU_CAT_TEC = Target.the(" Tecnologia")
            .located(By.xpath("/html/body/header/div/div[5]/div/ul/li[1]/div/ul/li[3]/a"));

    public static Target NAV_MENU_CAT_TEC_CEL = Target.the(" Celulares y Telefonos")
            .located(By.xpath("/html/body/header/div/div[5]/div/ul/li[1]/div/div/div/div/div[1]/div/a"));

    public static final Target SECCION_PRECIO = Target.the("sección de filtros por precio")
            .located(By.xpath("//*[@id='hub']/div[5]/div/section"));

    public static Target CARD_PRECIO = Target.the("Card de Precio")
            .located(By.xpath("/html/body/main/div/div[5]/div/section/div[2]/div/div[1]/a/div/div"));

    public static Target INPUT_MIN_PRE = Target.the(" Input de precio")
            .located(By.xpath("/html/body/main/div/div[2]/aside/section[2]/div[12]/ul/li[4]/form/div[1]/div/div/input"));

    public static Target INPUT_MAX_PRE = Target.the(" Input de precio")
            .located(By.xpath("/html/body/main/div/div[2]/aside/section[2]/div[12]/ul/li[4]/form/div[2]/div/div/input"));

    public static final Target FILTRAR_PRECIO = Target.the("sección de filtros por precio")
            .located(By.xpath("//*[@id=\"root-app\"]/div/div[2]/aside/section[2]/div[12]/ul/li[4]/form/div[3]/button"));

    public static Target CARD_CELULAR = Target.the("Card Celular")
            .located(By.xpath("/html/body/main/div/div[2]/section/div[5]/ol/li[2]/div/div/div"));

    public static Target BTN_AGREGAR = Target.the("Boton Agregar al carrito")
            .located(By.id(":R9j658p99gm:"));

    public static Target BTN_LOGIN = Target.the("Boton de iniciar sesion")
            .located(By.id(":R579:"));

    public static Target BTN_GOOGLE = Target.the("Botón Google")
            .located(By.cssSelector("div[role=button]"));

    public static Target INPUT_CORREO = Target.the("Input para el correo")
            .located(By.cssSelector("input[type='email']"));

    public static Target BTN_SIGUIENTE = Target.the("Boton continuar correo")
            .located(By.id("identifierNext"));

    public static Target INPUT_CLAVE = Target.the("Ingreso del password")
            .located(By.cssSelector("input[type='password']"));

    public static Target BTN_SIGUIENTE_P = Target.the("Boton continuar contrasena")
            .located(By.id("passwordNext"));

}

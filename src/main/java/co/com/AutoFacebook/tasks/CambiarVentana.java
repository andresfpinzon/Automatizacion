package co.com.AutoFacebook.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CambiarVentana implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        String ventanaPrincipal = driver.getWindowHandle();
        Set<String> ventanas = driver.getWindowHandles();

        for (int i = 0; i < 10 && ventanas.size() <= 1; i++) {
            try {
                Thread.sleep(1000); // espera 1 segundo
                ventanas = driver.getWindowHandles();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (String handle : ventanas) {
            if (!handle.equals(ventanaPrincipal)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public static CambiarVentana aNueva() {
        return new CambiarVentana();
    }
}



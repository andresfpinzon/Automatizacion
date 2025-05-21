package co.com.AutoFacebook.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ScrollConJavaScript implements Task {

    private final Target target;

    public ScrollConJavaScript(Target target) {
        this.target = target;
    }

    public static ScrollConJavaScript hasta(Target target) {
        return new ScrollConJavaScript(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement element = target.resolveFor(actor);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
    }
}


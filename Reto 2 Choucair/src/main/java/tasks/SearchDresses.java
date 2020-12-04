package tasks;

import interactions.Wait;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SearchDressesPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchDresses implements Task {


      private String   id= "fancybox-iframe";

    public static SearchDresses ThePage() {

        return instrumented(SearchDresses.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        ChromeDriver driver = (ChromeDriver) BrowseTheWeb.as(actor).getDriver();

        actor.attemptsTo(Click.on(SearchDressesPage.LINK_DRESS),
                 Click.on(SearchDressesPage.IMG_DRESS));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.className(id)));
        actor.attemptsTo( Click.on(SearchDressesPage.CART));
        driver.switchTo().defaultContent();

    }
}

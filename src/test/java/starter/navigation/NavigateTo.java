package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable thePhpTravelsLoginPage() {
        return Task.where("{0} opens the phptravels login page",
                Open.browserOn().the(PhpTravelsLoginPage.class)
        );
    }
}
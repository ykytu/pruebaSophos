package co.com.prueba.expedia.user_interface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class ExpediaHomePage extends PageObject {

    public static final Target BUTTON_POPUP_WINDOW = Target.the("align-right secondary slidedown-button").located(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]"));
    public static final Target SEARCH_INPUT = Target.the("Option input to search the product").located(By.id("search-autocomplete-input"));
    public static final Target FLYINGFROM_FIELD = Target.the("Text field flight origin").located(By.id("flight-origin-hp-flight"));
    public static final Target FLYINGTO_FIELD = Target.the("Text field flight destination").located(By.id("flight-destination-hp-flight"));
    public static final Target DATE_FIELD = Target.the("Text field date").located(By.id("flight-departing-single-hp-flight"));
    public static final Target BUTTON_SEARCH = Target.the("Button search").locatedBy("//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']");
    public static final Target ERROR_MESSAGE = Target.the("Error Message").locatedBy("//h5[@class='alert-title no-outline']");

}																					 
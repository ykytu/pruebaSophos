package co.com.prueba.expedia.tasks;

import co.com.prueba.expedia.model.ExpediaData;
import co.com.prueba.expedia.user_interface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.expedia.user_interface.ExpediaHomePage.SEARCH_INPUT;

public class CompleteTheForm implements Task {

    List<ExpediaData> expediaData;

    public CompleteTheForm (List<ExpediaData> expediaData ){

        this.expediaData = expediaData;

    }
     @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                Enter.theValue(expediaData.get(0).getProduct()).into(SEARCH_INPUT)

        );
    }

    public static CompleteTheForm with(List<ExpediaData> expediaData){
        return Tasks.instrumented(CompleteTheForm.class, expediaData);
    }
}

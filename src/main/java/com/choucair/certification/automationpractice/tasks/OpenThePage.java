package com.choucair.certification.automationpractice.tasks;

import com.choucair.certification.automationpractice.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePage implements Task {

    private HomePage homePage;

    public static OpenThePage Automationpractice() {
        return Tasks.instrumented(OpenThePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }
}
